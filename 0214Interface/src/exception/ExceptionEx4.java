package exception;
//����� ���� ����ó��

class MyException extends Exception{
	public MyException() {
		System.out.println("���ܰ� �߻��ߴ�.");
	}
}

public class ExceptionEx4 {
	public static void main(String[] args) throws MyException {
		int age = Integer.parseInt(args[0]);
		if (age<15) {
			throw new MyException(); //���ܸ� ������ �߻���Ų��.
		}
		else {
			System.out.println("��ſ� �ð� �Ǽ���.");
		}
	}
}
