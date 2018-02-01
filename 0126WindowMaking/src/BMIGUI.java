import java.awt.*;
import java.awt.event.*;

class BMIGUI2 extends Frame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 440815718830774954L;
	/*
	actionListener�� ���� : 
	event ���Ϳ��� ���� �������� �߻��ϴ� ���� Event��� �Ѵ�.
	*/
	private Button b1 = new Button("������");
	private Label l1 = new Label("Ű");
	private Label l2 = new Label("������");
	private TextField t1 = new TextField(); //Ű
	private TextField t2 = new TextField(); //������
	private TextField t3 = new TextField(); //�����¿�
	
	public BMIGUI2() {
		// TODO Auto-generated constructor stub
		this.setLayout(null); //null�� �ϸ� ������� ��ġ�ϴ���.
		this.setTitle("BMI");
		this.setSize(300,200);
		
		this.setForeground(new Color(255, 255, 255));
		this.setBackground(new Color(2, 2, 22));
		this.setFont(new Font("���",Font.BOLD,11));
		
		this.add(b1);
		b1.setSize(90,55);
		b1.setLocation(190, 50);
		b1.addActionListener(this); //event ������ �ϱ� ���ؼ��� �����ʸ� �� �ٿ��۾���.
		//��ư�� �����°� �̺�Ʈ��� �̺�Ʈ�� ó���ϴ� �Լ��� �� �־���Ѵ�.
		//�̷��� ó���Լ��� event handler��� �Ѵ�.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		b1.setBackground(new Color(0, 0, 0));
		b1.setForeground(new Color(255, 255, 255));
		
		
		this.add(l1);
		l1.setSize(40,25);
		l1.setLocation(20, 50);
		
		this.add(t1);
		t1.setSize(90,25);
		t1.setLocation(90, 50);
		
		this.add(l2);
		l2.setSize(40,25);
		l2.setLocation(20, 80);
		
		this.add(t2);
		t2.setSize(90,25);
		t2.setLocation(90, 80);
		
		this.add(t3);
		t3.setSize(255,50);
		t3.setLocation(20, 120);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent e1){
				dispose(); //��ü�� �����ڰ� ���� ����� ��!
				System.exit(0);
				//0�̸� ��������
				//1�̸� ����������
			}
		});
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e1) { //�̰��� �̺�Ʈ �ڵ鷯!!!!!!
		// TODO Auto-generated method stub
		if (e1.getSource()==b1) {
			int h = Integer.parseInt(t1.getText());
			int w = Integer.parseInt(t2.getText());
			
			double bmi = w / Math.pow(h/100.0,2);
			String result;
			
			
			
			if (18.5>bmi) {//��ü��
				result = "����� ��ü���Դϴ�.";
			}
			else if (23>bmi) {//����
				result = "����� ����ü���Դϴ�.";
			}
			else if (25>bmi) {//��ü��
				result = "����� ��ü���Դϴ�.";
			}
			else if (30>bmi) {//1����
				result = "����� 1�����Դϴ�.";
			}
			else if (40>bmi) {//2����
				result = "����� 2�����Դϴ�.";
			}
			else { //��
				result = "����� �����Դϴ�.";
			}
			
			t3.setText("����� BMI ������ "+bmi+" �Դϴ�." + result);
		}
	}
}

public class BMIGUI{	
	public static void main(String[] args) {
		new BMIGUI2();
	}
}