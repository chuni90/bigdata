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
	JLabel l = new JLabel("�̸�");
	JButton b = new JButton("Ȯ��");
	
	public Gui04 () {
		setBounds(10, 10, 500, 350);
		
		p.add(l);	// JLable �гο� �߰�
		p.add(t);	// JTextField �гο� �߰�
		p.add(b);	// JButton �гο� �߰�
		
		add(p);  // �����ӿ� �г� �߰�
		b.addActionListener(this); //Gui04 class�� ��ư�� �׼Ǹ����ʸ� ���� = �̺�Ʈ �ҽ� ���
		setVisible(true);
		setTitle("�µ���ȯ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent x) { //��ư�� ������ ��ư�� ������ �Ķ����e���� ����
		System.out.println(x);
		p.setBackground(Color.red);
	}
	
	
	public static void main(String[] args) {
		
		Gui04 g = new Gui04();

	}

	

}
