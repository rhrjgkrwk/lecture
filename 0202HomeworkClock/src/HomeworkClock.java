import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
HomeworkClock

(문제2) Frame을 상속받아 
   GUI 디지털 시계를 만드시오
       	단, Timer t1=new Timer() 사용	

*/
public class HomeworkClock extends Frame{
	private Button btn = new Button("시간을 보여주세요");
	
	private Label labelYear = 	new Label("년");
	private Label labelMonth = 	new Label("월");
	private Label labelDay = 	new Label("일");
	private Label labelHour = 	new Label("시");
	private Label labelMinute = 	new Label("분");
	private Label labelSecond = 	new Label("초");
	
	private TextField textYear = new TextField();
	private TextField textMonth = new TextField();
	private TextField textDay = new TextField();
	private TextField textHour = new TextField();
	private TextField textMinute = new TextField();
	private TextField textSecond = new TextField();
	
	public HomeworkClock() {
		// TODO Auto-generated constructor stub
		this.setLayout(null);
		this.setTitle("시계");
		this.setSize(500, 150);
		this.setForeground(new Color(20, 12, 23));
		this.setBackground(new Color(66, 185, 244));
		
		this.add(textYear);
		textYear.setSize(30, 30);
		textYear.setLocation(20,50);


		this.add(labelYear);
		labelYear.setSize(30, 30);
		labelYear.setLocation(60,50);
		
		this.add(textMonth);
		textMonth.setSize(30, 30);
		textMonth.setLocation(100,50);
		this.add(labelMonth);
		labelMonth.setSize(30, 30);
		labelMonth.setLocation(140,50);
		
		
		this.add(textDay);
		textDay.setSize(30, 30);
		textDay.setLocation(180,50);
		this.add(labelDay);
		labelDay.setSize(30, 30);
		labelDay.setLocation(220,50);
		
		this.add(textHour);
		textHour.setSize(30, 30);
		textHour.setLocation(260,50);
		this.add(labelHour);
		labelHour.setSize(30, 30);
		labelHour.setLocation(300,50);
		
		this.add(textMinute);
		textMinute.setSize(30, 30);
		textMinute.setLocation(340,50);
		this.add(labelMinute);
		labelMinute.setSize(30, 30);
		labelMinute.setLocation(380,50);
		
		this.add(textSecond);
		textSecond.setSize(30, 30);
		textSecond.setLocation(420,50);
		this.add(labelSecond);
		labelSecond.setSize(30, 30);
		labelSecond.setLocation(460,50);
		
		this.add(btn);
		btn.setSize(455, 30);
		btn.setLocation(20, 100);
		btn.setBackground(new Color(66, 185, 244));
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date d = new Date();
				TimerTask tt = new TimerTask() { //
					@Override
					public void run() {
						// TODO Auto-generated method stub
						Date d=new Date();
						SimpleDateFormat sdf = new SimpleDateFormat("yy");
						textYear.setText(sdf.format(d));
						textMonth.setText(String.valueOf(d.getMonth()+1));
						textDay.setText(String.valueOf(d.getDay()));
						textHour.setText(String.valueOf(d.getHours()));
						textMinute.setText(String.valueOf(d.getMinutes()));
						textSecond.setText(String.valueOf(d.getSeconds()));
					}
				};
				Timer timer = new Timer(isActive());
				timer.scheduleAtFixedRate(tt, 1000, 1000);
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent e1){
				dispose(); //객체를 개발자가 직접 지우는 것!
				System.exit(0);
			}
		});
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new HomeworkClock();
	}
	/*
	scheduleAtFixedRate(TimerTask task, long delay, long period)
	Schedules the specified task for repeated fixed-rate execution, beginning after the specified delay.
	*/
}
