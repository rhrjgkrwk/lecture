package com.andor.my;

import java.util.Scanner;

public class AndOr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("en글자 입력 : ");
		String str = sc.nextLine();
		
		char a = str.charAt(0);//CharAt을 써보자!
		
		if ('0'<=a&&a<='9') {
			System.out.println("숫자당");
		}
		if (('a'<=a&&a<='z')||('A'<=a&&a<='Z')) {
			System.out.println("영어당");
		}
		boolean aaa = true;
		System.out.println(!aaa);//false
		
		String n = "when ";
		n+="I was just a little girl ";
		n+="김댕의 사이드 미러";
		System.out.println(n);
		
		sc.close();
	}
	
}
