package mov.com.svc;

import mov.com.vo.MovieDAO;
import mov.com.vo.MovieDTO;

public class ModifyService {

	public MovieDTO getMovie(int id) {
		MovieDAO dao = new MovieDAO();
		MovieDTO dto = null;
		dto = dao.selectOne(id);
		
		return dto;
	}

	public boolean update(MovieDTO newMovie) {
		MovieDAO dao = new MovieDAO();
		int check = dao.updateMovie(newMovie);
		
		if(check < 1)
			return false; 
		else
			return true; 
		
	}

}
