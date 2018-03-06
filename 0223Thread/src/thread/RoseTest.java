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
		RoseTest rt1 = new RoseTest("가");
		RoseTest rt2 = new RoseTest("나");
		RoseTest rt3 = new RoseTest("다");
		
		rt1.setPriority(MAX_PRIORITY);
		rt2.setPriority(MIN_PRIORITY);
		rt3.setPriority(MIN_PRIORITY);
		try {
			rt1.start();
			rt1.join(); //rt1이 끝날때까지 나머지가 기다린다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rt2.start();
		rt3.start();
	}
}

/* 쓰레드의 우선순위
: setPriority()메서드를 이용하여 우선순위를 부여한다(1~10)
  우선순위가 높은 쓰레드는 우선순위가 낮은 쓰레드에 비해 실행시간을 많이 할당 받는다.
  다른 쓰레드에 비해 많은 실행시간을 필요로 한다면 우선순위를 높게 두면 된다.

MAX_PRIORITY    : 우선순위 10(최고순위)
MIN_PRIORITY    : 우선순위 1(최저순위)
NORM_PRIORITY   : 우선순위 5(순위 미지정)

main은 우선순위가 5로 지정되어있다.

join() : 한 쓰레드의 동작이 끝날때까지 대기한다
*/