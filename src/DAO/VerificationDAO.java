package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.Verification;

public class VerificationDAO {

	Connection conn;
	PreparedStatement pstmt;
	
	// *인증 등록하기*
	public boolean insertV(Verification ver) {
		try {
			conn=DBConnection.connect();
			String sql=""; //작업필요
			pstmt=conn.prepareStatement(sql);
			
			//작업필요
		
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
	public  ArrayList<Verification> showV() {
		
		ArrayList<Verification> datas=new ArrayList();
		
		try {
			conn=DBConnection.connect();
			String sql=""; //작업필요
			pstmt=conn.prepareStatement(sql);
			
			//작업필요


			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				//작업필요

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
			String sql="delete from message where c_code=?";
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
	
	
	
	

}
