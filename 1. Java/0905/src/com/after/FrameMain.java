package com.after;
import javax.swing.*;
import java.awt.*;

public class FrameMain extends JFrame{
	JTextField t = new JTextField(10); 	// 텍스트 상자 객체 추가. 괄호 안의 숫자가 상자의 크기를 의미함
	JButton b = new JButton("눌러");  	// 버튼 객체. 괄호 안의 문자열이 버튼에 들어갈 문자열임
 	JPanel p = new JPanel();			// 패널 객체.
	
	// JFrame것을 오버라이딩 했지만, 재정의하는 것이 아니기에 굳이 super가 필요없음.
	public FrameMain() {
		setSize(500,500);
		setVisible(true);
		add(p);		// 패널(=도화지) 추가
		p.add(t);	// 패널에 텍스트 상자 추가
		p.add(b);  	// 패널에 버튼 추가
		
	}
	
	// 부모 메소드를 재정의 하면서 동시에 사용하는 모습
//	public void setSize(int x, int y) {
//		super.setSize(300, 300);
//	}

	public static void main(String[] args) {
		
		FrameMain f = new FrameMain();
		
	}
	
}
