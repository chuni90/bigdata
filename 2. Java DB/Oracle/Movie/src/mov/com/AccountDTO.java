package mov.com.vo;

public class AccountDTO {
	private String id;
	private String name;
	private String mymovie;
	private String power;
	
	public AccountDTO(String id, String name, String mymovie, String power) {
		this.id = id;
		this.name = name;
		this.mymovie = mymovie;
		this.power = power;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMymovie() {
		return mymovie;
	}

	public void setMymovie(String mymovie) {
		this.mymovie = mymovie;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}
	
	
	
}
