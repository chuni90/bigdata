import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Seat extends JFrame implements ActionListener{
	
	JFrame f = new JFrame();
	JPanel p_base = new JPanel();
	JPanel p1 = new JPanel(new GridLayout(2, 1));
	JPanel p2 = new JPanel(new GridLayout(5, 10));
	ImageIcon ic  = new ImageIcon("./src/logo.png");
	JLabel l1 = new JLabel(ic);
	JLabel l2 = new JLabel("선택하신 영화 : " + MovieList.m.substring(0, 7)+" >> 좌석을 선택해주세요.");
//	JLabel l2 = new JLabel("<< 좌석을 선택해주세요. >>");
	JLabel l3 = new JLabel();
	
	public Seat() {
		
		setTitle("M E G A hrd BOX : Booking System");
		setSize(1000,430);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(p_base);
		p_base.setBackground(Color.white);
		
		p_base.add(p1);
		p_base.add(p2);
		
		p1.add(l1);
		p1.add(l2);
		l2.setOpaque(true);  // JLable은 기본 색상이 지정되어 있어서 setOpague(true)를 넣어줘야 배경색 지정이 가능함
		l2.setBackground(Color.ORANGE);  
		l2.setForeground(Color.blue);
		l2.setHorizontalAlignment(0);
		l2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		
		for (int i=1; i<6; i+=1) {
			for (int j=1; j<11; j+=1) {
				JButton Bij= new JButton();
				p2.add(Bij);
				Bij.setText(i+"-"+j+"공석");
				Bij.addActionListener(this);
				Bij.setBackground(Color.lightGray);
			}
		}
		add(l3, BorderLayout.SOUTH);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Seat g = new Seat();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton B = (JButton) e.getSource();   // ★B에다가 이벤트가 발생한 버튼을 대입!!!
		for(int i=1; i<6; i+=1) {
			for (int j=1; j<11; j+=1) {
				if (B.getText().equals(i+"-"+j+"공석")) {
					B.setText(i+"-"+j+"완료♥");
					B.setBackground(Color.pink);
					l3.setText("       예약이 완료되었습니다. Enjoy your Movie :D ");
					Pop_result pop = new Pop_result();		// 예약 성공 팝업창 등장
					
				}else if (B.getText().equals(i+"-"+j+"완료♥")) {
					B.setText(i+"-"+j+"공석");
					B.setBackground(Color.lightGray);
					l3.setText("       예약이 취소되었습니다. Come again~ ");
					Pop_result pop2 = new Pop_result("취소");	// 예약 취소 팝업창 등장
				}
			}
		}
		
	}

}

