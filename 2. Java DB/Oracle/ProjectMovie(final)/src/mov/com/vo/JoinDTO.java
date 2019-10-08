package mov.com.vo;

public class JoinDTO {
	private int id; // 영화 번호
	private String title; // 영화 제목
	private int vote_count;

	public JoinDTO(int id, String title, int vote_count) {
		this.id = id;
		this.title = title;
		this.vote_count = vote_count;
	}

	public int getVote_count() {
		return vote_count;
	}

	@Override
	public String toString() {
		return "\n*id= " + id + "\n*title= " + title + "\n*투표수= " + vote_count;
	}

}
