package solution;

import java.util.Scanner;

/*[����8]3�ڸ� ������ �Է¹޾Ƽ� ���� �ڸ����� ���� ���Ͻÿ�.

[��� ȭ��]
3�ڸ� ������ �Է��ϼ��� :457
3�ڸ��� ���� 16 �Դϴ�.
*/
public class ExamTest08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3�ڸ� ������ �Է��ϼ��� :");
		int num = Integer.parseInt(sc.next());
		int num_100, num_10, num_1;
		
		num_100 = num / 100;	num = num % 100;
		num_10 = num / 10;		num = num % 10;
		num_1 = num / 1;
		System.out.printf("3�ڸ��� ���� %d �Դϴ�.\n", num_100 + num_10 + num_1);
		sc.close();
	}
}
