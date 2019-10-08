package mov.com.action;

import java.util.ArrayList;
import java.util.Scanner;

import mov.com.svc.ShowService;
import mov.com.util.ConsoleUtils;
import mov.com.vo.MovieDTO;



public class ShowAction implements Action {

	@Override
	public void execute(Scanner sc) {
		
		/*
		 * 1.전체학번에 대한 정보를 받아와서 출력시킨다.
		 */

		ShowService showsvc = new ShowService();
		ArrayList<MovieDTO> list = showsvc.selectAll();
		
		if(list==null) {
			System.out.println("등록된 영화정보가 존재하지 않습니다.");
			return;
		}
		
		ConsoleUtils cu = new ConsoleUtils();
		cu.show(list);

	}

}
