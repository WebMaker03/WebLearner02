package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DAO.ChallengesDAO;
import DTO.Challenges;

public class goBoardAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward(); 
        
        int c_code = Integer.parseInt(request.getParameter("c_code"));
        System.out.println("c_Code"+ c_code);
      //	�Խñ� �����ͼ� request.Set�ؾߵ�.
        
        BoardDAO bdao =new BoardDAO(); // boardDao���� �ش������� �ش� ç������ �ۼ��� �Խñ� 
        // u_code ��  c_code �Ѱ� ��ߤ�������
        
        
        forward.setRedirect(true); // �����ϴ°��� ������ false, ������ true 
        forward.setPath("Board_Chall.jsp");
        return forward;
	}

}
