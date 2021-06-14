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
    

// ȸ������
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

   
// �α���
   public boolean login(String userid, String userpw) {
      
      String sql ="select * from users where id=?";
      try {
         conn = DBConnection.connect();
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

   // ȸ������ ��������
   // �Ķ���ͷ� ���̵� ���� �ָ鼭 �˻�
   // ��ȯ���� users�� 
   // üũ���̵� (���̵� �ߺ��˻�) �Ƶ� ������ �ߺ��Ǵ� �� �ߺ��Ǹ� false ������ true

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
   
   public boolean checkId(String userid) {
      conn = DBConnection.connect();
      String sql = "select count(*) from users where id=?";
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