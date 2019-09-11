package com.test;

class Tv {
	//attribute
	private boolean onOff;
	private int channel;
	private int volume;
	private String channel_name;
	
	//method
	
	//default ������(�Ķ���� ����)�� �ʱⰪ �ٲ㺸��
	public Tv() {
		onOff = false;
		channel = 1;
		volume = 5;
		channel_name = "Meganet";
	}
	
	// �Ķ���� �����ڷ� �ʱⰪ ���� �����ϱ�
	public Tv(boolean x, int y) {
		onOff = x;
		channel = y;
		volume = 5;
	}
	
	void power(String x) {
		if (x.equals("��")) {
			onOff = true;
			System.out.println("���� ��\n");
		}else {
			onOff = false;
			System.out.println("���� ��\n");
		}
	}
////////////////////////////////////
	void move(int x) {
		channel = x;
		System.out.println(this.channel+ "�� ä�η� �̵�\n");
	}
	
	void up(int x) {
		volume = x;
		System.out.println(this.volume+ "���� ����\n");
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
		System.out.printf("������ %s.\n���� %s(%dä��)��û�� �̸�, ������ %d �Դϴ�\n", 
				this.onOff, this.getChannel_name(), this.getChannel(), this.volume);
		}else if (this.onOff==false) {
			System.out.printf("\n������ %s.", this.onOff);
		}
	}
		
}


public class TvMain {

	public static void main(String[] args) {

		Tv lg = new Tv();
		
		lg.power("��");
		lg.status();
				
		lg.move(12);
		lg.up(10);
		lg.setChannel_name("OCN");
		
		lg.power("��");
		lg.status();
		
		
	}

}
