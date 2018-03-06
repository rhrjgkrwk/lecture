package thread;

class Demon extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(300);
				System.out.println("Hello");
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

public class MyThreadEx4 {
	public static void main(String[] args) { 
		Demon ob = new Demon();
		ob.setDaemon(true); //main 종료시 같이 종료되도록한다.
		ob.start();
		
		int n = 0;
		while (n<10) {
			n++;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


/*데몬쓰레드(daemon thread)
 * 일반쓰레드(main)가 모두 종료되면 데몬쓰레드(sub)를 강제로 종료한다	
 * 일반쓰레드가 종료되면 데몬쓰레드의 존재 의미가 없기 때문이다
 * ex) 워드프로세서의 자동저장, 화면 자동 갱신등
 */