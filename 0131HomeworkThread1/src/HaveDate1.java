class DateNagari extends Thread {
	String mension;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Date1 d2 = new Date1();
		d2.start();
		System.out.println("����Ʈ������ ������ ����.");
		try {
			d2.join(400);

			System.out.println("\n�ʹ� �ʾ���. ���� ����\n�޷�");
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

public class HaveDate1 {
	public static void main(String[] args) {
		DateNagari dn = new DateNagari();
		dn.start();
	}
}
