
class SimpleThread extends Thread{
	String str;
	public SimpleThread() {
		// TODO Auto-generated constructor stub
	}
	public SimpleThread(String str) {
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


public class SuddenAttack {
	public static void main(String[] args) {
		SimpleThread a = new SimpleThread("�Ʊ� : ����");
		SimpleThread b = new SimpleThread("���� : �߾�");
		
		a.start();
		b.start();
		
		System.out.println("Main End");
	}
}