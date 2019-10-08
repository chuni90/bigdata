package mov.com.svc;

import mov.com.vo.AccountDAO;

public class VoteService {

	public boolean vote(String movieId, String userId) {
		AccountDAO dao = new AccountDAO();
		int check = dao.voteMovie(movieId, userId);
		
		if (check <1)
			return false;
		else
			return true;
	}
}
