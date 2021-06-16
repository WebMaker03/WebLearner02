package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ChallengesDAO;

public class MainAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("Main Action ����");
		ActionForward forward= new ActionForward();
		forward.setRedirect(true); 
		forward.setPath("main.jsp");
		return forward;
	}

}