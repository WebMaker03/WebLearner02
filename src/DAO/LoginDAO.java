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



	// 로그인을 시도하는 함수****

	public int login(String userid, String password) {

		System.out.println(userid);
		System.out.println(password);
		return 0;
	}



}