import javax.swing.*;


public class Pop_result extends JFrame{
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	
	public Pop_result () {
		setBounds(300,300,350,80);
		setTitle("���� ���� �ȳ�");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // �̰� ������ ��Ŭ���̾�Ʈ�� ���� ����
		add(p);
		p.add(l);
		l.setText("������ ���������� �Ǿ����ϴ�.");
		setVisible(true);
		
	}
	
	public Pop_result (String cancel) {
		setBounds(300,300,350,80);
		setTitle("���� ��� �ȳ�");
		add(p);
		p.add(l);
		l.setText("������ ��ҵƽ��ϴ�.");
		setVisible(true);
		
	}

}
