package FrontController;

import javax.servlet.http.HttpSession;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogoutAction implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionForward forward = new ActionForward();
		//���ǿ� ����ִ� ���� �ʱ�ȭ
		
		HttpSession session =request.getSession();
		session.invalidate(); // ���� ����, �޸� ������ ������ �ƴ϶� �ش� ���� ���� ��ȿȭ��� ������ ��Ȯ
		//session.removeAttribute("uid"); �̷��� �ص� ��. �̰� �Ӽ��� ����, ������ �������.
		forward.setPath("main.etc");
		forward.setRedirect(false);
		
	/*	response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<script>alert('�α׾ƿ� �Ǿ����ϴ�.');</script>");*/
		
		return forward;
	}
	
}
