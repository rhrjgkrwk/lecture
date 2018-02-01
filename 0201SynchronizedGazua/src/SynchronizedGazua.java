/*
	synchrocized를 이용해서 스레드 동기화를 해보자.
	쓰레드의 동기화 : 
	- 한 스레드가 진행 중인 작업을 다른 스레드가 간섭하지 못하도록 막는 것을 스레드의 동기화라고 함
	- 스레드간 공유자원을 배타적으로 사용하기 위함.
	- 임계영역을 두어 동기화를 한다. 메서드 전체를 임계영역으로 둘 수도 있고, 특정 영역만 임계 영역으로 둘 수 있다.

*/

class SyncTest{
	synchronized void a(){ //임계영역으로 지정할 메소드에 synchronized를 붙인다.
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(":ㅁ");
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	synchronized void b(){ //임계영역으로 지정할 메소드에 synchronized를 붙인다.
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
	public void run(){ //synchronized가 걸려있기 때문에 번갈아가며 실행되지 않는다.
		if (soo==1) sync1.a();
		else sync1.b();
	}
}
