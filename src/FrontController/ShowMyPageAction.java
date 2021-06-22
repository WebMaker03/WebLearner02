package FrontController;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ChallengesDAO;
import DTO.Challenges;
import DTO.MyC;

public class ShowMyPageAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionForward forward= new ActionForward(); 
		String userid = request.getParameter("userid");
		ChallengesDAO cdao = new ChallengesDAO();
		ArrayList<MyC> myClist = cdao.prochal(userid);
		request.setAttribute("pro_chalList", myClist);
		ArrayList<Challenges> Clist = cdao.getChalName(myClist);
		request.setAttribute("pro_chalList_C", Clist); // 진행중 챌린지에 대한 챌린지 정보를 담은 리스트
		
		// 종료된 챌린지 가져오기 
		ArrayList<MyC> EndList= cdao.finchal(userid);
		request.setAttribute("end_chalList", EndList);
		
		ArrayList<Challenges> EndList_D = cdao.getChalName(EndList);
		request.setAttribute("end_chalList_D", EndList_D);
		
		forward.setRedirect(false); 
		forward.setPath("mypage.jsp");
		return forward;
		
	}

}
