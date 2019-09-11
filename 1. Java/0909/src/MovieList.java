import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class MovieList extends JFrame implements ActionListener{
	public static String m;
	
	JFrame f = new JFrame();
	JPanel p_base = new JPanel(new GridLayout(1,3));
	JPanel p1 = new JPanel(new GridLayout(0,1));
	JPanel p2 = new JPanel(new GridLayout(0,1));
	JPanel p3 = new JPanel(new GridLayout(0,1));
	Font head = new Font("맑은 고딕", Font.BOLD, 30);
	Font text = new Font("맑은 고딕", Font.PLAIN, 25);
	
	// p1 요소 생성
	JLabel p1_l1 = new JLabel("Movie 1");
	ImageIcon p1_ic  = new ImageIcon("./src/poster1.png");
	JLabel p1_l2 = new JLabel(p1_ic);
	JLabel p1_l3 = new JLabel("줄거리 : blah blah ");
	JButton p1_b1 = new JButton(p1_l1.getText()+" >> 예매하러 가기");
	
	// p2 요소 생성
	JLabel p2_l1 = new JLabel("Movie 2");
	ImageIcon p2_ic  = new ImageIcon("./src/poster2.png");
	JLabel p2_l2 = new JLabel(p2_ic);
	JLabel p2_l3 = new JLabel("줄거리 : blah blah ");
	JButton p2_b1 = new JButton(p2_l1.getText()+" >> 예매하러 가기");

	// p3 요소 생성
	JLabel p3_l1 = new JLabel("Movie 3");
	ImageIcon p3_ic  = new ImageIcon("./src/poster3.png");
	JLabel p3_l2 = new JLabel(p3_ic);
	JLabel p3_l3 = new JLabel("줄거리 : blah blah ");
	JButton p3_b1 = new JButton(p3_l1.getText()+" >> 예매하러 가기");
	
	
	public MovieList() {
		setSize(1000,1000);
		setTitle("Weekly Moive");
		setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 본격 Frame 내 패널 및 요소들 생성
		// p1 생성
		add(p_base);
		p_base.add(p1);
		p1.setBackground(Color.white);
		p1.add(p1_l1);
		p1.add(p1_l2);
		p1.add(p1_l3);
		// 라벨들의 폰트 설정
		p1_l1.setHorizontalAlignment(JLabel.CENTER);
		p1_l1.setFont(head);
		p1_l3.setHorizontalAlignment(JLabel.CENTER);
		p1_l3.setFont(text);
		// 박스 생성 및 박스에 리스너 붙이기
		p1.add(p1_b1);
		p1_b1.addActionListener(this);
		
		p_base.add(p2);
		p2.add(p2_l1);
		p2.add(p2_l2);
		p2.add(p2_l3);
		p2_l1.setHorizontalAlignment(JLabel.CENTER);
		p2_l1.setFont(head);
		p2_l3.setHorizontalAlignment(JLabel.CENTER);
		p2_l3.setFont(text);
		p2.add(p2_b1);
		p2_b1.addActionListener(this);
		
		p_base.add(p3);
		p3.setBackground(Color.white);
		p3.add(p3_l1);
		p3.add(p3_l2);
		p3.add(p3_l3);
		p3_l1.setHorizontalAlignment(JLabel.CENTER);
		p3_l1.setFont(head);
		p3_l3.setHorizontalAlignment(JLabel.CENTER);
		p3_l3.setFont(text);
		p3.add(p3_b1);
		p3_b1.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MovieList ml = new MovieList();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton B = (JButton) e.getSource();
		m = B.getText();
		Seat g = new Seat();
		
	}

}
