package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

import javax.swing.*;

public class Event03 extends JFrame implements ActionListener {
	JFrame f = new JFrame();
	JPanel p_base = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JLabel l1 = new JLabel("Welcome to JAVA Pizza shop. chose the pizza");
	JLabel l2 = new JLabel("Order count");
	JButton b1 = new JButton("Combination");
	JButton b2 = new JButton("Potato");
	JButton b3 = new JButton("Grilled");
	JTextField t = new JTextField(5);

	JPanel p3 = new JPanel();
	JLabel l3 = new JLabel();
	
	public Event03 () {
		setTitle("**Pizza shop**");
		setBounds(550,350,440,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p_base);
		p_base.add(p1);
		p_base.add(p2);
		p_base.add(p3);
		p1.add(l1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(l2);
		p2.add(t);
		
		p3.add(l3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == b1.getText()) {
			l3.setText("you selected>> " + b1.getText());
		}else if (e.getActionCommand() == b2.getText()) {
			l3.setText("you selected>> " + b2.getText());
		}else if (e.getActionCommand() == b3.getText()) {
			l3.setText("you selected>> " + b3.getText());
		}
	}

	public static void main(String[] args) {
		Event03 e = new Event03();
	}


	
}
