class TV {
	
	int channel;
	int size;
	int volume;
	
	boolean onOff;
	
	void print() {
		System.out.println("channel is " + channel + ". and volume is " + volume);
	}
	
}


public class TVMain {

	public static void main(String[] args) {
			
		TV myT = new TV();
		TV yT = new TV();
		
		myT.channel = 11;
		myT.onOff = true;
		
		System.out.println(myT.channel);
		System.out.println(myT.onOff);
		myT.print();
		
		yT.channel = 29;
		yT.onOff = false;

		System.out.println(yT.channel);
		System.out.println(yT.onOff);
		yT.print();
		
		System.out.println(yT + " <<메모리의 주소를 나타냄");  
		System.out.println(myT + " <<메모리의 주소를 나타냄");
		
		
	}

}
