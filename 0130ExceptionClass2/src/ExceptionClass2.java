
public class ExceptionClass2 {
	public static void main(String[] args) {
		try {
			kaja();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("���� ���� �޾� ���⼭ ����ó��.");
		}
	}
	static void kaja() throws ArrayIndexOutOfBoundsException{
		String[] aa = new String[10];
		aa[100] = "�� 100��°��.";
	}
}
