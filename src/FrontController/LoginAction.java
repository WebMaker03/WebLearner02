package FrontController;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UserDAO;
import DTO.Users;

public class LoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Login Action ����");
		ActionForward forward = new ActionForward();
		UserDAO udao = new UserDAO();
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("userpw");

		if (udao.login(userid, passwd)) {
			// �α��� ����
			HttpSession session = request.getSession();
			System.out.println("�α���");
			if (udao.login(userid, passwd)) {
				Users user = udao.showUser(userid);
				if(user!= null) {
				session.setAttribute("session_user", user);
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setPath("main.etc");}

			} 
		}else {
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				//out.println("<script>alert('�α��� ����');</script>");// ���� ȭ������ ���ư���.
				forward.setRedirect(true);
				forward.setPath("login.jsp");
			}

			return forward;
		}

}
