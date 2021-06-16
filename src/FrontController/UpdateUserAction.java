package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;
import DTO.Users;

public class UpdateUserAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward(); //객체는 미리 생성
		
		UserDAO udao = new UserDAO();
		Users newUser = new Users();
		Users loginUser = new Users();
		String pwCheck = "";
		if(loginUser.getPw()== pwCheck) {	// pwCheck을 이렇게 해도 될까..?
			newUser.setId(request.getParameter("updateName"));
			newUser.setPw(request.getParameter("updateEmail"));
			newUser.setAge(Integer.parseInt(request.getParameter("updateAge")));
			newUser.setId(loginUser.getId());
			
			if(udao.updateUser(newUser)) {
				forward.setRedirect(false);
				request.getSession().setAttribute("msg", "회원정보 수정 실패");
				forward.setPath("Main.jsp");
			}	else {
				forward.setRedirect(true); // true- 반환하는 객체 없음 / false-반환하는 객체가 있음을 의미
				request.getSession().setAttribute("msg", "회원정보 수정 완료");
				forward.setPath("Main.jsp");
			};
			
		} else {
			request.getSession().setAttribute("msg", "비밀번호를 확인해주세요.");
			// 수정하기 전 페이지로 이동.
			//out.println("<script>history.go(-1);</script>");
		}
		return forward;
	}
}
