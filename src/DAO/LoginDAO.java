package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Users;

public class LoginDAO {
	 Connection conn = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	 

	public LoginDAO() {

		try {

			conn = DBConnection.getConnection();

		} catch (Exception e) {

			e.printStackTrace(); 

		}

	}



	
	
	public boolean login(Users user) {
		
		String sql ="select * from users where userid=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,user.getId());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("testing");
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	
		
	}



}