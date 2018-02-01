
/*
	Runable�� �̿��ؼ� �����带 �����غ���.
	- Runnable inferface�� ��ӹް�
	- ��ü ������ Runnable�� ������ Ŭ������ �ν��Ͻ��� �����ؼ�
	- Thread�� �����ڿ� �ִ´�.
*/

class RunnableThread implements Runnable{
	String str;
	public RunnableThread() {
		// TODO Auto-generated constructor stub
	}
	public RunnableThread(String str) {
		this.str = str;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" "+str);
			try {
				//Thread.sleep(11);
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("DONE"+" "+str);
		
	}
}

public class TreadClass {
	public static void main(String[] args) {
		RunnableThread a;
		a= new RunnableThread("�Ʊ� : ����");
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(new RunnableThread("���� : ����"));
		t1.start();
		t2.start();
	}
}
