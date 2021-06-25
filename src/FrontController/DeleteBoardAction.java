package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.Post;

public class DeleteBoardAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		int p_code = Integer.parseInt(request.getParameter("p_code"));

		BoardDAO bdao = new BoardDAO();
		
		Post p = bdao.getOneP(p_code);
		System.out.println("delete Action");
		bdao.delP(p_code);
		
		request.setAttribute("p_code", p_code);
		
		forward.setRedirect(false);
		forward.setPath("goBoard.bo?c_code="+p.getC_code());
		
		return forward;
	}

}
