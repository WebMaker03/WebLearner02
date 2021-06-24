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
		
	request.getSession().setAttribute("newPost", "게시글이 등록되었습니다.");
		
		if(bdao.insertP(p)) {			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('게시글 등록 성공');location.href='Board_Chall.jsp';</script>");
			out.flush();
		}else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('게시글등록 실패');location.href='Board_Chall.jsp';</script>");
			out.flush();
		}
		
        
        
//        forward.setRedirect(true); // 저장하는값이 있으면 false, 없으면 true 
//        forward.setPath("Board_Chall.jsp");
        return forward;
	}

}
