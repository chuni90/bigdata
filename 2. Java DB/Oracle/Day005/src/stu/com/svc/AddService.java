package stu.com.svc;

import stu.com.vo.StudentDAO;
import stu.com.vo.StudentDTO;

public class AddService {

	public boolean add(StudentDTO dto) {
		/*
		 * 액션 클래스에서 가져온 학생 객체를 DB에 전달한 후, 그 결과를 받아 다시 액션에 넘겨주는 역할
		 * 
		 */
		StudentDAO dao = new StudentDAO();
		int check = dao.makestudent(dto);
		
		if(check > 0) {
			return true;
		}
		return false;
	}
	
	
	
}
