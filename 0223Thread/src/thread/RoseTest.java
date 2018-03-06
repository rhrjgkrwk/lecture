package thread;

public class RoseTest extends Thread{
	private String str;
	
	public RoseTest(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 2000000000; j++);
				System.out.println(str + " " + Thread.currentThread());
		}
	}
	
	public static void main(String[] args) {
		RoseTest rt1 = new RoseTest("��");
		RoseTest rt2 = new RoseTest("��");
		RoseTest rt3 = new RoseTest("��");
		
		rt1.setPriority(MAX_PRIORITY);
		rt2.setPriority(MIN_PRIORITY);
		rt3.setPriority(MIN_PRIORITY);
		try {
			rt1.start();
			rt1.join(); //rt1�� ���������� �������� ��ٸ���.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rt2.start();
		rt3.start();
	}
}

/* �������� �켱����
: setPriority()�޼��带 �̿��Ͽ� �켱������ �ο��Ѵ�(1~10)
  �켱������ ���� ������� �켱������ ���� �����忡 ���� ����ð��� ���� �Ҵ� �޴´�.
  �ٸ� �����忡 ���� ���� ����ð��� �ʿ�� �Ѵٸ� �켱������ ���� �θ� �ȴ�.

MAX_PRIORITY    : �켱���� 10(�ְ����)
MIN_PRIORITY    : �켱���� 1(��������)
NORM_PRIORITY   : �켱���� 5(���� ������)

main�� �켱������ 5�� �����Ǿ��ִ�.

join() : �� �������� ������ ���������� ����Ѵ�
*/