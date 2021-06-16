
package FrontController;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ChallengesDAO;

public class CallThemeAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ActionForward forward= new ActionForward(); 
		
		String themeName = request.getParameter("theme");
		request.setAttribute("show_theme_name", themeName);
		
		ChallengesDAO cdao = new ChallengesDAO();
		
		ArrayList cInfo = cdao.theme_chal(themeName);
		request.setAttribute("show_challenge", cInfo);
		
		forward.setRedirect(false); 
		forward.setPath("theme_detail.jsp");
		return forward;
	}

}
