package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

	private Connection conn;

	private PreparedStatement pstmt;

	private ResultSet rs;

	public LoginDAO() {

		try {

			String dbURL = "jdbc:mysql://localhost:3308/leedb";

			String dbID = "root";

			String dbPassword = "0640";

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);

		} catch (Exception e) {

			e.printStackTrace(); 

		}

	}



	// �α����� �õ��ϴ� �Լ�****

	public int login(String userID, String userPassword) {

		String SQL = "SELECT pw FROM users WHERE userID = ?";

		try {

			pstmt = conn.prepareStatement(SQL);

			// sql������ ���� ��ŷ����� ����ϴ°�... pstmt�� �̿��� �ϳ��� ������ �̸� �غ��ؼ�(����ǥ���)

			// ����ǥ�ش��ϴ� ������ �������̵��, �Ű������� �̿�.. 1)�����ϴ��� 2)��й�ȣ��������

			pstmt.setString(1, userID);

			// rs:result set �� �������

			rs = pstmt.executeQuery();

			// ����� �����Ѵٸ� ����

			if (rs.next()) {

				// �н����� ��ġ�Ѵٸ� ����

				if (rs.getString(1).equals(userPassword)) {

					return 1; // ��� ����

				} else

					return 0; // ��й�ȣ ����ġ

			}

			return -1; // ���̵� ���� ����



		} catch (Exception e) {

			e.printStackTrace();

		}

		return -2; // �����ͺ��̽� ������ �ǹ�

	}



}