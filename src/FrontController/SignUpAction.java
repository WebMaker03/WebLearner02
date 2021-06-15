package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;

import DTO.Users;
public class SignUpAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward(); //��ü�� �̸� ����
		
		UserDAO udao = new UserDAO();
		Users newUser = new Users();
		
		newUser.setId(request.getParameter("id"));
		newUser.setPw(request.getParameter("pw1"));
		newUser.setU_name(request.getParameter("userName"));
		newUser.setAge(Integer.parseInt(request.getParameter("userAge")));
		newUser.setEmail(request.getParameter("userEmail"));
		
		udao.SignUp(newUser);
		
		forward.setRedirect(true); // true- ��ȯ�ϴ� ��ü ���� / false-��ȯ�ϴ� ��ü�� ������ �ǹ�
		request.getSession().setAttribute("msg", "ȸ�������� �����մϴ�.");
		forward.setPath("Main.jsp");

		// ���� �޼��� ���??
		return forward;
	}

}
