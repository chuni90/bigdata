package mov.com.action;

import java.util.Scanner;

import mov.com.svc.MyMovieService;

import mov.com.util.ConsoleUtils;
import mov.com.vo.AccountDTO;

public class MyMovieAction implements Action {

   @Override
   public void execute(Scanner sc) {
      
      ConsoleUtils cu = new ConsoleUtils();
      String id = cu.getAccId(sc, "검색");
      
      MyMovieService mymoviesvc = new MyMovieService();
      AccountDTO ato = mymoviesvc.getAccount(id);
      
      // 서비스 객체가 MovieDTO의 객체를 가져왔을 때 이게 있다면 출력하고 없다면 에러메시지
      
      if (ato != null) {
         cu.viewAccount(ato);
         return;
      }else {
         cu.viewAccountFail();
         return;
      }
   }

}