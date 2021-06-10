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
	 
// DB ����
	public UserDAO() {

		try {

			conn = DBConnection.getConnection();

		} catch (Exception e) {

			e.printStackTrace(); 

		}

	}

// ȸ������
	public boolean SignUp(Users user) {
		String sql="insert into member(id,pw,u_name,age) values (?,?,?,?)";
	      try {
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1, user.getId());
	         pstmt.setString(2, user.getPw());
	         pstmt.setString(3, user.getU_name());
	         pstmt.setInt(3, user.getAge());
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

	
// �α���
	public boolean login(String userid, String userpw) {
		
		String sql ="select * from users where id=?";
		try {
			conn = DBConnection.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,userid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("Ȯ��!");
	            if(rs.getString("pw").equals(userpw)) {
	               System.out.println("�α��μ���");
	               return true;
	            }
	            else {
	               System.out.println("�α��ν���-��й�ȣ����ġ");
	            }
	         }
	         else {
	            System.out.println("�ش���̵����");
	         }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	
		
	}



}