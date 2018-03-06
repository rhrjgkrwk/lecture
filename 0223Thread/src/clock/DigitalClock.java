package clock;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.Random;

public class DigitalClock extends Frame implements Runnable{
	public DigitalClock(String title){
		super(title);
		
		super.setBackground(new Color(255,255,0));
		super.setBounds(150,150,500,150);
		super.setVisible(true);
		super.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e){
						System.exit(0);
					}
		});
	}
	//--------------------------------------------------------------
	@Override
	public void paint(Graphics g) {
		Random rd=new Random();
		int x=rd.nextInt(this.getWidth());        //�������� ���� ����
		int y=rd.nextInt(this.getHeight());       //�������� ���̸� ����
		
		int cr=rd.nextInt(256);
		int cg=rd.nextInt(256);
		int cb=rd.nextInt(256);
		int sw=rd.nextInt(2);
		
		g.setColor(new Color(cr,cg,cb));
		if(sw==0)
			g.fillRect(x, y, 30, 30);    //ä���� �ð���
		else
			g.fillOval(x, y, 30, 30);    //ä���� ��
		
		//---------------------------------------
		Calendar ca=Calendar.getInstance();
		int year=ca.get(Calendar.YEAR);
		int month=ca.get(Calendar.MONTH)+1;
		int date=ca.get(Calendar.DATE);
		
		int hh=ca.get(Calendar.HOUR);
		int mm=ca.get(Calendar.MINUTE);
		int ss=ca.get(Calendar.SECOND);
		
		String day="������ " + year+ "�� " + month + "�� " + date +"�� �Դϴ�";
		String time="����ð��� " + hh+ "�� " + mm + "�� " + ss +"�� �Դϴ�";
		
		g.setFont(new Font("����ü", Font.BOLD, 20));
		g.setColor(Color.black);
		
		g.drawString(day, 50, 70);
		g.drawString(time, 50, 110);
		
		super.paint(g);
	}
	@Override
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(1000);
				repaint();               // update() -->  paint()������ ȣ��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}	
}




















