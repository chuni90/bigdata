package mov.com.action;

import java.util.Scanner;

import mov.com.svc.RemoveService;
import mov.com.util.ConsoleUtils;

public class RemoveAction implements Action {

	@Override
	public void execute(Scanner sc) {
		ConsoleUtils cu = new ConsoleUtils();
		int id = cu.getId(sc, "삭제");
		
		RemoveService removesvc = new RemoveService();
		boolean check = removesvc.delete(id);
		
		
		
		if(check) {
			cu.removeSuccess(id);
		} else {
			cu.removeFail(id);
		}
		
		
		

	}

}
