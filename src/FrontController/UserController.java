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
      String cp = request.getContextPath(); // 문자열 잘라내기 위해
      String action = uri.substring(cp.length());
      ActionForward forward = null;

      if (action.equals("/main.do")) { // 메인화면 연결- 기타 컨트롤러 
         // 메인을 보여주는 애 호출
         try {
            forward = new MainAction().execute(request, response);
         } catch (Exception e) {
            e.printStackTrace();
         }

      } else if (action.equals("/checkid.do")) {// 중복 체크 연결 _ 회원가입 user controller
         String userid = request.getParameter("id");
         System.out.println(userid);

         JSONObject obj = new JSONObject();
         UserDAO udao = new UserDAO();
         if (udao.checkId(userid)) { // false가 전달되면 중복이란 뜻
            obj.put("result", "0"); // 중복이면 1전달
         } else {
            obj.put("result", "1"); // 중복이면 1전달
         }
         response.getWriter().print(obj);
      } else if (action.equals("/signup.do")) { // 회원가입 user_controller
    	  try {
              forward = new SignUpAction().execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
      } else if (action.equals("/showuser.do")) { //user_controller
         try {
            forward = new ShowUserAction().execute(request, response);
         } catch (Exception e) {
            e.printStackTrace();
         }

      }

      else {
         // 에러 페이지로 이동 시킴. ( 페이지가 없을 경우) -> 404
         forward = new ActionForward();
         forward.setRedirect(false);
         forward.setPath("/error/error404.jsp");
      }

      if (forward != null) {
         if (forward.isRedirect()) { // 전달할 객체가 있니? 없는 경우
            System.out.println("test");
            response.sendRedirect(forward.getPath());
         } else { // 전달할 정보가 있는 경우
            RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath()); // request 재설정
            dispatcher.forward(request, response);

         }
      }
   }
}