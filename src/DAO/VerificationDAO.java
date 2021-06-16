package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.Post;
import DTO.Verification;

public class VerificationDAO {

	Connection conn;
	PreparedStatement pstmt;
	
	// *인증 등록하기*
	public boolean insertV(Verification ver) {
		try {
			conn=DBConnection.connect();
			String sql="insert into verification(u_code, mc_code, v_text, v_img) values (?, ?, ?, ?);";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, ver.getU_code());
			pstmt.setInt(2, ver.getMc_code());
			pstmt.setString(3, ver.getV_text());
			pstmt.setString(4, ver.getV_img());
			
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
	
	// *인증 조회하기*
	public ArrayList<Verification> showV() {
		
		ArrayList<Verification> datas=new ArrayList();
		
		try {
			conn=DBConnection.connect();
			String sql="select * from verification";
			pstmt=conn.prepareStatement(sql);

			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				Verification v = new Verification();
				
				v.setU_code(rs.getInt("u_code"));
				v.setMc_code(rs.getInt("mc_code"));
				v.setV_text(rs.getString("v_text"));
				v.setV_img(rs.getString("v_img"));
				
				datas.add(v);

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
				
				e.printStackTrace();
			}
		}
		return datas;
		
	}
	
	// *인증 삭제하기*
	public boolean deleteV(int v_code) {
		
		try {
			conn=DBConnection.connect();
			String sql="delete from verification where v_code=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, v_code);
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
				e.printStackTrace();
			}
		}
		return true;
		
	}
	
	// * 인증 수정하기*
	public boolean updateV(Verification ver) {
		try {
			conn=DBConnection.connect();
			String sql="update verification set u_code = ? ,mc_code = ?, v_text = ?, v_img = ? where v_code = ?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, ver.getU_code());
			pstmt.setInt(2, ver.getMc_code());
			pstmt.setString(3, ver.getV_text());
			pstmt.setString(4, ver.getV_img());
			pstmt.setInt(5, ver.getV_code());
			
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
