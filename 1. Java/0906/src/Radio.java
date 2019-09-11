
public class Radio implements Uni {

	@Override
	public void volUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void end() {
		System.out.println("I'm End");
	}

	public static void main(String[] args) {
		
		Radio r = new Radio();
		r.end();
		
	}

}
