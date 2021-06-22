package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;
import DTO.Users;

public class ShowUserAction implements Action {

   @Override
   public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
      ActionForward forward = new ActionForward(); // 객체는 미리 생성

      UserDAO udao  = new UserDAO();
      String userid= request.getParameter("userid");
      Users user= udao.showUser(userid);
      
      request.setAttribute("show_user", user); 
      forward.setRedirect(false); // true- 반환하는 객체 없음 / false-반환하는 객체가 있음을 의미
      forward.setPath("test.jsp");
      return forward;
   }

}