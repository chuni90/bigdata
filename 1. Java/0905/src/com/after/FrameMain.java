package com.after;
import javax.swing.*;
import java.awt.*;

public class FrameMain extends JFrame{
	JTextField t = new JTextField(10); 	// �ؽ�Ʈ ���� ��ü �߰�. ��ȣ ���� ���ڰ� ������ ũ�⸦ �ǹ���
	JButton b = new JButton("����");  	// ��ư ��ü. ��ȣ ���� ���ڿ��� ��ư�� �� ���ڿ���
 	JPanel p = new JPanel();			// �г� ��ü.
	
	// JFrame���� �������̵� ������, �������ϴ� ���� �ƴϱ⿡ ���� super�� �ʿ����.
	public FrameMain() {
		setSize(500,500);
		setVisible(true);
		add(p);		// �г�(=��ȭ��) �߰�
		p.add(t);	// �гο� �ؽ�Ʈ ���� �߰�
		p.add(b);  	// �гο� ��ư �߰�
		
	}
	
	// �θ� �޼ҵ带 ������ �ϸ鼭 ���ÿ� ����ϴ� ���
//	public void setSize(int x, int y) {
//		super.setSize(300, 300);
//	}

	public static void main(String[] args) {
		
		FrameMain f = new FrameMain();
		
	}
	
}
