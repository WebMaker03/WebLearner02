package DTO;

public class Users {
	private int u_code;
	private String id;
	private String pw;
	private String u_name;
	private int age;
	private int point;
	
	public Users() {;}
	
	public Users(int u_code, String id, String pw, String u_name, int age, int point) {
		this.u_code = u_code;
		this.id = id;
		this.pw = pw;
		this.u_name = u_name;
		this.age = age;
		this.point = point;
	}
	
	//getter, setter
	public int getU_code() {
		return u_code;
	}
	public void setU_code(int u_code) {
		this.u_code = u_code;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
