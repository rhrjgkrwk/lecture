package solution;

import java.io.IOException;
import java.util.Scanner;

/*
[����4]�⵵�� �Է¹޾� ����/��� ���ϱ�
(����) 
��⵵�� 4�� ������ �������� �� 
��⵵�� 100���� ������ �������� �ʰų� 
   �⵵�� 400���� ������ �������� ��
�� ��� ���� �Ѵ� �����ؾ� ��
[����] 4(����), 100(���), 400(����)�� 

[��� ȭ��]
�⵵ �Է� : 2000
����

�⵵ �Է� : 2001
���

�⵵ �Է� : 2004
����
*/
public class ExamTest04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int year;
		
		System.out.print("�⵵ �Է� : ");		year=sc.nextInt();
		if(year%4==0 && (year%100 != 0) || year%400==0){
			System.out.println("����");
		}else{
			System.out.println("���");
		}
		sc.close();	
	}
}



