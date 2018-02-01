
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
//�����带 �ʹ� ���� ���� �������Ϳ� �ö󰡰� �������� ������尡 �߻��� �� �̵�.
public class Fruit {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest("���");
		ThreadTest t2= new ThreadTest("��");
		ThreadTest t3= new ThreadTest("��");
		t1.start();
		t2.start();
		t3.start();
	}
}
