package DAO;

import java.sql.Connection;
import java.util.ArrayList;

import DTO.Users;

public class TestDAO {

	public static void main(String[] args) {
		
	
	
	UserDAO udao = new UserDAO();
	Users us = new Users();
		us.setU_code(1);
		us.setId("wogus2");
		us.setPw("0640");
		us.setU_name("¿Ã¿Á«ˆ");
		us.setEmail("z0640@naver.com");
		us.setAge(25);
		us.setPoint(5000);
		
		udao.SignUp(us);
	
	}
}
