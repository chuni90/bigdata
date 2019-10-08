package mov.com.action;

import java.util.Scanner;

import mov.com.svc.AddAccountService;
import mov.com.util.ConsoleUtils;
import mov.com.vo.AccountDTO;

public class AddAccountAction implements Action {
	public void execute(Scanner sc) {

		ConsoleUtils cu = new ConsoleUtils();
		AccountDTO dto = null;
		dto = cu.makeAccount(sc);
		
		AddAccountService addacsvc = new AddAccountService();
		boolean check = addacsvc.addAc(dto);
		
		if(check) {
			cu.addSuccess();
		} else {
			cu.addFail();
			}
	}

}