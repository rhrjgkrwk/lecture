package solution;

import java.io.IOException;
import java.util.Scanner;

/*[����7]���̿� ���� ���̰����� ����Ḧ ����ϴ����α׷��� �ۼ��Ͻÿ�.
����]���̴� �Է� �޾� �����Ͻÿ�.
    65�� �̻� : 10000��
    13�� �̻� 65�� �̸� : 20000��
    6�� �̻� 13�� �̸� : 8000��
    5�� ���� : 5000��

[��� ȭ��] 
���̸� �Է��Ͻÿ� : 30
������  20000���Դϴ�
*/
public class ExamTest07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("���̸� �Է� �ϼ���.");
		int age = Integer.parseInt(sc.next());
		int money = 0;
		
		if (age >= 65) 							money = 10000;
		else if (age < 65 && age >= 13) 	money = 20000;
		else if (age < 13 && age >= 6)  	money = 8000;
		else 											money = 5000;
		
		System.out.println("������ " + money + "�� �Դϴ�.");
		sc.close();
	}
}
