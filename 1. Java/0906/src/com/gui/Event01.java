package com.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Event01 extends JFrame implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton("Click the Button!!");
	JLabel l = new JLabel("not clicked yet");
//	JPanel p2 = new JPanel();
//	JButton b2 = new JButton("Finally you clicked Button!");
	JLabel l2 = new JLabel("good");
	
	public Event01 () {
		setBounds(10, 10, 500, 350);
	
		p.add(l);	// JLable 패널에 추가
		p.add(b);	// JButton 패널에 추가
		
		add(p);  // 프레임에 패널 추가
		b.addActionListener(this); //Gui04 class의 버튼에 액션리스너를 붙임 = 이벤트 소스 등록
		setVisible(true);
		setTitle("event practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		b.setText("Yeah~ Mission Success");
		b.setForeground(Color.pink);	// setForgroud() 글씨색 변경
		
		
		//		System.out.print();
//		JButton b = (JButton)e.getSource();   // 선택된 버튼을 알아낸다.
//		
//		if(b.getText().equals("Click the Button!!")) {
//			b.setText("Yeah~ Mission success");   //알아온 버튼의 text가 "Action"이면 "뿅" 이라는 text로 바꿔준다.
//			p.setBackground(Color.pink);
//		}else
//			b.setText("Click the Button!!");   //"뿅"상태라면 다시 "Action"으로 되돌린다. 

	}
	
	public static void main(String[] args) {

		Event01 e = new Event01();
	}


	

}
