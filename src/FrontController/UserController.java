package FrontController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import DAO.UserDAO;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class UserController extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#HttpServlet()
    */
   public UserController() {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // TODO Auto-generated method stub
      actionDo(request, response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // TODO Auto-generated method stub
      actionDo(request, response);
   }

   private void actionDo(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // TODO Auto-generated method stub
      String uri = request.getRequestURI();
      String cp = request.getContextPath(); // 臾몄옄�뿴 �옒�씪�궡湲� �쐞�빐
      String action = uri.substring(cp.length());
      ActionForward forward = null;

      if (action.equals("/main.do")) { // 硫붿씤�솕硫� �뿰寃�- 湲고� 而⑦듃濡ㅻ윭 
         // 硫붿씤�쓣 蹂댁뿬二쇰뒗 �븷 �샇異�
         try {
            forward = new MainAction().execute(request, response);
         } catch (Exception e) {
            e.printStackTrace();
         }

      } else if (action.equals("/checkid.do")) {// 以묐났 泥댄겕 �뿰寃� _ �쉶�썝媛��엯 user controller
         String userid = request.getParameter("userId");
         System.out.println(userid);

         JSONObject obj = new JSONObject();
         UserDAO udao = new UserDAO();
         if (udao.checkId(userid)) { 

            obj.put("result", "0"); 
         

         } else {
            obj.put("result", "1"); 
         }
         response.getWriter().print(obj);
      } else if (action.equals("/signup.do")) { // 회원가입 

    	  try {
              forward = new SignUpAction().execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }

      } else if (action.equals("/showuser.do")) { //회원정보 보여주기
         try {
            forward = new ShowUserAction().execute(request, response);
         } catch (Exception e) {
            e.printStackTrace();
         }

      } else if(action.equals("/updateuser.do")) {	
    	  try {
              forward = new ShowUserAction().execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
      }else if(action.equals("/login.do")) {	//로그인
    	  try {
              forward = new LoginAction().execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
      }else if(action.equals("/logout.do")) { //로그아웃
    	  try {
              forward = new LogoutAction().execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
      }
    	  

      else {
      
         forward = new ActionForward();
         forward.setRedirect(false);
         forward.setPath("/error/error404.jsp");
      }

      if (forward != null) {
         if (forward.isRedirect()) { 
   
            response.sendRedirect(forward.getPath());
         } else { 
            RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath()); // request �옱�꽕�젙
            dispatcher.forward(request, response);

         }
      }
   }
}