package mov.com.svc;

import java.util.ArrayList;

import mov.com.vo.AccountDAO;
import mov.com.vo.AccountDTO;

public class InfoService {
	public ArrayList<AccountDTO> selectAll() {
		AccountDAO dao = new AccountDAO();
		ArrayList<AccountDTO> list= null;
		list=dao.selectAllMoviee();
		
		return list;
		
	}
}
