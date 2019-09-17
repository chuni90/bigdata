import java.util.Calendar; // calendar에 필요한 클래스

public class Calendar01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Now is..  ");
		Calendar now = Calendar.getInstance();
		
		int week_yy = now.get(now.WEEK_OF_YEAR);
		int yy = now.get(now.YEAR);
		int mm = now.get(now.MONTH)+1;  // 0이 1월이라서 +1을 해줘야 현재 달이 표시
		int dd = now.get(now.DAY_OF_MONTH);
		
		sb.append(week_yy);
		sb.append("주째인 ");
		
		sb.append(yy + "년 ");
		sb.append(mm + "월 ");
		sb.append(dd + "일 ");
		
		System.out.println(sb);
		
		
	}

}
