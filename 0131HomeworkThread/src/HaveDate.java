
class DateSuccess extends Thread {
	String mension;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ������ ������ ����.");
		Date1 d2 = new Date1();
		d2.start();
		try {
			d2.join();
			System.out.println();
			System.out.println("��ȭ���� ����.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		System.exit(0);
	}
}

class Date1 extends Thread {
	String mension;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			System.out.println(i + " ���� ����öŸ�� ���� ��~ ��ٷ�");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
}

public class HaveDate {
	public static void main(String[] args) {
		DateSuccess ds = new DateSuccess();
		ds.start();
	}
}
