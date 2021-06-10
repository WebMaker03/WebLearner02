package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward= new ActionForward(); //��ü�� �̸� ����
		
		forward.setRedirect(true); // true- ��ȯ�ϴ� ��ü ���� / false-��ȯ�ϴ� ��ü�� ������ �ǹ�
		forward.setPath("main.jsp");
		return forward;
	}

}
