package com.andor.my;

import java.util.Scanner;

public class AndOr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("en���� �Է� : ");
		String str = sc.nextLine();
		
		char a = str.charAt(0);//CharAt�� �Ẹ��!
		
		if ('0'<=a&&a<='9') {
			System.out.println("���ڴ�");
		}
		if (('a'<=a&&a<='z')||('A'<=a&&a<='Z')) {
			System.out.println("�����");
		}
		boolean aaa = true;
		System.out.println(!aaa);//false
		
		String n = "when ";
		n+="I was just a little girl ";
		n+="����� ���̵� �̷�";
		System.out.println(n);
		
		sc.close();
	}
	
}
