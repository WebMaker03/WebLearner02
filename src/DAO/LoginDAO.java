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



	
	
	   
	   public boolean login(String userid, String userpw) {
	      
	      String sql ="select * from users where id=?";
	      try {
	         conn = DBConnection.getConnection();
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1,userid);
	         rs=pstmt.executeQuery();
	         if(rs.next()) {
	            System.out.println("Ȯ��!");
	            System.out.println(rs.getString("pw"));
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