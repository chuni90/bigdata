package stu.com.vo;

public class StudentDTO {
	private String id;			// 학번
	private String name; 		// 이름
	private int kor, eng, math; // 점수
	
	private int total;			// 세 과목의 합 (DB에 없음)
	private float ave;			// 세 과목 평균 (소수점 이하 둘째자리, DB에 없음)
	
	public StudentDTO(String id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		compute();
	}
	
	private void compute() { // 총점과 평균 계산
		total = kor + eng + math;
		ave = total / 3.0f;  // 3.0로 쓰면 자동으로 double로 인식함. f를 붙여줘야 float라고 인식함.
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

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public float getAve() {
		return ave;
	}

	public void setAve(float ave) {
		this.ave = ave;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", total=" + total + ", ave=" + ave + "]";
	}
	
	
	
	
}
