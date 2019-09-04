class Phone {
	int p_num ;
	boolean onOff;
	int charge_amount;
	
	void calling() {
		System.out.println("calling...");
	}
}

class Watch {
	int hour;
	int minute;
	
	int timecheck(int x, int y) {
		return x - y;
	}
}

class Aircon {
	int degree;
	String windspeed;
	String brand;
	
	int turnOn() {
		return degree = 23;
	}
}

public class Class_mission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aircon mega = new Aircon();
		
		mega.turnOn();
		System.out.print(mega.degree);
		
	}

}
