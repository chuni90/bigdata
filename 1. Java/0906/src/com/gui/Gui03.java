package com.gui;

import javax.swing.JFrame;

public class Gui03 extends JFrame{
	public Gui03() {
		setBounds(10, 10, 300, 300);
		setTitle("windowww");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷� ���ᰡ ��¥ ������������ ��
		setResizable(false);  // false = â�� ũ�� ����(���� x)
		setVisible(true);
	}
		
	public static void main(String[] args) {

		Gui03 g = new Gui03();
	}

}
