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

		Aircon mega = new Aircon();
		
		mega.turnOn();
		System.out.println(mega.degree);
		
		Watch citizen = new Watch();
		
		System.out.println(citizen.timecheck(10,5));
		
		Phone gal = new Phone();
		
		gal.calling();
		
	}

}
