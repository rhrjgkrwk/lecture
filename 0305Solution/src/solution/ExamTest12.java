package solution;

import java.util.Scanner;

/*[����12]�ʸ� �Է��Ͽ� �а� �ʸ� ����Ͻÿ�
0�� �Էµɶ� ���� ��� �ݺ��Ѵ�
������ �ԷµǸ� �ٽ� �Է��� �޴´�

[������]
�� �Է� : 250
[4]�� [10]�� �Դϴ�

���Է� : -84
���Է� : -12
���Է� : 123
[2]�� [3]�� �Դϴ�
���Է� : 0
���α׷��� �����մϴ�
*/
public class ExamTest12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		do {
			System.out.print("�ʸ� �Է����� : ");
			input = sc.nextInt();
			if (input==0) {
				break;
			}
			else System.out.println("["+input/60+"]�� ["+input%60+"]�ʴ�.");
		} while (true);
		sc.close();
	}
}
