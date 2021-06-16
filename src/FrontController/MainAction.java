package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward= new ActionForward(); //객체는 미리 생성
		
		forward.setRedirect(true); // true- 반환하는 객체 없음 / false-반환하는 객체가 있음을 의미
		forward.setPath("main.jsp");
		return forward;
	}

}