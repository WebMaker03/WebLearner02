package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ChallengesDAO;
import DTO.Challenges;

public class goBoardAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward(); 
        
        int c_code = Integer.parseInt( request.getParameter("c_code"));
        
      //	게시글 가져와서 request.Set해야됨.
        
        forward.setRedirect(true); 
        forward.setPath("Board_Chall.jsp");
        return forward;
	}

}
