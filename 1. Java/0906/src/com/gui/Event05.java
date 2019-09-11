package com.gui;

import java.awt.*;    
import java.awt.event.*;
import javax.swing.*;

public class Event05 extends JFrame{

	public Event05() {
		setTitle("**Pizza shop**");
		setBounds(550,350,500,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// GridLayout(행, 열, 수평간격, 수직간격) 
		// 행=0이면 열값에 의해 layout 결정, 반대의 경우도 가능
		setLayout(new GridLayout(0, 2,10,100));    
		
		add(new JButton("B1"));
		add(new JButton("B2"));
		add(new JButton("B3"));
		add(new JButton("B4"));
		add(new JButton("B5"));
		
		setVisible(true);
	}
		
	
	public static void main(String[] args) {
		
		new Event05();
	}

}
