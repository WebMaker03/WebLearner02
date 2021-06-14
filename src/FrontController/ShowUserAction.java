package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;
import DTO.Users;

public class ShowUserAction implements Action {

   @Override
   public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
      ActionForward forward = new ActionForward(); // ��ü�� �̸� ����

      UserDAO udao  = new UserDAO();
      String userid= request.getParameter("userid");
      Users user= udao.showUser(userid);
      
      request.setAttribute("show_user", user); 
      forward.setRedirect(false); // true- ��ȯ�ϴ� ��ü ���� / false-��ȯ�ϴ� ��ü�� ������ �ǹ�
      forward.setPath("test.jsp");
      return forward;
   }

}