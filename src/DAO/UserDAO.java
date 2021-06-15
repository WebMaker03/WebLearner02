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

   // 회원정보 가져오기
   // 파라미터로 아이디 값을 주면서 검색
   // 반환값은 users로 
   // 체크아이디 (아이디 중복검사) 아디값 받으면 중복되는 값 중복되면 false 없으면 true

   public Users showUser(String userid) {
      Users user = new Users();
      conn=DBConnection.connect();
      
      try {
         String sql = "select * from users where id=?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, userid);
         ResultSet rs = pstmt.executeQuery();
         while(rs.next()) {
            user.setU_code(rs.getInt("u_code"));
            user.setId(rs.getString("id"));
            user.setPw(rs.getString("pw"));
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

   // 회원가입 시 아이디 체크 함수
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

}