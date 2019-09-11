
public class BankMain {

	public static void main(String[] args) {
		
		BadBank b = new	BadBank();
		NormalBank n = new NormalBank();
		GoodBank g = new GoodBank();
		
		System.out.println("Bad>>" + b.getInterestRate());
		System.out.println("Normal>>" + n.getInterestRate());
		System.out.println("Good>>" + g.getInterestRate());
	}

}
