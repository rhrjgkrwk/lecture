/*
쓰레드를 조인해서 다른 쓰레드의 작업을 기다려보자!
*/

class BB extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("즐건 하루 ~~★☆※＠");
		}
	}
}

public class ThreadJoin extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		BB b1 = new BB();
		b1.start();
		System.out.println("정말");
		try {
			//join메서드를 이용해 b1을 기다려보자.
			System.out.println("b1을 기다리구 있어여");
			b1.join(100); 
			/*
			 * join(long ms) 
			 * 괄호 안에 아무것도 안넣으면 b1이 끝날 때까지 기다린다. 
			 * 시간을 넣으면 시간만큼 기다렸다가 자기 일을 한다.
			 */
			System.out.println("b1 종료!!!!!!!!!!!!!!!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("자바와 함께~~~~");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		t1.start();
	}
}	
