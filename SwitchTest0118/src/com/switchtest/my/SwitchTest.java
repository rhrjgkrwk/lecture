package com.switchtest.my;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�. (0-100)");
		int javaScore = Integer.parseInt(sc.nextLine());
		String grade = "";
		if (javaScore>100||javaScore<0) { 
			System.out.println("�߸��� �����Դϴ�."); 
		}
		else {
			switch (javaScore/10) {
			case 10:
				//grade = "A";
				//break;
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;
			}
			System.out.println("����� ������ "+grade+" �Դϴ�.");
		}
		sc.close();
	}
}
