package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ChallengesDAO;
import DTO.Challenges;

public class StartChallengeAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ActionForward forward= new ActionForward(); 
		ChallengesDAO cdao = new ChallengesDAO();
		int c_code = Integer.parseInt(request.getParameter("c_code"));
		Challenges ch = cdao.getonechal(c_code);
		String u_code = request.getParameter("u_code");
		
		cdao.start_ch(ch, u_code);
		
		forward.setRedirect(false);
		System.out.println("@@@@@");
		forward.setPath("theme.jsp");
		System.out.println("*****");
		return forward;
	}

}
