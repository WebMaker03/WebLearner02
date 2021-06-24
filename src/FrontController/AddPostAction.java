package FrontController;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.BoardDAO;
import DTO.Post;
import DTO.Users;

public class AddPostAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward= new ActionForward(); 
		
		int c_code = Integer.parseInt(request.getParameter("c_code"));
        System.out.println("c_Code"+ c_code);
        
		
		BoardDAO bdao = new BoardDAO();
		Post p = new Post();
		
		HttpSession session =request.getSession();
        Users user = (Users)session.getAttribute("session_user");
		
		p.setU_code(user.getU_code());
		p.setC_code(c_code);
		p.setP_title(request.getParameter("p_title"));
		p.setP_text(request.getParameter("p_text"));
		
	request.getSession().setAttribute("newPost", "�Խñ��� ��ϵǾ����ϴ�.");
		
		if(bdao.insertP(p)) {			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('�Խñ� ��� ����');location.href='Board_Chall.jsp';</script>");
			out.flush();
		}else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('�Խñ۵�� ����');location.href='Board_Chall.jsp';</script>");
			out.flush();
		}
		
        
        
//        forward.setRedirect(true); // �����ϴ°��� ������ false, ������ true 
//        forward.setPath("Board_Chall.jsp");
        return forward;
	}

}