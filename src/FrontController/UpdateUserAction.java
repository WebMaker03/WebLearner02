package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;
import DTO.Users;

public class UpdateUserAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward(); 
		
		UserDAO udao = new UserDAO();
		Users newUser = new Users();
		Users loginUser = new Users();
		String pwCheck = "";
		if(loginUser.getUserpw()== pwCheck) {	
			newUser.setUserid(request.getParameter("updateName"));
			newUser.setUserpw(request.getParameter("updateEmail"));
			newUser.setAge(Integer.parseInt(request.getParameter("updateAge")));
			newUser.setUserid(loginUser.getUserid());
			
			if(udao.updateUser(newUser)) {
				forward.setRedirect(false);
				forward.setPath("Main.jsp");
			}	else {
				forward.setRedirect(true); 
				forward.setPath("Main.jsp");
			};
			
		} else {
		}
		return forward;
	}
}