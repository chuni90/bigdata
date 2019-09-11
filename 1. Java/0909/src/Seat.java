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
	JLabel l2 = new JLabel("�����Ͻ� ��ȭ : " + MovieList.m.substring(0, 7)+" >> �¼��� �������ּ���.");
//	JLabel l2 = new JLabel("<< �¼��� �������ּ���. >>");
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
		l2.setOpaque(true);  // JLable�� �⺻ ������ �����Ǿ� �־ setOpague(true)�� �־���� ���� ������ ������
		l2.setBackground(Color.ORANGE);  
		l2.setForeground(Color.blue);
		l2.setHorizontalAlignment(0);
		l2.setFont(new Font("���� ���", Font.BOLD, 15));
		
		for (int i=1; i<6; i+=1) {
			for (int j=1; j<11; j+=1) {
				JButton Bij= new JButton();
				p2.add(Bij);
				Bij.setText(i+"-"+j+"����");
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
		
		JButton B = (JButton) e.getSource();   // ��B���ٰ� �̺�Ʈ�� �߻��� ��ư�� ����!!!
		for(int i=1; i<6; i+=1) {
			for (int j=1; j<11; j+=1) {
				if (B.getText().equals(i+"-"+j+"����")) {
					B.setText(i+"-"+j+"�Ϸᢾ");
					B.setBackground(Color.pink);
					l3.setText("       ������ �Ϸ�Ǿ����ϴ�. Enjoy your Movie :D ");
					Pop_result pop = new Pop_result();		// ���� ���� �˾�â ����
					
				}else if (B.getText().equals(i+"-"+j+"�Ϸᢾ")) {
					B.setText(i+"-"+j+"����");
					B.setBackground(Color.lightGray);
					l3.setText("       ������ ��ҵǾ����ϴ�. Come again~ ");
					Pop_result pop2 = new Pop_result("���");	// ���� ��� �˾�â ����
				}
			}
		}
		
	}

}

