package kwaje;

import java.util.Scanner;

/*
��â��!

�л��� �й�(����), �̸�, �ڹ� ����, �˰��� ����, SPRING������ �Է¹޾� 
�й� �̸� ����3 ���� ����� �μ��ϴ� �ڹ����α׷��� �ۼ��Ͻÿ�.abstract
��, 3���� ���ӹ޾� ���ʷ� ����ϸ� �ڸ����� �� ���߾������� printf�� ����ϸ�
����� �Ҽ����� 2�ڸ����� ���
*/

/*
 * 
A31435 ������ 100 30 70
A34132 ���ع� 30 100 90
A34543 ������ 90 100 80
 *
*/


public class Kwaje1 {
	public static void main(String[] args) {
		
		String num, name;
		int javaScore, algoScore, springScore;
		String num1, name1;
		int javaScore1, algoScore1, springScore1;
		String num2, name2;
		int javaScore2, algoScore2, springScore2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ����� ������ �Է��ϼ���. (�й� �̸� java���� �˰������� ����������)");
		num = sc.next();
		name = sc.next();
		javaScore = sc.nextInt();
		algoScore = sc.nextInt();
		springScore = sc.nextInt();
		
		System.out.println("�ι�° ����� ������ �Է��ϼ���. (�й� �̸� java���� �˰������� ����������)");
		num1 = sc.next();
		name1 = sc.next();
		javaScore1 = sc.nextInt();
		algoScore1 = sc.nextInt();
		springScore1 = sc.nextInt();
		
		System.out.println("����° ����� ������ �Է��ϼ���. (�й� �̸� java���� �˰������� ����������)");
		num2 = sc.next();
		name2 = sc.next();
		javaScore2 = sc.nextInt();
		algoScore2 = sc.nextInt();
		springScore2 = sc.nextInt();
		
		 
		System.out.println("                                                      ���츮�� ����ǥ��");
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("%10s\t%10s\t%12s\t%12s%18s\t%8s\t%12s\n", "�й�", "�̸�", "�ڹ�", "�˰���", "������", "����","���");
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("%-10s%-10s%10d%10d%10d%10d%10.2f\n",num, name, javaScore, algoScore, springScore, 
				javaScore+algoScore+springScore,(float)((javaScore+algoScore+springScore)/3)); //first
		System.out.printf("%-10s%-10s%10d%10d%10d%10d%10.2f\n",num1, name1, javaScore1, algoScore1, springScore1, 
				javaScore1+algoScore1+springScore1,(float)(javaScore1+algoScore1+springScore1)/3); //second
		System.out.printf("%-10s%-10s%10d%10d%10d%10d%10.2f\n",num2, name2, javaScore2, algoScore2, springScore2, 
				javaScore2+algoScore2+springScore2,(float)(javaScore2+algoScore2+springScore2)/3); //last
		System.out.println("---------------------------------------------------------------------");
		sc.close();
	}
}
