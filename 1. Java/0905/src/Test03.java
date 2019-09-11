import com.test.*;

public class Test03 {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.num3 = 11; // <--A클래스에서 num3만 public이기 때문에 다른 클래스(현 Testo03)에서 접근이 가능함
		
	}

}
