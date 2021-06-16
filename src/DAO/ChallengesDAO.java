package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.Challenges;
import DTO.MyC;
import DAO.DBConnection;;


public class ChallengesDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	// ç���� ����
	public boolean start_ch(Challenges ch) {
		try {
			conn=DBConnection.connect();
		String sql = "insert into challenges(c_name,theme,fee,period) values(?,?,?,?);";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, ch.getC_name());
			pstmt.setString(2, ch.getTheme());
			pstmt.setInt(3, ch.getFee());
			pstmt.setInt(4, ch.getPeriod());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
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
	// �׸��� ç���� �����ֱ� 
	public ArrayList<Challenges> theme_chal(String theme){

	      ArrayList<Challenges> datas=new ArrayList();
	      try {
	         conn=DBConnection.connect();
	         String sql="select * from challenges where theme=?";
	         pstmt=conn.prepareStatement(sql);

	         pstmt.setString(1, theme);


	         ResultSet rs=pstmt.executeQuery();
	         while(rs.next()) {
	           Challenges ch = new Challenges();

	            ch.setC_name(rs.getString("c_name"));
	            ch.setTheme(rs.getString("theme"));
	            ch.setFee(rs.getInt("fee"));
	            ch.setPeriod(rs.getInt("period"));

	            datas.add(ch);

	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      finally {
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
	// ������ ç���� �߿��� ��¥���� ������ ����� ç������ �̵�
	// �ϴ� �޼����� ����Ʈ������
	public boolean byebyechallenge() {
		conn=DBConnection.connect();
		PreparedStatement pstmt2 = null;
		String sql = "select * from myC where state=? and finishD <= NOW()";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setBoolean(1, true);
			ResultSet rs = pstmt.executeQuery();
			ArrayList<MyC> myClist = new ArrayList<>(); 
			while(rs.next()) {
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
			boolean success=true;
			String sql2 = "update myC set state=false where mc_code=?";
			pstmt2 = conn.prepareStatement(sql2);

			for(int i=0;i<myClist.size();i++) {
				System.out.println("testing");
				pstmt2.setInt(1, myClist.get(i).getMc_code());
				success=pstmt2.execute();
			
			}
			return success;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
	}
}
