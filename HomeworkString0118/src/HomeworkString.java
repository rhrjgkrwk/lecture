import java.util.Random;
import java.util.Scanner;

/* ���� ���ڿ��� �Է¹޾�
 * �ش� ���ڿ� �� ���Ƿ� 3���ǹ��ڸ�
 * �������� ����Ͻÿ�.
 * �ߺ���� ����*/

public class HomeworkString {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		String str = sc.nextLine();
		System.out.printf("%c%c%c",
				str.charAt(r.nextInt(str.length())),
				str.charAt(r.nextInt(str.length())),
				str.charAt(r.nextInt(str.length())));
		sc.close();
	}
}
