/*
	synchrocized�� �̿��ؼ� ������ ����ȭ�� �غ���.
	�������� ����ȭ : 
	- �� �����尡 ���� ���� �۾��� �ٸ� �����尡 �������� ���ϵ��� ���� ���� �������� ����ȭ��� ��
	- �����尣 �����ڿ��� ��Ÿ������ ����ϱ� ����.
	- �Ӱ迵���� �ξ� ����ȭ�� �Ѵ�. �޼��� ��ü�� �Ӱ迵������ �� ���� �ְ�, Ư�� ������ �Ӱ� �������� �� �� �ִ�.

*/

class SyncTest{
	synchronized void a(){ //�Ӱ迵������ ������ �޼ҵ忡 synchronized�� ���δ�.
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(":��");
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	synchronized void b(){ //�Ӱ迵������ ������ �޼ҵ忡 synchronized�� ���δ�.
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(":o");
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class SynchronizedGazua extends Thread{
	int soo;
	SyncTest sync1; 
	
	public SynchronizedGazua(int soo, SyncTest sync1) {
		// TODO Auto-generated constructor stub
		this.soo = soo;
		this.sync1 = sync1;
	}
	
	public static void main(String[] args) {
		SyncTest sync1 = new SyncTest();
		SynchronizedGazua s1 = new SynchronizedGazua(1, sync1);
		SynchronizedGazua s2 = new SynchronizedGazua(2, sync1);
		s1.start();
		s2.start();
			
		synchronized (s2) {
			System.out.println("main Done");
		}
	}
	public void run(){ //synchronized�� �ɷ��ֱ� ������ �����ư��� ������� �ʴ´�.
		if (soo==1) sync1.a();
		else sync1.b();
	}
}
