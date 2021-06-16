package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CallThemeAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward(); 
		
		String themeName = request.getParameter("theme");
		request.setAttribute("show_theme_name", themeName);
		
		
		forward.setRedirect(false); // true- ��ȯ�ϴ� ��ü ���� / false-��ȯ�ϴ� ��ü�� ������ �ǹ�
		forward.setPath("theme_detail.jsp");
		return forward;
	}

}
