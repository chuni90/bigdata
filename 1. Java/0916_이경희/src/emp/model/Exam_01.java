package emp.model;

// ������ Ȯ���غ���


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
		
		
		// �̷��� �� Ŭ������ 3���� ����� �ͺ��� �θ�Ŭ���� �ȿ��ٰ� �ڽ�Ŭ������ �����ϴ� ���� �޸� ���� ���鿡�� ȿ����
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
