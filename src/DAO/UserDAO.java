package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Users;

public class UserDAO {
	 Connection conn = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	 

// 회원가입
	public boolean SignUp(Users user) {
		conn = DBConnection.connect();
		String sql="insert into users(userid,userpw,u_name,email,age) values (?,?,?,?,?)";
	      try {
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1, user.getId());
	         pstmt.setString(2, user.getPw());
	         pstmt.setString(3, user.getU_name());
	         pstmt.setString(4, user.getEmail());
	         pstmt.setInt(5, user.getAge());
	         pstmt.executeUpdate();
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
	      }
	      return true;
	}

	
// 로그인
	public boolean login(String userid, String userpw) {
		
		String sql ="select * from users where id=?";
		try {
			conn = DBConnection.connect();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,userid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("확인!");
	            if(rs.getString("pw").equals(userpw)) {
	               System.out.println("로그인성공");
	               return true;
	            }
	            else {
	               System.out.println("로그인실패-비밀번호불일치");
	            }
	         }
	         else {
	            System.out.println("해당아이디없음");
	         }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	
		
	}



}