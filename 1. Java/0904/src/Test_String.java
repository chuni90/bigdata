import java.util.Scanner;

public class Test_String {

	public static void main(String[] args) {
		
		//���ڿ� ���غ���..python�� ==���� �����ִµ�..�Ф�
		
		String s1 = new String("Hello!!");
		String s2 = new String("Hello!!");
		
		char s3 = 'a';
		char s4 = 'a';
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("-----------------------");
		
		// == �� ���ں񱳰� �ƴ϶� **�ּ�**�� ���� ���̱⿡, different�� ��ȯ��.
		if (s1 == s2) {
			System.out.println("same");
		}else 
			System.out.println("differnt");
		System.out.println("-----------------------");
		
		// char�� == �� �񱳰� �ǳ�??
		if (s3 == s4) {
			System.out.println("char>> same");
		}else 
			System.out.println("char>> differnt");
		System.out.println("-----------------------");
		
		// equals(������ �Ǵ� "���ڿ�") ���� ���ڿ��� ����.
		if (s1.equals(s2)) {
			System.out.println("same");
		}else 
			System.out.println("differnt");
		System.out.println("-----------------------");
		
		// equals �޼ҵ�� ����غ���
		String bbc = "bbcde";
		// ��ҹ��� ������� ���� ��, equalsIgnoreCase
 		System.out.println("equalsIgnoreCase>> " + bbc.substring(0,3).equalsIgnoreCase("bbc"));
 		// �������� �ٷ� ����ϴ� ���� contentEquals�� �ַ� ����ؼ� ����. 
 		System.out.println("contentEquals>> " + bbc.substring(0,3).contentEquals("bbc"));
 		System.out.println("-----------------------");
		
		String proverb = "A barking dog";		// new ������ ����
	 	String a1, a2, a3, a4;	// ���� �����μ� �޼ҵ忡�� ��ȯ�� �������� �޴´�.
	 	
	 	System.out.println();
	 	System.out.println ("���ڿ��� ���� =" + proverb.length());
	 	System.out.println("-----------------------");
	 	a1 = proverb.concat (" never Bites!");	// ���ڿ� ����
 		a2 = proverb.replace ('b', 'B');		// ���� ��ȯ (�ٲ� ����, �ٲ� ����)
 		a3 = proverb.substring (2, 5);		// �κ� ���ڿ� ����
 		a4 = proverb.toUpperCase();		// �빮�ڷ� ��ȯ 
 		
 		System.out.println();
 		System.out.println("concat>> "+ a1);
 		System.out.println("replace>> "+ a2);
 		System.out.println("substring>> "+ a3);
 		System.out.println("toUpperCase>> "+ a4);
 		System.out.println("-----------------------");
 		
 		// ���ڿ��� ���ڷ� �ٲٱ� ���ؼ� ����ϴ� class�� wrapper class��� �Ѵ�.
 		// int�� �ٲٱ� ���� Integer Ŭ������ parseInt �޼ҵ带 ���
 		int i = Integer.parseInt("2222");
 		System.out.println(i+1);
 		
 		// double�� �ٲٱ� ���� Double Ŭ������ parseDouble �޼ҵ带 �����
 		double ii = Double.parseDouble("3.223");
 		System.out.println(ii);
		System.out.println("-----------------------");
 		
 		// �Է��� ���ڿ��� www�� �����ϴ� �� �˻�, ���Ḧ ���ϸ�  quit �Է�
 		System.out.println("\n>>> www �ǵ��� ���� <<<");

 		Scanner input = new Scanner(System.in);
 		String adr;
 		String domain;
 		
 		while(true) {
	 		System.out.println("���ڿ� �Է�>> ");
	 		adr = input.next();
	 		domain = adr.substring(0,3);
	 		
	 		if (adr.equals("quit")) {
	 			System.out.println("����");
	 			break;
	 		}else if (domain.equals("www")) {
	 			System.out.printf("%s �� 'www'�� �����մϴ�\n", adr);
	 		}else 
	 			System.out.printf("%s �� 'www'�� ���� �� ��\n", adr);
 		}
 		
	}

}
