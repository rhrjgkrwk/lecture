/*
	쓰레드를 배워보자.(스레드 만드는 방법은 두 가지가 있다. 
	하나는 Thread 상속, 하나는 Runnable Interface를 구현하는 것.
		- Thread 클래스 상속을 이용한 스레드 생성.
		1. 스레드는 내장 클래스
		2. 스레드를 만들고 싶으면 Thread 클래스를 상속받도록 하자.
		3. 클래스를 만들고 객체를 생성한다.(가동된 것은 아니다.)
		4. start() 메소드를 사용하면 내부적으로 run() - (Thread 안의 메서드) 이라는 메소드를 실행한다.
*/
public class ThreadClass {
	public static void main(String[] args) {
		ThreadExam aa, bb; 
		aa = new ThreadExam(); //스레드 객체가 생성되었다.
		bb = new ThreadExam(); //스레드 객체가 생성되었다.
		
		aa.start(); //스레드 가동 명령 - 객체 생성 후 start를 해줘야 가동이 된다.
		bb.start(); //스레드 가동 명령 - start()하게되면 Thread 객체 내부적으로 run()을 호출한다.
		
	}
}	

class ThreadExam extends Thread{ //스레드 클래스를 상속받으면 쓰레드를 생성할 수 있따.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" 라고 전해라~~");
		//getName은 스레드 객체의 이름을 리턴한다.(생성 순서대로 번호가 붙는다.)
	}
}
