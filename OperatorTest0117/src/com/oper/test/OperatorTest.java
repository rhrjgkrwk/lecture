package com.oper.test;

import java.util.Scanner;

/* �⵵�� �Է¹޾� ¦���ظ� ���� �������� 
 * Ȧ���� �Ű��Բ� �������ڸ� ����ϴ� �ڹ� ���α׷�*/

public class OperatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int year = sc.nextInt();
		String str = (year%2 == 0) ? "���� ���������" : "�Ű��Բ� �����";
		String str1 = (year/2 == year/2.0) ? "���� ���������" : "�Ű��Բ� �����"; //����/����=����, ����/�Ǽ�=�Ǽ� �̿��Ͽ� ��.
		System.out.println(str);
		System.out.println(str1);
		System.out.println((year%2 == 0) ? "���� ���������" : "�Ű��Բ� �����");
		*/
		//���ڸ� ������ ���ڷ� �ް� ���� ���ڷ� �ٲ㺸��
		
		System.out.print("�⵵ �Է� : ");
		String str2 = sc.nextLine();
		
		int a = Integer.parseInt(str2);
		System.out.println(a+"�⿡��");
		System.out.println((a%2 == 0) ? "���� ���������" : "�Ű��Բ� ���������");
		sc.close();
		
		//null�� ���� �˾ƺ���
		String str3 = null;
		System.out.println(str3=="");
		if (str3==null || str3=="" || str3.length() <= 0) {
			//� ���� ����ִ� ��츦 üũ�� �� 3 ���� ������ ��� �����ؼ� ����� ���� ����.
		
		}
		str3 = "";
		if (str3.length()<1) {
			System.out.println("DD");
		}
		
		//���� ������ - ��ġ/��ġ �ܵ����� ���϶��� ���� X
		
		int aaa=100;
		System.out.println(aaa++); //100 ��ġ ������ : print -> incre
		System.out.println(aaa);     //101
		System.out.println(++aaa); //102 ��ġ ������ : incre -> print
		System.out.println(aaa);     //102
		
		char ccc = 'a';
		System.out.println(ccc++);
		System.out.println(ccc);
		System.out.println(++ccc);
		
		//char�� ���ڸ� int�� �ٲ㺸��. ascii�ڵ� & char - char = int  Ȱ��
		//���ذ��� ������. ���ڸ� ���ڷ� ������ ������ -'0'
		
		char num = '3';
		int soo = num - '0';
		//���ڿ��� ���ڷ� �ٲܶ��� Integer.parseInt() �� �̿�
		String num1 = "300";
		int soo1 = Integer.parseInt(num1);	
		
		System.out.printf("%d  %d",soo, soo1); // 3 300
	}
}
