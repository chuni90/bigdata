package emp.model;

// 다형성 확인해보기


class AA{
	@Override
	public String toString() {
		return "AA";
	}
}


class BB{
	@Override
	public String toString() {
		return "BB";
	}
}

class CC{
	@Override
	public String toString() {
		return "CC";
	}
}

public class Exam_01 {

	public static void main(String[] args) {
		
		
		// 이렇게 각 클래스를 3개를 만드는 것보다 부모클래스 안에다가 자식클래스를 정의하는 것이 메모리 관리 측면에서 효과적
//		AA ap = new AA();
//		BB bp = new BB();
//		CC cp = new CC();
		
		Object[] obj = new Object[3];
		obj[0]= new AA();
		obj[1]= new BB();
		obj[2]= new CC();
		
		
//		obj[0].toString();
//		obj[1].toString();
//		obj[2].toString();
		
		for(int i = 0; i < obj.length; i+=1) {
			System.out.println(obj[i]);
		}
		
	}

}
