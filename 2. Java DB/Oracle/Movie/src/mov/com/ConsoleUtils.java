package mov.com.util;

import java.util.Scanner;

import mov.com.vo.MovieDTO;

public class ConsoleUtils {
	
	public int showMenu(Scanner sc) {
		System.out.println("\n☆★☆★ MEGABOX ☆★☆★");
		System.out.println("아래의 메뉴에서 하나를 선택해주세요.");	
		System.out.println("1. 영화 정보 등록");
		System.out.println("2. 영화 정보 수정");
		System.out.println("3. 영화 정보 삭제");
		System.out.println("4. 영화 상세정보 보기");
		System.out.println("5. 전체 영화 살펴보기");
		System.out.println("6. 프로그램 종료");
		System.out.println("======================");
		System.out.print("메뉴 번호 입력>> ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public String getId(Scanner sc, String kind) {
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

}
