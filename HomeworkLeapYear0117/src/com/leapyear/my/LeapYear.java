package com.leapyear.my;

import java.util.Scanner;

/*
 *  � �ذ� �������� �ƴ��� �˾ƺ���!
 *  ���� ���� : 365.2422�� - 30km/s
 *  4�⿡ 1���� ����
 *  100�⿡ �ѹ��� ���
 *  400�⿡ �ѹ��� ����.
 *  ������ 2���� 29��  
 *  
 */

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year : ");
		
		int year = sc.nextInt();
		boolean yoon = false;
		
		yoon = ((year%4 == 0)&&(year%100!=0))? true :   year%400==0 ? true : false; 
		//		             �� Ȯ���� ����                      ������ ���ǿ� �ش���� �ʴ� �� �� 400���� ������ �������� �͵� ����.
		//(4�� ����������鼭 100���� ������ �������� �ʴ� ��)
		yoon = (year%4==0&&year%100!=0||year%400==0) ? true:false;
		System.out.println(yoon ? year+"���� �����Դϴ�." : year+"���� ����Դϴ�.");
		sc.close();
	}
}
