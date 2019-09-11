package com.gui;

import java.awt.*;    
import java.awt.event.*;
import javax.swing.*;



public class Event04 extends JFrame {
//	JFrame f = new JFrame();
	
	public Event04 () {
		setTitle("**Pizza shop**");
		setBounds(550,350,500,500);
		setSize(500,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(new FlowLayout());
		
		add(new JButton("B1"), BorderLayout.NORTH);
		add(new JButton("B2"), BorderLayout.SOUTH);
		add(new JButton("B3"), BorderLayout.WEST);
		add(new JButton("B4"), BorderLayout.EAST);
		add(new JButton("B5"), BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {

		new Event04();
	}


	
	

}
