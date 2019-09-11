package com.gui;

import java.awt.*;    
import java.awt.event.*;
import javax.swing.*;

public class Gui05 extends JFrame{
	JButton b1;
	private JButton b2, b3;
	
	public Gui05 () {
		setTitle("절대위치 Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		JPanel p = new JPanel();
		p.setLayout(null);
		
		b1 = new JButton("#1");
		p.add(b1);

		b2 = new JButton("#2");
		p.add(b2);

		b3 = new JButton("#3");
		p.add(b3);
		
		b1.setBounds(20, 5, 95, 30);
		b2.setBounds(55, 45, 105, 70);
		b3.setBounds(180, 15, 105, 90);
		add(p);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Gui05();
	}

}
