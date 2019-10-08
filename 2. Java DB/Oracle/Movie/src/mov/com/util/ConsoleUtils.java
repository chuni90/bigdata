package mov.com.util;

import java.util.ArrayList;
import java.util.Scanner;

import mov.com.vo.MovieDTO;

public class ConsoleUtils {
	public static String userId;
	
	public int showMenu(Scanner sc) {
		System.out.println("\n☆★☆★ MEGABOX ☆★☆★");
		System.out.println("아래의 메뉴에서 하나를 선택해주세요.");	
		System.out.println("1. 영화 정보 등록");
		System.out.println("2. 영화 정보 수정");
		System.out.println("3. 영화 정보 삭제");
		System.out.println("4. 영화 상세정보 보기");
		System.out.println("5. 전체 영화 살펴보기");
		System.out.println("6. 영화 투표수 확인");
		System.out.println("7. 프로그램 종료");
		System.out.println("======================");
		System.out.print("메뉴 번호 입력>> ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public int showMenu1(Scanner sc) {
		System.out.println("\n☆★☆★ MEGABOX 회원메뉴 ☆★☆★");
		System.out.println("아래의 메뉴에서 하나를 선택해주세요.");	
		System.out.println("1. 영화 투표하기");
		System.out.println("2. 영화 예매하기");
		System.out.println("3. 프로그램 종료");
		System.out.println("======================");
		System.out.print("메뉴 번호 입력>> ");
		return Integer.parseInt(sc.nextLine());
	}
		public int getId(Scanner sc, String kind) {
			System.out.println(kind + "할 영화의 ID를 입력해주세요");
			System.out.print("영화 ID 입력>> ");
			return Integer.parseInt(sc.nextLine());
		}
		
		public String getVoteId(Scanner sc, String kind) {
			System.out.println(kind + "할 영화의 ID를 입력해주세요");
			System.out.print("영화 ID 입력>> ");
			return sc.nextLine();
		}
		
		public void viewFail() {
			System.out.println("선택하신 영화를 찾을 수 없습니다...(ㅠ_ㅠ) ");
		}
	
		public void view(MovieDTO dto) {
			System.out.println("선택하신 영화의 정보는 다음과 같습니다.▼ ");
			System.out.println(dto.toString());
		}

		public String showLogin(Scanner sc) {
			System.out.println("\n☆★☆★ MEGABOX 로그인창 ☆★☆★");
			System.out.print("ID 입력 : ");
			userId = sc.nextLine();
			return userId;
		}
		
		public void show(ArrayList<MovieDTO> list) {
			System.out.println("등록된 영화정보 출력");
			for(int i = 0; i<list.size(); i++) {
				System.out.println(list.get(i));
				System.out.println("------------------------------------");
			}
		}
		
		public void voteSuccess() {
			System.out.println("선택하신 영화에 투표를 완료했습니다.");
		}
		
		public void voteFail() {
			System.out.println("투표에 실패했습니다.");
		}
}
