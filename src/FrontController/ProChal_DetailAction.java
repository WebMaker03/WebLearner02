package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ChallengesDAO;
import DAO.VerificationDAO;
import DTO.Challenges;
import DTO.Verification;

public class ProChal_DetailAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward= new ActionForward(); 
         
         int c_code = Integer.parseInt( request.getParameter("c_code"));
         int mc_code = Integer.parseInt(request.getParameter("mc_code"));
         
         ChallengesDAO cdao = new ChallengesDAO();
         Challenges ch = cdao.getonechal(c_code);
         request.setAttribute("pro_chal_D",ch);
         
         VerificationDAO vdao = new VerificationDAO();
        // vdao. //usercode¶û c_Code
         
         forward.setRedirect(false); 
         forward.setPath("Prochal_detail.jsp");
         return forward;
		
		
	}

}
