package com.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui04 extends JFrame implements ActionListener {
	JPanel p = new JPanel();
	JTextField t = new JTextField(10);
	JLabel l = new JLabel("이름");
	JButton b = new JButton("확인");
	
	public Gui04 () {
		setBounds(10, 10, 500, 350);
		
		p.add(l);	// JLable 패널에 추가
		p.add(t);	// JTextField 패널에 추가
		p.add(b);	// JButton 패널에 추가
		
		add(p);  // 프레임에 패널 추가
		b.addActionListener(this); //Gui04 class의 버튼에 액션리스너를 붙임 = 이벤트 소스 등록
		setVisible(true);
		setTitle("온도변환기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent x) { //버튼을 누르면 버튼의 정보가 파라미터e에게 간다
		System.out.println(x);
		p.setBackground(Color.red);
	}
	
	
	public static void main(String[] args) {
		
		Gui04 g = new Gui04();

	}

	

}
