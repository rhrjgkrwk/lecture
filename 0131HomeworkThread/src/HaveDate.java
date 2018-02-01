
class DateSuccess extends Thread {
	String mension;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰으로 뉴스를 본다.");
		Date1 d2 = new Date1();
		d2.start();
		try {
			d2.join();
			System.out.println();
			System.out.println("영화보러 가좌.");
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
			System.out.println(i + " 지금 지하철타고 가는 중~ 기다려");
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
