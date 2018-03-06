package thread;

public class MyThreadEx3 implements Runnable{
	String str;
	int num;

	public MyThreadEx3(String str, int num) {
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
		new Thread(new MyThreadEx3("[X]", 100)).start();
		new MyThreadEx2("[Y]", 100).start();
		new MyThreadEx2("[Z]", 100).start();
		}
}
