package DTO;

public class Verification {
	private int v_code;
	private int u_code;
	private int mc_code;
	private int rating;
	private String v_text;
	private String v_img;
	
	
	public Verification() {;}
	
	public Verification(int v_code, int u_code, int mc_code,int rating ,String v_text, String v_img) {
		this.v_code = v_code;
		this.u_code = u_code;
		this.mc_code = mc_code;
		this.rating = rating;
		this.v_text = v_text;
		this.v_img = v_img;
	}
	

	//getter, setter
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getV_code() {
		return v_code;
	}
	public void setV_code(int v_code) {
		this.v_code = v_code;
	}
	public int getU_code() {
		return u_code;
	}
	public void setU_code(int u_code) {
		this.u_code = u_code;
	}
	public int getMc_code() {
		return mc_code;
	}
	public void setMc_code(int mc_code) {
		this.mc_code = mc_code;
	}
	public String getV_text() {
		return v_text;
	}
	public void setV_text(String v_text) {
		this.v_text = v_text;
	}
	public String getV_img() {
		return v_img;
	}
	public void setV_img(String v_img) {
		this.v_img = v_img;
	}
	
	
}
