package com.test;

class Tv {
	//attribute
	private boolean onOff;
	private int channel;
	private int volume;
	private String channel_name;
	
	//method
	
	//default 생성자(파라미터 없음)로 초기값 바꿔보기
	public Tv() {
		onOff = false;
		channel = 1;
		volume = 5;
		channel_name = "Meganet";
	}
	
	// 파라미터 생성자로 초기값 내가 설정하기
	public Tv(boolean x, int y) {
		onOff = x;
		channel = y;
		volume = 5;
	}
	
	void power(String x) {
		if (x.equals("켬")) {
			onOff = true;
			System.out.println("전원 켬\n");
		}else {
			onOff = false;
			System.out.println("전원 끔\n");
		}
	}
////////////////////////////////////
	void move(int x) {
		channel = x;
		System.out.println(this.channel+ "번 채널로 이동\n");
	}
	
	void up(int x) {
		volume = x;
		System.out.println(this.volume+ "음량 변경\n");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public String getChannel_name() {
		return channel_name;
	}

	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}
	
	public void status() {
		if (this.onOff==true) {
		System.out.printf("전원은 %s.\n현재 %s(%d채널)시청중 이며, 음량은 %d 입니다\n", 
				this.onOff, this.getChannel_name(), this.getChannel(), this.volume);
		}else if (this.onOff==false) {
			System.out.printf("\n전원은 %s.", this.onOff);
		}
	}
		
}


public class TvMain {

	public static void main(String[] args) {

		Tv lg = new Tv();
		
		lg.power("켬");
		lg.status();
				
		lg.move(12);
		lg.up(10);
		lg.setChannel_name("OCN");
		
		lg.power("끝");
		lg.status();
		
		
	}

}
