/*
�����带 �����ؼ� �ٸ� �������� �۾��� ��ٷ�����!
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
			System.out.println("��� �Ϸ� ~~�ڡ١أ�");
		}
	}
}

public class ThreadJoin extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		BB b1 = new BB();
		b1.start();
		System.out.println("����");
		try {
			//join�޼��带 �̿��� b1�� ��ٷ�����.
			System.out.println("b1�� ��ٸ��� �־");
			b1.join(100); 
			/*
			 * join(long ms) 
			 * ��ȣ �ȿ� �ƹ��͵� �ȳ����� b1�� ���� ������ ��ٸ���. 
			 * �ð��� ������ �ð���ŭ ��ٷȴٰ� �ڱ� ���� �Ѵ�.
			 */
			System.out.println("b1 ����!!!!!!!!!!!!!!!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ڹٿ� �Բ�~~~~");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		t1.start();
	}
}	
