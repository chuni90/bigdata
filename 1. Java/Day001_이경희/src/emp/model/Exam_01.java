package emp.model;

class AAA{
	
	@Override
	public String toString() {
		return "AAA";
	}	
	
}

class BBB{
	

	@Override
	public String toString() {
		return "BBB";
	}
}

class CCC{
	

	@Override
	public String toString() {
		return "CCC";
	}
}

public class Exam_01 {

	public static void main(String[] args) {
		//AAA ap = new AAA();
		//BBB bp = new BBB();
		//CCC cp = new CCC();
		
		Object[] obj = new Object[3];
		obj[0] = new AAA();
		obj[1] = new BBB();
		obj[2] = new CCC();
		
		/*obj[0].toString();
		obj[1].toString();
		obj[2].toString();*/
		
		for(int i = 0; i < obj.length; i++) {
			//System.out.println(obj[i].toString());
			System.out.println(obj[i]);
		}

	}

}
