import java.util.InputMismatchException;
import java.util.Scanner;
/*
- ����ó���� �غ���!
	- ������ �� ���ɼ��� �ִ� �κ��� 
	- try �������� �δ� �� - �õ��غ��� 
	- catch ���� ������ �������� ó���� ���� �κ�.
	- finally ���� ������ �ؾ��� �κ��� ������� ��!
*/

public class ExceptionHandling {
	public static void main(String[] args) {
		try { // try ���� �õ��غ���
			Scanner sc = new Scanner(System.in);
			System.out.println("���ڸ� �Է��غ���.");
			int i = sc.nextInt();
			System.out.println("���ڸ� �Է��غ���.");
			int j = sc.nextInt();
			int k = i / j;
			System.out.println();
			System.out.println(i + " / " + j + " = " + k);
			sc.close();
		} catch (Exception e) { // ������ �߻��ϸ� ���⼭ ó��
			// TODO: handle exception
			System.out.println();
			System.out.println("���� ���ٴ�..... ů");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally { 
			// ������ ���� ���� ���� ������ ����. 
			//���� �Ҹ��ڸ� ����Ҷ� finally�� �̿��Ѵ�. 
			//ex. ��Ʈ��ũ�� ���� ��
			System.out.println();
			System.out.println("��----��");	
		}
	}
}
