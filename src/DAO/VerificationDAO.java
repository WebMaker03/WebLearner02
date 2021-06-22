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
	
	// *���� ����ϱ�*
	public boolean insertV(Verification ver) {
		try {
			conn=DBConnection.connect();
			String sql=""; //�۾��ʿ�
			pstmt=conn.prepareStatement(sql);
			
			//�۾��ʿ�
		
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
	
	// *���� ��ȸ�ϱ�*
	public  ArrayList<Verification> showV() {
		
		ArrayList<Verification> datas=new ArrayList();
		
		try {
			conn=DBConnection.connect();
			String sql=""; //�۾��ʿ�
			pstmt=conn.prepareStatement(sql);
			
			//�۾��ʿ�


			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				//�۾��ʿ�

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
	
	// *���� �����ϱ�*
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
