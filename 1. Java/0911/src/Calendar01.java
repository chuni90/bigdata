import java.util.Calendar; // calendar�� �ʿ��� Ŭ����

public class Calendar01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Now is..  ");
		Calendar now = Calendar.getInstance();
		
		int week_yy = now.get(now.WEEK_OF_YEAR);
		int yy = now.get(now.YEAR);
		int mm = now.get(now.MONTH)+1;  // 0�� 1���̶� +1�� ����� ���� ���� ǥ��
		int dd = now.get(now.DAY_OF_MONTH);
		
		sb.append(week_yy);
		sb.append("��°�� ");
		
		sb.append(yy + "�� ");
		sb.append(mm + "�� ");
		sb.append(dd + "�� ");
		
		System.out.println(sb);
		
		
	}

}
