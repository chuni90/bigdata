package mov.com.util;

import java.util.ArrayList;
import java.util.Scanner;

import mov.com.vo.AccountDTO;
import mov.com.vo.MovieDTO;

public class ConsoleUtils {
	// 메뉴를 표시하고 사용자가 입력한 메뉴값을 되돌려주는 메서드
	public static String userId;
	
	public int showMenu(Scanner sc) {
		System.out.println("== 영화관리 프로그램 ==");
		System.out.println("1. 영화정보등록");
		System.out.println("2. 영화정보수정");
		System.out.println("3. 영화정보검색");
		System.out.println("4. 영화정보삭제");
		System.out.println("5. 전체영화출력");
		System.out.println("6. 회원정보출력");
		System.out.println("7. 프로그램종료");
		System.out.println("==================");
		System.out.print("선택 = ");
		return Integer.parseInt(sc.nextLine());
	}
	// 학생 정보를 등록받아 객체화한후 되돌려 주는 메서드
	public MovieDTO make(Scanner sc) {
		MovieDTO dto = null;
		System.out.println("등록할 영화 정보를 입력해 주세요.");
		System.out.print("영화고유번호 : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("영화제목 : ");
		String title = sc.nextLine();
		System.out.print("나라 : ");
		String country = sc.nextLine();
		System.out.print("개봉일 : ");
		String release = sc.nextLine();
		System.out.print("감독명 : ");
		String director = sc.nextLine();
		return new MovieDTO(id,title,country,release,director);
	}
	public void addSuccess() {
		System.out.println("등록에 성공하였습니다.");
	}
	public void addFail() {
		System.out.println("등록에 실패하였습니다.");
	}
    public int getId(Scanner sc, String kind) {
        System.out.println(kind + "할 영화의 고유번호를 입력해주세요");
        System.out.print("영화 고유번호 입력>> ");
        return Integer.parseInt(sc.nextLine());
     }
     
     public void viewFail() {
        System.out.println("선택하신 영화를 찾을 수 없습니다...(ㅠ_ㅠ) ");
     }
  
     public void view(MovieDTO dto) {
        System.out.println("선택하신 영화의 정보는 다음과 같습니다.▼ ");
        System.out.println(dto.toString());
     }
     public void show(ArrayList<MovieDTO> list) {
         System.out.println("등록된 영화정보 출력");
         for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println("---------------------------------------------------------------------------------");
         }
      }
     public void showw(ArrayList<AccountDTO> list) { // 회원정보
         System.out.println("등록된 회원정보 출력");
         for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println("---------------------------------------------------");
         }
      }
     public MovieDTO newMovie(Scanner sc, MovieDTO oldMovie) {
         MovieDTO dto = null;
         
         System.out.println("수정할 내용을 입력하여 주세요.");
         System.out.println("등록번호 : "+ oldMovie.getId()); 
         System.out.print(oldMovie.getTitle() + " => ");
         String title = sc.nextLine();
         System.out.print(oldMovie.getCountry() + " => ");
         String country = sc.nextLine();
         System.out.print(oldMovie.getRelease() + " => ");
         String release = sc.nextLine();
         System.out.print(oldMovie.getDirector() + " => ");
         String director = sc.nextLine();
         
         dto = new MovieDTO(oldMovie.getId(), title, country, release, director);
         return dto; 
      }
      
      public void updateSuccess() {
         System.out.println("영화정보 수정이 성공하였습니다.");
      }
      
      public void updateFail() {
         System.out.println("영화정보 수정이 실패하였습니다.");
      }
      
      public void removeSuccess(int id) {
         System.out.println(id + "영화정보 삭제에 성공하였습니다.");
      }
      
      public void removeFail(int id) {
         System.out.println(id + "영화정보 삭제에 실패하였습니다.");
      }
	public void errorId() {
		System.out.println("해당 아이디가 존재하지 않습니다.");
		
	}
    public String showLogin(Scanner sc) {
        System.out.println("\n☆★☆★ MEGABOX 로그인창 ☆★☆★");
        System.out.print("ID 입력 : ");
        userId = sc.nextLine();
        return userId;
     }
    public String getVoteId(Scanner sc, String kind) {
        System.out.println(kind + "할 영화의 ID를 입력해주세요");
        System.out.print("영화 ID 입력>> ");
        return sc.nextLine();
     }
	public int showMenu1(Scanner sc) {
		System.out.println("\n☆★☆★ MEGABOX 회원메뉴 ☆★☆★");
	      System.out.println("아래의 메뉴에서 하나를 선택해주세요.");   
	      System.out.println("1. 영화 투표하기");
	      System.out.println("2. 영화 예매하기");
	      System.out.println("3. 내 영화목록 보기");
	      System.out.println("4. 프로그램 종료");
	      System.out.println("======================");
	      System.out.print("메뉴 번호 입력>> ");
	      return Integer.parseInt(sc.nextLine());
	   }
    public void voteSuccess() {
        System.out.println("선택하신 영화에 투표를 완료했습니다.");
     }
     
     public void voteFail() {
        System.out.println("투표에 실패했습니다.");
     }
     
     public String getAccId(Scanner sc, String kind) {
         System.out.println(kind + "할 계정의 ID를 입력해주세요");
         System.out.print("계정 ID 입력>> ");
         return sc.nextLine();
      }

     public void viewAccountFail() {
        System.out.println("선택하신 계정을 찾을 수 없습니다...(ㅠ_ㅠ) ");
     }
  
     public void viewAccount(AccountDTO ato) {
        System.out.println("선택하신 계정의 정보는 다음과 같습니다.▼ ");
        System.out.println(ato.toString());
     }
     
     public int showLogin0 (Scanner sc) {
         
         System.out.println("===<로그인>===");
         System.out.println("1.회원가입하기  ");
         System.out.println("2.아이디  " );
         System.out.print("메뉴 번호 입력>> ");
         return Integer.parseInt(sc.nextLine());
     
     }

     public AccountDTO joinLogin (Scanner sc) {
        
            AccountDTO dto = null;
            System.out.println("======================");
		    System.out.println("등록할 회원 정보를 입력해주세요.");
		           
		    System.out.print("아이디 = ");
            String id = sc.nextLine();
            System.out.print("이름= ");
            String name = sc.nextLine();
            dto = new AccountDTO(id,name);
            return  dto;
     
     }
     //회원등록메서드
    public void addJSuccess() {
       System.out.println("회원가입이 되었습니다.");
    }
    public void addJFail() {
       System.out.println("회원가입에 실패하였습니다.");
       }


     
     
}