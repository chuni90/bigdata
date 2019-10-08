package mov.com.action;

import java.util.Scanner;

import mov.com.svc.AddJoinService;
import mov.com.util.ConsoleUtils;
import mov.com.vo.AccountDTO;

public class AddJoinAction implements Action {

	   @Override
	   public void execute(Scanner sc) {
	      ConsoleUtils cu = new ConsoleUtils();
	      AccountDTO dto =null;
	      dto =cu.joinLogin(sc);
	      
	      AddJoinService addJsvc =new AddJoinService();
	      boolean check =addJsvc.addJ(dto);
	      
	      if(check) {
	         cu.addJSuccess();
	      }else
	         cu.addJFail();

	   }

	}