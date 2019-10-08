package mov.com.svc;

import mov.com.vo.MovieDAO;
import mov.com.vo.MovieDTO;

public class ViewService {

	public MovieDTO getMovie(int id) {
		MovieDTO dto = null;
		MovieDAO dao = new MovieDAO();
		
		dto = dao.selectOne(id);
		return dto;
	}
}
