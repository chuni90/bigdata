package mov.com.vo;

public class MovieDTO {
   private int id;   // 영화 번호
   private String title;   //영화 제목
   private String country;   //배급사
   private String release;   //개봉일
   private String director;   //감독

   public MovieDTO(int id, String title, String country, String release, String director) {
	      super();
	      this.id = id;
	      this.title = title;
	      this.country = country;
	      this.release = release;
	      this.director = director;
	   }
	   public int getId() {
	      return id;
	   }
	   public void setId(int id) {
	      this.id = id;
	   }
	   public String getTitle() {
	      return title;
	   }
	   public void setTitle(String title) {
	      this.title = title;
	   }
	   public String getCountry() {
		      return country;
	   }
	   public void setCountry(String country) {
		      this.country = country;
	   }

	   public String getRelease() {
	      return release;
	   }
	   public void setRelease(String release) {
	      this.release = release;
	   }
	   public String getDirector() {
	      return director;
	   }
	   public void setDirector(String director) {
	      this.director = director;
	   }
	   // 가독성을 위해 칸 띄움 시도
	   @Override
	   public String toString() {
	      return "\n*id=" + id + "\n*title=" + title + "\n*country=" + country + "\n*release=" + release
	            + "\n*director=" + director;
	   }

}
