package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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



	// �α����� �õ��ϴ� �Լ�****

	public int login(String userid, String password) {

		System.out.println(userid);
		System.out.println(password);
		return 0;
	}



}