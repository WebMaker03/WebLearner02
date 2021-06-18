
package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ChallengesDAO;

public class StartAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("Start Action 시작");
		ActionForward forward= new ActionForward();
		ChallengesDAO ch = new ChallengesDAO();
		if(!ch.byebyechallenge()) {
			System.out.println("진행중 -> 종료로 업데이트 실패");
		}else {
			System.out.println("진행중 -> 종료로 업데이트 성공");
		}
		
		forward.setRedirect(true); 
		forward.setPath("main.etc");
		return forward;
	}

}