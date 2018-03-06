package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bank implements Runnable{
	private long depositMoney=100000;    //�����ܰ�
	private long balance;                //ã�±ݾ�
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName()+"���� � ������");
		
		try{
			System.out.print("����Ͻ� �ݾ��� �Ա��� �ּ���:");
			balance=Long.parseLong(br.readLine());
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		withDraw();    //�ܾװ��
	}
	
	public void withDraw(){
		if(depositMoney >= balance)
		{
			if(balance % 10000 == 0)
			{
				depositMoney = depositMoney - balance;
				System.out.println("���� �ݾ��� " + depositMoney + "�� �Դϴ�\n");
			}else{
				System.out.println("���� ������ �Է��ϼ���\n");
			}
		}else{
			System.out.println("�ܾ��� �����մϴ�");
		}
	}
}















