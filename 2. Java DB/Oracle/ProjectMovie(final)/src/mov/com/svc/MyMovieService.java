package mov.com.svc;

import mov.com.vo.AccountDAO;
import mov.com.vo.AccountDTO;

public class MyMovieService {
   public AccountDTO getAccount(String id) {
      AccountDTO ato = null;
      AccountDAO aao = new AccountDAO();
      
      ato = aao.selectAcc(id);
      return ato;
   }

}