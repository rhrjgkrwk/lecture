import java.time.Clock;
import java.util.Scanner; 
/*�ٸ� ��Ű���� �ִ� Ŭ������ ������ ���� ���� Ű����.

*/
public class ScannerProject { //User defined class 
	public static void main(String[] args) {
		/*
		����� : 1. Ű���� 2. ���� 3. winform
		Scanner ����Ŭ����
		*/		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ּ��� : ");
		int a = sc.nextInt(); //��ü.�޼ҵ�
		System.out.println("����  "+a);
		
		System.out.print("���� �ּ��� : ");
		String s = sc.next();
		sc.close();
	}
}
