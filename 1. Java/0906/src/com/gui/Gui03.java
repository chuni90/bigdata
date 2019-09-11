package com.gui;

import javax.swing.JFrame;

public class Gui03 extends JFrame{
	public Gui03() {
		setBounds(10, 10, 300, 300);
		setTitle("windowww");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료가 진짜 가능해지도록 함
		setResizable(false);  // false = 창의 크기 고정(변경 x)
		setVisible(true);
	}
		
	public static void main(String[] args) {

		Gui03 g = new Gui03();
	}

}
