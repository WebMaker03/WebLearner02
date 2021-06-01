package DTO;

public class MyC {
	private int mc_code;
	private int c_code;
	private int u_code;
	private boolean state;
	private int fee;
	private int period;
	private String startD;
	private String finishD;
	private int achievementPercentage;
	
	
	
	public MyC() {;}
	
	public MyC(int mc_code, int c_code, int u_code, boolean state, int fee, int period, String startD, String finishD,
			int achievementPercentage) {
		this.mc_code = mc_code;
		this.c_code = c_code;
		this.u_code = u_code;
		this.state = state;
		this.fee = fee;
		this.period = period;
		this.startD = startD;
		this.finishD = finishD;
		this.achievementPercentage = achievementPercentage;
	}

	//getter, setter
	public int getMc_code() {
		return mc_code;
	}
	public void setMc_code(int mc_code) {
		this.mc_code = mc_code;
	}
	public int getC_code() {
		return c_code;
	}
	public void setC_code(int c_code) {
		this.c_code = c_code;
	}
	public int getU_code() {
		return u_code;
	}
	public void setU_code(int u_code) {
		this.u_code = u_code;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public String getStartD() {
		return startD;
	}
	public void setStartD(String startD) {
		this.startD = startD;
	}
	public String getFinishD() {
		return finishD;
	}
	public void setFinishD(String finishD) {
		this.finishD = finishD;
	}
	public int getAchievementPercentage() {
		return achievementPercentage;
	}
	public void setAchievementPercentage(int achievementPercentage) {
		this.achievementPercentage = achievementPercentage;
	}
	
}
