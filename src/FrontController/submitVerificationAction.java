package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ChallengesDAO;
import DTO.Challenges;

public class submitVerificationAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward(); 
		
		forward.setRedirect(false);
		forward.setPath("index.jsp");
		return forward;
	}

}
