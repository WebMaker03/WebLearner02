package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import DTO.Challenges;
import DTO.MyC;
import DTO.Users;;

public class ChallengesDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;

	public Challenges getonechal(int c_code) {
		Challenges ch = new Challenges();
		try {
			conn = DBConnection.connect();
			String sql="select * from challenges where c_code=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c_code);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				
				ch.setC_code(rs.getInt("c_code"));
				ch.setC_name(rs.getString("c_name"));
				ch.setTheme(rs.getString("theme"));
				ch.setFee(rs.getInt("fee"));
				ch.setPeriod(rs.getInt("period"));
				ch.setInfo(rs.getString("info"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ch;

	}
	// challenges DB가 아닌 myC DB로 들어가야 함!!
	public boolean start_ch(Challenges ch, String u_code) {
		try {
			conn = DBConnection.connect();
			String sql = "insert into myC(c_code,u_code,state,startD,finishD,achievementPercentage,img) values(?,?,1,now(),DATE_ADD(now(),INTERVAL ? DAY),0,null);";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, ch.getC_code());
			pstmt.setInt(2, Integer.parseInt(u_code));
			pstmt.setInt(3, ch.getPeriod());

			pstmt.executeUpdate();
			System.out.println("@!#@#");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return true;
		}
	}

	public ArrayList<Challenges> theme_chal(String theme) {

		ArrayList<Challenges> datas = new ArrayList();
		try {
			conn = DBConnection.connect();
			String sql = "select * from challenges where theme=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, theme);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Challenges ch = new Challenges();
				ch.setC_code(rs.getInt("c_code"));
				ch.setC_name(rs.getString("c_name"));
				ch.setTheme(rs.getString("theme"));
				ch.setFee(rs.getInt("fee"));
				ch.setPeriod(rs.getInt("period"));
				ch.setInfo(rs.getString("info"));
				datas.add(ch);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return datas;
	}
	public boolean byebyechallenge() {
		conn = DBConnection.connect();
		PreparedStatement pstmt2 = null;
		String sql = "select * from myC where state=? and finishD <= NOW()";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setBoolean(1, true);
			ResultSet rs = pstmt.executeQuery();
			ArrayList<MyC> myClist = new ArrayList<>();
			while (rs.next()) {
				MyC myc = new MyC();
				myc.setMc_code(rs.getInt("mc_code"));
//			myc.setC_code(rs.getInt("c_code"));
//			myc.setU_code(rs.getInt("u_code"));
//			myc.setState(rs.getBoolean("state"));
//			myc.setFee(rs.getInt("fee"));
//			myc.setPeriod(rs.getInt("period"));
//			myc.setStartD(rs.getString("startD"));
//			myc.setFinishD(rs.getString("finishD"));
//			myc.setAchievementPercentage(rs.getInt("achievementPercentage"));
				myClist.add(myc);
			}
			boolean success = true;
			String sql2 = "update myC set state=false where mc_code=?";
			pstmt2 = conn.prepareStatement(sql2);

			for (int i = 0; i < myClist.size(); i++) {
				pstmt2.setInt(1, myClist.get(i).getMc_code());
				success = pstmt2.execute();

			}
			return success;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	// 현재진행중 리스트 반환값 datas
	public ArrayList<MyC> prochal(String userid) {
		ArrayList<MyC> datas = new ArrayList();
		try {
			conn = DBConnection.connect();
			String sql = "select * from myC where state=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setBoolean(1, true);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				MyC myc = new MyC();
				myc.setMc_code(rs.getInt("mc_code"));
				myc.setC_code(rs.getInt("c_code"));
				myc.setU_code(rs.getInt("u_code"));
				myc.setState(rs.getBoolean("state"));
				myc.setStartD(rs.getString("startD"));
				myc.setFinishD(rs.getString("finishD"));
				myc.setAchievementPercentage(rs.getInt("achievementPercentage"));
				datas.add(myc);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return datas;

	}

	// 종료된챌린지 리스트 반환값 datas
	public ArrayList<MyC> finchal(String userid) {
		ArrayList<MyC> datas = new ArrayList();
		try {
			conn = DBConnection.connect();
			String sql = "select * from myC where state=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setBoolean(1, false);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				MyC myc = new MyC();
				myc.setMc_code(rs.getInt("mc_code"));
				myc.setC_code(rs.getInt("c_code"));
				myc.setU_code(rs.getInt("u_code"));
				myc.setState(rs.getBoolean("state"));
				myc.setStartD(rs.getString("startD"));
				myc.setFinishD(rs.getString("finishD"));
				myc.setAchievementPercentage(rs.getInt("achievementPercentage"));
				datas.add(myc);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return datas;

	}
	
	// 진행중 챌린지 갯수 int cnt 반환
	public int cntprochal(int u_code) {
		int cnt=0;
		try {
			conn=DBConnection.connect();
			String sql = "select count(*)  from myc where u_code = ? and state=true";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, u_code);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				cnt= rs.getInt(1);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}
	// 종료된 챌린지 갯수 int cnt 반환
	public int cntfinchal(int u_code) {
		int cnt=0;
		try {
			conn=DBConnection.connect();
			String sql = "select count(*)  from myc where u_code = ? and state=false";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, u_code);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				cnt= rs.getInt(1);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}
	
}
