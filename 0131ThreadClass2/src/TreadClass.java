
/*
	Runable을 이용해서 쓰레드를 생성해보자.
	- Runnable inferface를 상속받고
	- 객체 생성시 Runnable을 구현한 클래스의 인스턴스를 생성해서
	- Thread의 생성자에 넣는다.
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
		a= new RunnableThread("아군 : 빵빵");
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(new RunnableThread("적군 : 빠방"));
		t1.start();
		t2.start();
	}
}
