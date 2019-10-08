package mov.com.svc;

import java.util.ArrayList;

import mov.com.vo.AccountDAO;
import mov.com.vo.JoinDTO;
import mov.com.vo.MovieDTO;

public class VoteResultService {

	public ArrayList<JoinDTO> voteResultShow(){
		ArrayList<JoinDTO> list = null;
		AccountDAO dao = new AccountDAO();
		list = dao.selectResult();
		
		return list;
	}
}
