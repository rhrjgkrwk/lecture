
class ThreadTest extends Thread{
	String str;
	public ThreadTest(String str) {
		// TODO Auto-generated constructor stub
		this.str = str;
	}
	public void run(){
		for (int i = 0; i <	5; i++) {
			System.out.println(i+1+". "+str);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(str+" DONE");
	}
}
//쓰레드를 너무 많이 쓰면 레지스터에 올라가고 내려가는 오버헤드가 발생할 쑤 이따.
public class Fruit {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest("사과");
		ThreadTest t2= new ThreadTest("배");
		ThreadTest t3= new ThreadTest("감");
		t1.start();
		t2.start();
		t3.start();
	}
}
