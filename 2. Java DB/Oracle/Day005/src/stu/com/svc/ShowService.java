package stu.com.svc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import stu.com.vo.StudentDAO;
import stu.com.vo.StudentDTO;

public class ShowService {
	
	public ArrayList<StudentDTO> selectAll() {
		StudentDAO dao = new StudentDAO();
		ArrayList<StudentDTO> list = null;
		
		list = dao.selectAllStudent();
		
		return list;
	}
}
