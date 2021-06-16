package DTO;

public class Post {
	private int p_code;
	private int u_code;
	private int b_code;
	// p_title 변수 추가
	private String p_title;
	private String p_text;
	// cm_count 변수 추가
	private int cm_count;

	
	
	
	public Post() {;}
	
	public Post(int p_code, int u_code, int b_code, String p_title ,String p_text) {
		this.p_code = p_code;
		this.u_code = u_code;
		this.b_code = b_code;
		this.p_title = p_title;
		this.p_text = p_text;
		this.cm_count = 0;
	}


	//getter, setter
	public int getP_code() {
		return p_code;
	}
	public void setP_code(int p_code) {
		this.p_code = p_code;
	}
	public int getU_code() {
		return u_code;
	}
	public void setU_code(int u_code) {
		this.u_code = u_code;
	}
	public int getB_code() {
		return b_code;
	}
	public void setB_code(int b_code) {
		this.b_code = b_code;
	}
	public String getP_text() {
		return p_text;
	}
	public void setP_text(String p_text) {
		this.p_text = p_text;
	}

	public int getCm_count() {
		return cm_count;
	}

	public void setCm_count(int cm_count) {
		this.cm_count = cm_count;
	}

	public String getP_title() {
		return p_title;
	}

	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	
	
	
}
