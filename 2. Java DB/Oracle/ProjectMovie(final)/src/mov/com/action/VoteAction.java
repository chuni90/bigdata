package mov.com.action;

import static mov.com.util.ConsoleUtils.*;

import java.util.ArrayList;
import java.util.Scanner;

import mov.com.svc.ShowService;
import mov.com.svc.VoteService;
import mov.com.util.ConsoleUtils;
import mov.com.vo.MovieDTO;

public class VoteAction implements Action{
	@Override
	public void execute(Scanner sc) {
		
		/*
		 * 1.전체 영화를 출력시킨다.
		 */
		
		ShowService showsvc = new ShowService();
		ArrayList<MovieDTO> list = showsvc.selectAll();
		
		if(list==null) {
			System.out.println("등록된 영화정보가 존재하지 않습니다.");
			return;
		}
		
		ConsoleUtils cu = new ConsoleUtils();
		cu.show(list);
		
		// 2. 출력된 영화 중 1개를 선택하고, 이를 서비스 객체로 넘겨준다
		VoteService votesvc = new VoteService();
		String movieId = cu.getVoteId(sc, "투표");
		if(votesvc.vote(movieId, userId))
			cu.voteSuccess();
		else
			cu.voteFail();
	}

}