package com.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Event02 extends JFrame implements ActionListener{
	JFrame f = new JFrame("example");
	JPanel p = new JPanel();
	JButton b1 = new JButton("yellow");
	JButton b2 = new JButton("pink");
	
	
	public Event02() {
		setBounds(20, 20, 400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(p);
		p.add(b1);
		p.add(b2);
		
	}
	
//	객체명.getSource() 이벤트가 발생한 것의 속성을 가져옴
//  객체명.getActionCommand() 이벤트가 발생된 버튼의 텍스트를 가져옴
//  객체명.getText() 이벤트가 발생한 텍스트를 가져옴(반드시 버튼이 아님)
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="yellow") {
			System.out.println(e.getSource());
			p.setBackground(Color.yellow);
		}else if (e.getSource()==b2) {
			System.out.println(e.getSource());
			p.setBackground(Color.pink);
		}
	}	
	
	public static void main(String[] args) {
		
		Event02 e = new Event02();
	}


	

}
