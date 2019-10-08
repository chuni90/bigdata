package mov.com.action;

import java.util.ArrayList;
import java.util.Scanner;

import mov.com.svc.VoteResultService;
import mov.com.util.ConsoleUtils;
import mov.com.vo.JoinDTO;
import mov.com.vo.MovieDTO;

public class VoteResult implements Action {

	@Override
	public void execute(Scanner sc) {

		VoteResultService vrsvc = new VoteResultService();
		ArrayList<JoinDTO> list = vrsvc.voteResultShow();

		if (list == null) {
			System.out.println("등록된 영화정보가 존재하지 않습니다.");
			return;
		}

		ConsoleUtils cu = new ConsoleUtils();
		cu.showResult(list);
	}

}
