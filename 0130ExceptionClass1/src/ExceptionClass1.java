import java.util.InputMismatchException;
import java.util.Scanner;
/*
File I/O �ϱ� ���� ����ó���� �� �� �ٷ���.
*/

public class ExceptionClass1 {
	public static void main(String[] args) {
		try { // try ���� �õ��غ���
			Scanner sc = new Scanner(System.in);
			System.out.println("���ڸ� �Է��غ���.");
			int i = Integer.parseInt(sc.nextLine());
			System.out.println("���ڸ� �Է��غ���.");
			int j = Integer.parseInt(sc.nextLine());
			if (j==0) {
				System.out.println("0���� ���� �� ���ٰ� ���ض�~~");
				throw new ArithmeticException("������!"); //������ 
			}
			int k = i / j;
			System.out.println();
			System.out.println(i + " / " + j + " = " + k);
			sc.close();
			
			/*} catch (InputMismatchException e1) {
			System.out.println("���ڷ� �Է��ϼ���.");
		} catch (NumberFormatException e1) {
			System.out.println("���ڷ� �Է��ϼ���.1");
		} catch (ArithmeticException e2) {
			System.out.println("�и� 0 ���� ������");
		} catch (Exception e) { // ������ �߻��ϸ� ���⼭ ó��
			// TODO: handle exception
			System.out.println();
			System.out.println("���� ���ٴ�..... ");
			e.printStackTrace();
			System.out.println(e.getMessage());*/
		} finally {
			// ������ ���� ���� ���� ������ ����.
			// ���� �Ҹ��ڸ� ����Ҷ� finally�� �̿��Ѵ�.
			// ex. ��Ʈ��ũ�� ���� ��
			System.out.println();
			System.out.println("��----��");
		}
	}
}
