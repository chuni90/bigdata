class Parent{
	public Parent() {
		System.out.println("�θ������ ȣ��\n");
		
	}
	
}
////////////////////////////
class Child extends Parent{
	public Child () {
		System.out.println("�ڽĻ����� ȣ��\n");
	}
	
}
public class Parent_child_creator_call {

	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println("���� �� p�� �޸� �ּ�: " + p);
		
		// c��ü�� p��ü�� �ٿ��ֱ� �ϴ� �ڵ�. �׷��ٸ� ������ p����޸𸮴� garbage�� �̵�
		// ������ ����� ���� p�� �ּҰ� c�� �ּҷ� �ٲ� ���� �� �� ����.
		p = c;  
		System.out.println("���� �� p�� �޸� �ּ�: " + p);
		System.out.println(c+"\n");
		
		// �Ʒ� �ڵ�� dtype�� �θ�, �����ڴ� �ڽ��� case. 
		// �� �ڽ����� ����� �θ�Ÿ�Կ� ���� �� ����(�ڽ��� ���������δ� �� Ȯ��� ���´ϱ�)
		// �ݴ��� ���� �翬�� �Ұ���
		Parent c2 = new Child();
	}

}
