package exception;
//사용자 정의 예외처리

class MyException extends Exception{
	public MyException() {
		System.out.println("예외가 발생했다.");
	}
}

public class ExceptionEx4 {
	public static void main(String[] args) throws MyException {
		int age = Integer.parseInt(args[0]);
		if (age<15) {
			throw new MyException(); //예외를 강제로 발생시킨다.
		}
		else {
			System.out.println("즐거운 시간 되세요.");
		}
	}
}
