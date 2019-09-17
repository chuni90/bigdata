import static java.lang.System.out;
import java.util.ArrayList;  //<<이게 있어야 ArrayList를 사용할 수 있음!!

// ArrayList 는 

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String> ();
		
		out.println("Size: " + al.size());
		al.add("박지성");
		al.add("chun");
		
		for (String i : al)
			out.println(i);
		out.println("Size: " + al.size());
		out.println();
		
		// add(int x, 요소) : 인덱스x에 해당하는 위치에 요소를 add하고 기존에 요소가 있었다면 한 칸씩 뒤로(인덱스 +1) 밀려나서 저장됨.
		al.add(1,"ahn");
		for (String i : al)
			out.println(i);

		out.println("Size: " + al.size());
		out.println();
		
		//어레이명.contains(요소) : ArrayList에 (요소)의 보유 유무를 T/F로 반환
		out.println(al.contains("ahn"));
		out.println();
		
		//containsAll(어레이) : ArrayList에 (다른 어레이)의 요소가 모두 있는 지를 T/F로 반환
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("박지성");
		al2.add("chun");
		out.println("contains All>> " + al.containsAll(al2));
		out.println();
		
		//isEmpty : array가 비어있는지를 T/F로 반환
		out.println("is Empty>> " + al.isEmpty());
		out.println();
		
		//get(int x) : 인덱스 x에 해당하는 요소를 반환
		out.println("get()>> " + al.get(2));
		out.println();
		
		//indexOf(요소) : 요소에 해당하는 인덱스를 반환, 값이 없다면 -1을 반환
		// 동일한 요소가 2개라면 첫번째 요소의 인덱스를 반환
		out.println("indexOf(요소)>> " + al.indexOf("chun"));
		out.println("indexOf(요소)>> " + al.indexOf("KK") + "요소가 없으므로 -1");
		out.println();
		
		//lastIndexOf(요소) : 만약 ArrayList에 동일한 요소가 2개일 경우에 더 뒤에 있는 요소의 인덱스를 반환
		//이미 있는 "ahn"을 추가해서 실험
		al.add("ahn");
		out.println("indexOf(요소)>> " + al.lastIndexOf("ahn"));
		out.println();
		
		//remove(int x) : 인덱스 x에 해당하는 요소를 삭제, 중간 인덱스를 없앴다면 한 칸씩 인덱스가 줄어듬(-1)
		al.remove(1);
		for (String i : al)
			out.println(i);
		out.println("Size: " + al.size());
		out.println();
	}

}
