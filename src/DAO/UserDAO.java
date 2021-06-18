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

<<<<<<< HEAD
// ȸ������
=======

>>>>>>> branch 'master' of https://github.com/WebMaker03/WebLearner02.git
	public boolean SignUp(Users user) {
		conn = DBConnection.connect();
		String sql = "insert into users(userid,userpw,u_name,email,age) values (?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPw());
			pstmt.setString(3, user.getU_name());
			pstmt.setString(4, user.getEmail());
			pstmt.setInt(5, user.getAge());
			pstmt.executeUpdate();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

<<<<<<< HEAD
// �α���
=======

>>>>>>> branch 'master' of https://github.com/WebMaker03/WebLearner02.git
	public boolean login(String userid, String userpw) {

		String sql = "select * from users where userid=?";
		try {
			conn = DBConnection.connect();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
<<<<<<< HEAD
				System.out.println("Ȯ��!");
				if (rs.getString("pw").equals(userpw)) {
					System.out.println("�α��μ���");
=======
				if (rs.getString("userpw").equals(userpw)) {
					System.out.println("로그인 성공입니다. ");
>>>>>>> branch 'master' of https://github.com/WebMaker03/WebLearner02.git
					return true;
				} else {
<<<<<<< HEAD
					System.out.println("�α��ν���-��й�ȣ����ġ");
=======
					System.out.println("비밀번호가 틀렸습니다. ");
>>>>>>> branch 'master' of https://github.com/WebMaker03/WebLearner02.git
				}
			} else {
<<<<<<< HEAD
				System.out.println("�ش���̵����");
=======
				System.out.println("유저 정보가 없습니다.");
>>>>>>> branch 'master' of https://github.com/WebMaker03/WebLearner02.git
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

<<<<<<< HEAD
	// ȸ������ ��������
	// �Ķ���ͷ� ���̵� ���� �ָ鼭 �˻�
	// ��ȯ���� users��
	// üũ���̵� (���̵� �ߺ��˻�) �Ƶ� ������ �ߺ��Ǵ� �� �ߺ��Ǹ� false ������ true

=======
	
>>>>>>> branch 'master' of https://github.com/WebMaker03/WebLearner02.git
	public Users showUser(String userid) {
		Users user = new Users();
		conn = DBConnection.connect();

		try {
			String sql = "select * from users where userid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				user.setU_code(rs.getInt("u_code"));
				user.setId(rs.getString("userid"));
				user.setPw(rs.getString("userpw"));
				user.setU_name(rs.getString("u_name"));
				user.setAge(rs.getInt("age"));
				// user.setEmail(rs.getString("email"));
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
			if (rs.next()) {
				if (rs.getInt(1) != 0) {

					return false;

				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}


	public boolean updateUser(Users user) {		// name, email, age, id
		conn = DBConnection.connect();
		String sql = "update users set u_name=?"
				+ " email=?"
				+ " age=?"
				+ " where userid=?;";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getU_name());
			pstmt.setString(2, user.getEmail());
			pstmt.setInt(3, user.getAge());
			pstmt.setString(4, user.getId());
			pstmt.executeUpdate();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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


	public boolean updateUserPw(Users user) {	// id, pw
		conn = DBConnection.connect();
		String sql = "update users set userpw=?"
				+ " where userid=?;";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getPw());
			pstmt.setString(2, user.getId());
			pstmt.executeUpdate();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
}