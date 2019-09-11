package com.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rock extends JFrame implements ActionListener {
	JFrame f = new JFrame();
	JPanel p1 = new JPanel();
	JTextField t1 = new JTextField(10);
	JTextField t2 = new JTextField(10);
	JButton b1 = new JButton("Rock");
	JButton b2 = new JButton("Sissors");
	JButton b3 = new JButton("Paper");
	
	public Rock () {
		setSize(500,300);
		setTitle("가위-바위-보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1.setLayout(new GridLayout(0,3));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		add(t1, BorderLayout.NORTH);
		t1.setText("아래의 버튼 중 하나 클릭");
		add(p1);
		add(t2,BorderLayout.SOUTH);
		
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		t2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int user = 0;
		int ran;
		int com = 0;
		
		ran = (int) (Math.random()*100);
		if (ran % 3 == 0) {
			com = 0;				
		}else if (ran % 3 == 1) {
			com = 1;
		}else if (ran % 3 == 2) {
			com = 2;
		}
		
		
		if (e.getActionCommand() == b1.getText()) {
			user = 0;
			if (com == 0) 
				t2.setText("비겼음");
			else if (com == 1)
				t2.setText("이겼음");
			else if (com == 2)
				t2.setText("졌음");
		}else if (e.getActionCommand() == b2.getText()) {
			user = 1;
			if (com == 0) 
				t2.setText("졌음");
			else if (com == 1)
				t2.setText("비겼음");
			else if (com == 2)
				t2.setText("이겼음");
		}else if (e.getActionCommand() == b3.getText()) {
			user = 2;
			if (com == 0) 
				t2.setText("이겼음");
			else if (com == 1)
				t2.setText("졌음");
			else if (com == 2)
				t2.setText("비겼음");
			
		}
		System.out.println("User: "+ user + "\nCom: " + com);
	}
	public static void main(String[] args) {
		
		Rock r = new Rock();
		
		
		
		
	}


	

}
