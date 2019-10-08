package mov.com.action;

import java.util.Scanner;

import mov.com.svc.ModifyService;
import mov.com.util.ConsoleUtils;
import mov.com.vo.MovieDTO;

public class ModifyAction implements Action {

	@Override
	public void execute(Scanner sc) {
		
		ConsoleUtils cu = new ConsoleUtils();
		int id = cu.getId(sc, "수정");
		
		ModifyService modifysvc = new ModifyService();
		MovieDTO oldMovie = modifysvc.getMovie(id);
		
		if(oldMovie == null) {
			cu.errorId();
			return;
		}
		
		MovieDTO newMovie = cu.newMovie(sc, oldMovie);
		
		boolean update = modifysvc.update(newMovie);
		if(update) {
			cu.updateSuccess();
		} else {
			cu.updateFail();
		}
		
;
	}

}



