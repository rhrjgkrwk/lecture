package thread;

public class MyThreadEx2 extends Thread{
	String str;
	int num;

	public MyThreadEx2(String str, int num) {
		this.str = str;
		this.num = num;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= num; i++) {
			try {
				System.out.println(str + " : " + i);
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		MyThreadEx2 ob1 = new MyThreadEx2("[X]", 100);
		MyThreadEx2 ob2 = new MyThreadEx2("[Y]", 100);
		MyThreadEx2 ob3 = new MyThreadEx2("[Z]", 100);
		ob1.start();
		ob2.start();
		ob3.start();
	}
}
