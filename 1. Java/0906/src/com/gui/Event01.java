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
	
		p.add(l);	// JLable �гο� �߰�
		p.add(b);	// JButton �гο� �߰�
		
		add(p);  // �����ӿ� �г� �߰�
		b.addActionListener(this); //Gui04 class�� ��ư�� �׼Ǹ����ʸ� ���� = �̺�Ʈ �ҽ� ���
		setVisible(true);
		setTitle("event practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		b.setText("Yeah~ Mission Success");
		b.setForeground(Color.pink);	// setForgroud() �۾��� ����
		
		
		//		System.out.print();
//		JButton b = (JButton)e.getSource();   // ���õ� ��ư�� �˾Ƴ���.
//		
//		if(b.getText().equals("Click the Button!!")) {
//			b.setText("Yeah~ Mission success");   //�˾ƿ� ��ư�� text�� "Action"�̸� "��" �̶�� text�� �ٲ��ش�.
//			p.setBackground(Color.pink);
//		}else
//			b.setText("Click the Button!!");   //"��"���¶�� �ٽ� "Action"���� �ǵ�����. 

	}
	
	public static void main(String[] args) {

		Event01 e = new Event01();
	}


	

}
