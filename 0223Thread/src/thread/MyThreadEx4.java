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
		ob.setDaemon(true); //main ����� ���� ����ǵ����Ѵ�.
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


/*���󾲷���(daemon thread)
 * �Ϲݾ�����(main)�� ��� ����Ǹ� ���󾲷���(sub)�� ������ �����Ѵ�	
 * �Ϲݾ����尡 ����Ǹ� ���󾲷����� ���� �ǹ̰� ���� �����̴�
 * ex) �������μ����� �ڵ�����, ȭ�� �ڵ� ���ŵ�
 */