package mov.com.svc;

import mov.com.vo.MovieDAO;

public class RemoveService {

	public boolean delete(int id) {
		
		MovieDAO dao = new MovieDAO();
		int check = dao.deleteMovie(id);
		
		if(check < 1)
			return false;
		else
			return true;
	}

}

