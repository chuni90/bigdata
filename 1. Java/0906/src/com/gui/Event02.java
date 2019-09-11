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
	
//	��ü��.getSource() �̺�Ʈ�� �߻��� ���� �Ӽ��� ������
//  ��ü��.getActionCommand() �̺�Ʈ�� �߻��� ��ư�� �ؽ�Ʈ�� ������
//  ��ü��.getText() �̺�Ʈ�� �߻��� �ؽ�Ʈ�� ������(�ݵ�� ��ư�� �ƴ�)
	
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
