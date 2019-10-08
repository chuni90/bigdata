package mov.com.svc;
import static mov.com.util.ConsoleUtils.*;
import mov.com.vo.SeatDAO;

public class SeatService {

	public boolean book(String seat_id) {
		int check;
		SeatDAO dao = new SeatDAO();
		
		check = dao.bookSeat(seat_id, userId);
		if (check < 1) 
			return false;
		return true;
	}
	
	
	
}
