package FrontController;

import javax.servlet.http.HttpSession;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogoutAction implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionForward forward = new ActionForward();
		//세션에 들어있는 값을 초기화
		
		HttpSession session =request.getSession();
		session.invalidate(); // 세션 삭제, 메모리 해제의 개념이 아니라 해당 값에 대해 무효화라는 개념이 정확
		//session.removeAttribute("uid"); 이렇게 해도 됨. 이건 속성만 제거, 세션은 살아있음.
		forward.setPath("main.etc");
		forward.setRedirect(false);
		
	/*	response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<script>alert('로그아웃 되었습니다.');</script>");*/
		
		return forward;
	}
	
}
