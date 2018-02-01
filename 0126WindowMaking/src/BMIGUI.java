import java.awt.*;
import java.awt.event.*;

class BMIGUI2 extends Frame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 440815718830774954L;
	/*
	actionListener는 무엇 : 
	event 컴터에서 뭔가 움직임이 발생하는 것을 Event라고 한다.
	*/
	private Button b1 = new Button("눌러봐");
	private Label l1 = new Label("키");
	private Label l2 = new Label("몸무게");
	private TextField t1 = new TextField(); //키
	private TextField t2 = new TextField(); //몸무게
	private TextField t3 = new TextField(); //결과출력용
	
	public BMIGUI2() {
		// TODO Auto-generated constructor stub
		this.setLayout(null); //null로 하면 마음대로 배치하느넋.
		this.setTitle("BMI");
		this.setSize(300,200);
		
		this.setForeground(new Color(255, 255, 255));
		this.setBackground(new Color(2, 2, 22));
		this.setFont(new Font("고딕",Font.BOLD,11));
		
		this.add(b1);
		b1.setSize(90,55);
		b1.setLocation(190, 50);
		b1.addActionListener(this); //event 설정을 하기 위해서는 리스너를 꼭 붙여붜야함.
		//버튼을 누르는게 이벤트라면 이벤트를 처리하는 함수가 꼭 있어야한다.
		//이러한 처리함수를 event handler라고 한다.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
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
				dispose(); //객체를 개발자가 직접 지우는 것!
				System.exit(0);
				//0이면 정상종료
				//1이면 비정상종료
			}
		});
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e1) { //이것이 이벤트 핸들러!!!!!!
		// TODO Auto-generated method stub
		if (e1.getSource()==b1) {
			int h = Integer.parseInt(t1.getText());
			int w = Integer.parseInt(t2.getText());
			
			double bmi = w / Math.pow(h/100.0,2);
			String result;
			
			
			
			if (18.5>bmi) {//저체중
				result = "당신은 저체중입니다.";
			}
			else if (23>bmi) {//정상
				result = "당신은 정상체중입니다.";
			}
			else if (25>bmi) {//과체중
				result = "당신은 과체중입니다.";
			}
			else if (30>bmi) {//1도비만
				result = "당신은 1도비만입니다.";
			}
			else if (40>bmi) {//2도비만
				result = "당신은 2도비만입니다.";
			}
			else { //고도
				result = "당신은 고도비만입니다.";
			}
			
			t3.setText("당신의 BMI 지수는 "+bmi+" 입니다." + result);
		}
	}
}

public class BMIGUI{	
	public static void main(String[] args) {
		new BMIGUI2();
	}
}