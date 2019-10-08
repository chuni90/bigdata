package stu.com.util;

import java.util.ArrayList;
import java.util.Scanner;

import stu.com.vo.StudentDTO;

public class ConsoleUtils {
	
	// 메뉴를 표시하고 사용자가 입력한 메뉴값을 되돌려 주는 메서드
	public int showMenu(Scanner sc) {
		System.out.println("== << MEGA 학적관리 프로그램 >>==");	
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 학생 정보 수정");
		System.out.println("3. 학생 정보 출력");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		System.out.println("======================");
		System.out.print("메뉴 = ");
		return Integer.parseInt(sc.nextLine());
	}
	
	// 학생정보를 등록받아 객체화 한 후 되돌려주는 메서드
	public StudentDTO make(Scanner sc) {
		StudentDTO dto = null;
		System.out.println("등록할 학생 정보를 입력해주세요.");
		System.out.print("학번(X0000) = ");
		String id = sc.nextLine();
		System.out.print("이름 = ");
		String name = sc.nextLine();
		System.out.print("국어 점수 = ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수 = ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수 = ");
		int math = Integer.parseInt(sc.nextLine());
		return new StudentDTO(id, name, kor, eng, math);
	}	
	
	public void addSuccess() {
		System.out.println("학생 등록이 성공");
	}
	
	public void addFail() {
		System.out.println("학생 등록에 실패!!");
	}
	
	// 수정 및 삭제를 위해 학번을 받아 수행하는 메서드
	public String getID(Scanner sc, String kind) {
		System.out.println(kind + "할 학생의 학번을 입력해주세요.");
		System.out.print("학번 >> ");
		return sc.nextLine();
	}
	
	// 학번이 존재하지 않을 경우 표시할 메서드
	public void errorId() {
		System.out.println("입력한 학번은 존재하지 않습니다.");
		
	}
	
	// 기존 학생 정보를 출력하고 새로운 수정된 정보를 되돌려주는 메서드
	public StudentDTO newStudent(Scanner sc, StudentDTO oldStudent) {
		StudentDTO dto = null;
		
		System.out.println("학번을 제외한 수정할 항목을 입력해주세요.");
		System.out.println("학번: " + oldStudent.getId());
		System.out.print(oldStudent.getName() + " ==> ");
		String name = sc.nextLine();
		
		System.out.print("국어점수 " + oldStudent.getKor() + " ==> ");
		int kor = Integer.parseInt(sc.nextLine());

		System.out.print("영어점수 " + oldStudent.getEng() + " ==> ");
		int eng = Integer.parseInt(sc.nextLine());

		System.out.print("수학점수 " + oldStudent.getMath() + " ==> ");
		int math = Integer.parseInt(sc.nextLine());

		dto = new StudentDTO(oldStudent.getId(), name, kor, eng, math);
		
		return dto;
	}
	
	public void updateSuccess() {
		System.out.println("수정이 성공했습니다.");
	}
	
	public void updateFail() {
		System.out.println("수정이 실패했습니다.");
	}
	
	// 학번을 통해 찾아온 학생의 정보를 출력해주는 역할 메서드
	public void view(StudentDTO dto) {
		System.out.println("[Search Result▼]");
		System.out.println(dto.toString());
	}
	
	public void removeSuccess(String id) {
		System.out.println(id + "학번의 학생 | 삭제를 성공했습니다.");
	}
	
	public void removeFail(String id) {
		System.out.println(id + "학번의 학생 | 삭제를 실패했습니다.");
	}
	
	// 전체 학생 정보 출력
	public void show(ArrayList<StudentDTO> list) {
		System.out.println("\n << 등록된 학생 정보 전수 출력▼ >> \n");
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			System.out.println("------------    ---------   -------");
			
		}
		
	}
	
	
}
