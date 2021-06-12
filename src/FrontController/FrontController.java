package FrontController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = request.getRequestURI();
		String cp = request.getContextPath(); // ���ڿ� �߶󳻱� ����
		String action = uri.substring(cp.length()); 
		ActionForward forward = null;
		
		if (action.equals("/main.do")) {
			// ������ �����ִ� �� ȣ��
			try {
				forward = new MainAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}else if(action.equals("/checkid.do")) {
			String name=request.getParameter("userId");
			JSONObject obj = new JSONObject();
			// ���⼭ dao ȣ�� �� ���ް� �޸����ָ� �ɵ�!( �ٿ����� ���� ������	1 ����)
			obj.put("result", "1"); //�ߺ��̸� 1����
			// �ߺ��� �ƴϸ�? 0����?
			response.getWriter().print(obj);
		}
		else {
			// ���� �������� �̵� ��Ŵ. ( �������� ���� ���) -> 404
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/error/error404.jsp");
		}
		
		if(forward!=null) {
			if(forward.isRedirect()) { //������ ��ü�� �ִ�? ���� ���
				System.out.println("test");
				response.sendRedirect(forward.getPath());
			}else { //������ ������ �ִ� ���
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath()); //request �缳��
				dispatcher.forward(request, response);
				
			}
		}
	}
}
