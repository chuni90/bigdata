package stu.com.svc;

import stu.com.vo.StudentDAO;
import stu.com.vo.StudentDTO;

public class ViewService {

	public StudentDTO getStudent(String id) {
		/*
		 * 입력받은 학번에 해당하는 객체를 데이터베이스에 찾아 액션클래스로 넘겨주는 작업
		 */
		StudentDAO dao = new StudentDAO();
		StudentDTO dto = null;
		
		dto = dao.selectOne(id);

		return dto;
	}
	
	
}
