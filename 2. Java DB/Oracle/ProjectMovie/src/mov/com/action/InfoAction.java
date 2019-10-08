package mov.com.action;

import java.util.ArrayList;
import java.util.Scanner;

import mov.com.svc.InfoService;
import mov.com.util.ConsoleUtils;
import mov.com.vo.AccountDTO;

public class InfoAction implements Action {

	@Override
	public void execute(Scanner sc) {
		InfoService infosvc = new InfoService();
		ArrayList<AccountDTO> list = infosvc.selectAll();
		
		if(list==null) {
			System.out.println("등록된 영화정보가 존재하지 않습니다.");
			return;
		}
		
		ConsoleUtils cu = new ConsoleUtils();
		cu.showw(list);

	}

}
