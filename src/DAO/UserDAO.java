package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.Users;

public class UserDAO {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    

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
         System.out.println("회원가입 성공");        
         return true;
   }

   public boolean login(String userid, String userpw) {
      
      String sql ="select * from users where userid=?";
      try {
         conn = DBConnection.connect();
         pstmt=conn.prepareStatement(sql);
         pstmt.setString(1,userid);
         rs=pstmt.executeQuery();
         if(rs.next()) {
            System.out.println("로그인");
               if(rs.getString("userpw").equals(userpw)) {
                  System.out.println("로그인 성공");
                  return true;
               }
               else {
                  System.out.println("비밀번호가 틀립니다.");
               }
            }
            else {
               System.out.println("정보가 없습니다.");
            }
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return false;
   }

   public Users showUser(String userid) {
      Users user = new Users();
      conn=DBConnection.connect();
      
      try {
         String sql = "select * from users where userid=?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, userid);
         ResultSet rs = pstmt.executeQuery();
         while(rs.next()) {
            user.setU_code(rs.getInt("u_code"));
            user.setId(rs.getString("userid"));
            user.setPw(rs.getString("userpw"));
            user.setU_name(rs.getString("u_name"));
            user.setAge(rs.getInt("age"));
            //user.setEmail(rs.getString("email"));
            user.setPoint(rs.getInt("point"));
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return user;
   }

   public boolean checkId(String userid) {
      conn = DBConnection.connect();
      String sql = "select * from users where userid=?";

      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, userid);
         ResultSet rs = pstmt.executeQuery();
         if(rs.next()) {
            if(rs.getInt(1)!=0){
               
               return false;
               
            }
         }
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      return true;
   }

   public boolean updateUser(Users user) {
	   return false;
   }
   public boolean updateUserPw(Users user) {
	   return false;
   }
}