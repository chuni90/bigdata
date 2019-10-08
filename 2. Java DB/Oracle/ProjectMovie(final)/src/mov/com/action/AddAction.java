package mov.com.action;

import java.util.Scanner;

import mov.com.svc.AddService;
import mov.com.util.ConsoleUtils;
import mov.com.vo.MovieDTO;

public class AddAction implements Action {

	@Override
	public void execute(Scanner sc) {

		ConsoleUtils cu = new ConsoleUtils();
		MovieDTO dto = null;
		dto = cu.make(sc);
		
		AddService addsvc = new AddService();
		boolean check = addsvc.add(dto);
		
		if(check) {
			cu.addSuccess();
		} else {
			cu.addFail();
			}
	}

}
