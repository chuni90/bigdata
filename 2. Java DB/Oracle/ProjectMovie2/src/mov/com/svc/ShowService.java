package mov.com.svc;

import java.util.ArrayList;

import mov.com.vo.MovieDAO;
import mov.com.vo.MovieDTO;


public class ShowService {

	public ArrayList<MovieDTO> selectAll() {
		MovieDAO dao = new MovieDAO();
		ArrayList<MovieDTO> list= null;
		list=dao.selectAllMovie();
		
		return list;
		
	}

}
