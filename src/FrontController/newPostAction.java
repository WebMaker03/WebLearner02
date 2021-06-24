package FrontController;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DAO.ChallengesDAO;
import DTO.Challenges;
import DTO.Post;
import DTO.Users;

public class newPostAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward(); 
       
        // 유저 정보랑 챌린지 정보 받아와서 MyC값 넘기기..?
		int c_code = Integer.parseInt(request.getParameter("c_code"));
        System.out.println("c_Code"+ c_code);
        
        int u_code = Integer.parseInt(request.getParameter("u_code"));
        System.out.println("u_Code"+ u_code);
        
//        MyC mc = ;
//        request.setAttribute("MyC", mc);
        
        
        forward.setRedirect(true); // 저장하는값이 있으면 false, 없으면 true 
        forward.setPath("Board_write.jsp");
        return forward;
	}

}
