
public class ExceptionClass2 {
	public static void main(String[] args) {
		try {
			kaja();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("던진 것을 받아 여기서 예외처리.");
		}
	}
	static void kaja() throws ArrayIndexOutOfBoundsException{
		String[] aa = new String[10];
		aa[100] = "야 100번째다.";
	}
}
