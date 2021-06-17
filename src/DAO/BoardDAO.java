package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.*;

public class BoardDAO {
	
	Connection conn;
	PreparedStatement pstmt;
	
	// * 게시글 조회 * 
	public ArrayList<MessageSet> getAll(int cnt){

		ArrayList<MessageSet> datas=new ArrayList();
		try {
			conn=DBConnection.connect();
			String sql="select * from post limit 0,?";
			pstmt=conn.prepareStatement(sql);

			pstmt.setInt(1, cnt);

			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				MessageSet ms=new MessageSet();
				Post p=new Post();

				//작업필요
			//	p.setP_text(rs.get);

				ArrayList<Comments> clist=new ArrayList();

				String sql2="select * from comments where cm_code=? order by date desc";
				pstmt=conn.prepareStatement(sql2);
				pstmt.setInt(1, rs.getInt("cm_code"));
				ResultSet rs2=pstmt.executeQuery();
				
				//작업필요
				
				ms.setMessage(p);
				//ms.setRlist(ct);

				datas.add(ms);

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
	
	
	// * 게시글 등록 *
	public boolean insertP(Post p){
		try {
			conn=DBConnection.connect();
			String sql="insert into post (u_code, b_code, b_text) values(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, p.getU_code());
			pstmt.setInt(2, p.getB_code());
			pstmt.setString(3,p.getP_text());
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
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
		return true;
	}
	                
	// * 게시글 수정 *
	                
	// * 게시글 삭제 *
	public boolean delP(int p_code){
		try {
			conn=DBConnection.connect();
			String sql="delete from post where p_code=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, p_code);
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
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
		return true;
	}
	
	               
	// * 댓글 등록   *
	public boolean insertCM(Comments cm){
		try {
			conn=DBConnection.connect();
			String sql="insert into comments (u_code, p_code, cm_text) values(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, cm.getU_code());
			pstmt.setInt(2, cm.getP_code());
			pstmt.setString(3, cm.getCm_text());
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
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
		return true;
	}
	              
	// * 댓글 삭제   *
		public boolean delCM(int cm_code){
			try {
				conn=DBConnection.connect();
				String sql="delete from reply where cm_code=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, cm_code);
				pstmt.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
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
			return true;
		}
	                 

}
