package mov.com.svc;

import mov.com.vo.AccountDAO;
import mov.com.vo.AccountDTO;

public class AddAccountService {

	public boolean addAc(AccountDTO dto) {

		AccountDAO dao = new AccountDAO();
		int check = dao.makeAccount(dto);
		if(check>0)
			return true;
		
		return false;
	}

	
}