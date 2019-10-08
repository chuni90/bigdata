package mov.com.vo;

public class SeatDTO {
	private String seat_id;
	private String status;
	private String user_id;
	
	public SeatDTO(String seat_id, String status, String user_id) {
		this.seat_id = seat_id;
		this.status = status;
		this.user_id = user_id;
	}

	public String getSeat_id() {
		return seat_id;
	}

	public void setSeat_id(String seat_id) {
		this.seat_id = seat_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "SeatDTO [seat_id=" + seat_id + ", status=" + status + ", user_id=" + user_id + "]";
	}
	
	
	
}
