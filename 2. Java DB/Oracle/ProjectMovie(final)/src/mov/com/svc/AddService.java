package mov.com.svc;

import mov.com.vo.MovieDAO;
import mov.com.vo.MovieDTO;

public class AddService {

	public boolean add(MovieDTO dto) {

		MovieDAO dao = new MovieDAO();
		int check = dao.makeMovie(dto);
		if(check>0)
			return true;
		
		return false;
	}

	
}
