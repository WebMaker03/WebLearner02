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
       
        // ���� ������ ç���� ���� �޾ƿͼ� MyC�� �ѱ��..?
		int c_code = Integer.parseInt(request.getParameter("c_code"));
        System.out.println("c_Code"+ c_code);
        
        int u_code = Integer.parseInt(request.getParameter("u_code"));
        System.out.println("u_Code"+ u_code);
        
//        MyC mc = ;
//        request.setAttribute("MyC", mc);
        
        
        forward.setRedirect(true); // �����ϴ°��� ������ false, ������ true 
        forward.setPath("Board_write.jsp");
        return forward;
	}

}
