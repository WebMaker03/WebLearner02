package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

   public static Connection getConnection(String driver) {
      String DName="com.mysql.jdbc.Driver";

      Connection conn=null;
      Statement stmt=null;
      ResultSet rs=null;
      String url="jdbc:mysql://localhost:3308/leedb";
      String user="root";
      String password="0640";
      try {
		conn=DriverManager.getConnection(url, user, password);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
      
      
      try {
         Class.forName(driver);
         conn=DriverManager.getConnection(url,user,password);
      } catch (ClassNotFoundException e) {
         System.out.println("����̹� �ε� ����"); //alt+shift+z : try catch �� �ڵ��ϼ�
      } catch (SQLException e) {
         System.out.println("db ���� ����");
      } catch (Exception e) {
         System.out.println("�� �� ���� ����");
      }
      
      return conn;
   }
   
}