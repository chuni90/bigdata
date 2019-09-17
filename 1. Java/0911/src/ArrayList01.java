import static java.lang.System.out;
import java.util.ArrayList;  //<<�̰� �־�� ArrayList�� ����� �� ����!!

// ArrayList �� 

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String> ();
		
		out.println("Size: " + al.size());
		al.add("������");
		al.add("chun");
		
		for (String i : al)
			out.println(i);
		out.println("Size: " + al.size());
		out.println();
		
		// add(int x, ���) : �ε���x�� �ش��ϴ� ��ġ�� ��Ҹ� add�ϰ� ������ ��Ұ� �־��ٸ� �� ĭ�� �ڷ�(�ε��� +1) �з����� �����.
		al.add(1,"ahn");
		for (String i : al)
			out.println(i);

		out.println("Size: " + al.size());
		out.println();
		
		//��̸�.contains(���) : ArrayList�� (���)�� ���� ������ T/F�� ��ȯ
		out.println(al.contains("ahn"));
		out.println();
		
		//containsAll(���) : ArrayList�� (�ٸ� ���)�� ��Ұ� ��� �ִ� ���� T/F�� ��ȯ
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("������");
		al2.add("chun");
		out.println("contains All>> " + al.containsAll(al2));
		out.println();
		
		//isEmpty : array�� ����ִ����� T/F�� ��ȯ
		out.println("is Empty>> " + al.isEmpty());
		out.println();
		
		//get(int x) : �ε��� x�� �ش��ϴ� ��Ҹ� ��ȯ
		out.println("get()>> " + al.get(2));
		out.println();
		
		//indexOf(���) : ��ҿ� �ش��ϴ� �ε����� ��ȯ, ���� ���ٸ� -1�� ��ȯ
		// ������ ��Ұ� 2����� ù��° ����� �ε����� ��ȯ
		out.println("indexOf(���)>> " + al.indexOf("chun"));
		out.println("indexOf(���)>> " + al.indexOf("KK") + "��Ұ� �����Ƿ� -1");
		out.println();
		
		//lastIndexOf(���) : ���� ArrayList�� ������ ��Ұ� 2���� ��쿡 �� �ڿ� �ִ� ����� �ε����� ��ȯ
		//�̹� �ִ� "ahn"�� �߰��ؼ� ����
		al.add("ahn");
		out.println("indexOf(���)>> " + al.lastIndexOf("ahn"));
		out.println();
		
		//remove(int x) : �ε��� x�� �ش��ϴ� ��Ҹ� ����, �߰� �ε����� ���ݴٸ� �� ĭ�� �ε����� �پ��(-1)
		al.remove(1);
		for (String i : al)
			out.println(i);
		out.println("Size: " + al.size());
		out.println();
	}

}
