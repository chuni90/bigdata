package mov.com.svc;
import mov.com.vo.AccountDAO;
import mov.com.vo.AccountDTO;

public class AddJoinService {

   public boolean addJ(AccountDTO dto) {
      AccountDAO dao = new AccountDAO();
      
      int check = dao.makejoin(dto);
      
      if(check > 0)
         return true;
      return false;
   }
   
}