package mov.com.action;

import java.util.Scanner;

import mov.com.svc.ViewService;
import mov.com.util.ConsoleUtils;
import mov.com.vo.MovieDTO;

public class ViewAction implements Action{
	
	@Override
	public void execute(Scanner sc) {
		/*
		 *  영화 개별 정보를 불러오는 액션
		 *  1. 검색 대상의 영화 id를 불러온다
		 *  [[ 향후 추가하고 싶은 부분
		 *   - 영화테이블의 영화 id와 Title을 나열해서 보여주고
		 *   - 거기서 id 선택하면 아래 기능 실행하는 것도 괜찮을 듯]]
		 */
		
		ConsoleUtils cu = new ConsoleUtils();
		int id = cu.getId(sc, "검색");
		
		// 불러온 id를 서비스 객체로 보낸다
		ViewService viewsvc = new ViewService();
		MovieDTO dto = viewsvc.getMovie(id);
		
		// 서비스 객체가 MovieDTO의 객체를 가져왔을 때 이게 있다면 출력하고 없다면 에러메시지
		
		if (dto != null) {
			cu.view(dto);
		}else {
			cu.viewFail();
			return;
		}
	}
}
