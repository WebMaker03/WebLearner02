package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String Db_url = "jdbc:mysql://localhost:3306/codelearner2?useSSL=false";
	static final String USERNAME = "root"; // 계정 이름
	static final String PASSWORD = "1234"; // 비밀 번호

	static {
		// 드라이버 로딩
		try {
			
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}

	}

	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(Db_url, USERNAME, PASSWORD); // 연결 생성
		return conn;
	}

	public static void dbClose(ResultSet rs, Statement stmt) throws SQLException {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
	}

	public static void dbClose(Statement stmt, Connection conn) { 
		if (stmt != null)
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
