package mov.com.action;
import javax.swing.*;

public class Pop_result extends JFrame {
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	
	public Pop_result () {
		setBounds(300,300,350,80);
		setTitle("예약 성공 안내");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 이게 있으면 본클라이언트가 같이 꺼짐
		add(p);
		p.add(l);
		l.setText("예약이 성공적으로 되었습니다.");
		setVisible(true);
		
	}
	
	public Pop_result (String cancel) {
		setBounds(300,300,350,80);
		setTitle("예약 취소 안내");
		add(p);
		p.add(l);
		l.setText("예약이 취소됐습니다.");
		setVisible(true);
		
	}

}
