package mov.com.svc;

import java.util.ArrayList;

import mov.com.vo.AccountDAO;
import mov.com.vo.MovieDTO;

public class VoteResultService {

	public ArrayList<MovieDTO> voteResultShow(){
		ArrayList<MovieDTO> list = null;
		AccountDAO dao = new AccountDAO();
		list = dao.selectResult();
		
		return list;
	}
}
