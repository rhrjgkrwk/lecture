package com.bmi.my;

import java.util.Scanner;

/*
 * BMI�� �񸸵��ε���
������/(Ű�� ����)��
30�̻� ��
25-30 ��ü��
20-25 ����
20�̸� ��ü��

���� :  BMI 20~25, 
��ü��(1�� ��) : BMI 25~29.9, 
��(2�� ��) : BMI 30~40, 
���� : BMI 40.1 �̻��� ���Ѵ�.

*/

public class BmiProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Ը� �Է��ϼ���(kg) : ");
		double weight=sc.nextDouble();
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height=sc.nextDouble();
		double bmi = Math.round(weight/Math.pow(height/100,2)*100)/100.0;
		
		System.out.printf("����� BMI������ %.2f �Դϴ�.\n",bmi);
		/*
		if (18.5>bmi) {//��ü��
			System.out.println("����� ��ü���Դϴ�.");
		}
		else if (23>bmi) {//����
			System.out.println("����� ����ü���Դϴ�.");
		}
		else if (25>bmi) {//��ü��
			System.out.println("����� �������Դϴ�.");
		}
		else if (30>bmi) {//1����
			System.out.println("����� 1�� ���Դϴ�.");
		}
		else if (40>bmi) {//2����
			System.out.println("����� 2�����Դϴ�.");
		}
		else { //��
			System.out.println("����� �����Դϴ�.");
		}*/
		
		String result = null; //if������ ���� �ּ�ó���� �κ�ó�� sysout�� ������ ��� �� ���� string ������ �޾Ƽ� �ϴ� ���� �� ���.
		if (18.5>bmi) {//��ü��
			result = "����� ��ü���Դϴ�.";
		}
		else if (23>bmi) {//����
			result = "����� ����ü���Դϴ�.";
		}
		else if (25>bmi) {//��ü��
			result = "����� ��ü���Դϴ�.";
		}
		else if (30>bmi) {//1����
			result = "����� 1�����Դϴ�.";
		}
		else if (40>bmi) {//2����
			result = "����� 2�����Դϴ�.";
		}
		else { //��
			result = "����� �����Դϴ�.";
		}
		System.out.println(result);
		sc.close();
	}
}
