package stu.com.svc;

import stu.com.vo.StudentDAO;
import stu.com.vo.StudentDTO;

public class ModifyService {

	public StudentDTO getStudent(String id) {
		StudentDAO dao = new StudentDAO();
		StudentDTO dto = null;
		
		dto = dao.selectOne(id);
		return dto;
	}
	
	public boolean update(StudentDTO newStudent) {
		StudentDAO dao = new StudentDAO();
		int check = dao.updateStudent(newStudent);
		
		if (check <1)
			return false;
		else
			return true;
	}
}
