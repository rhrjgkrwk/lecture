package com.iftest.my;

import java.util.Scanner;

/*������ �Է¹޾� 60���̻��̸� pass, �̸��̸� fail�� ����Ͻÿ�.*/
public class IfTest {
	public static void main(String[] args) {
		/*
		 * int aa = 3; int bb = 65;
		 * 
		 * if (aa < bb) { System.out.println("bb�� ũ��"); } if (aa < 10)
		 * System.out.println("aa10���� ��"); System.out.println("Gazua");
		 */

		//int score;
		Scanner sc = new Scanner(System.in);
		/*System.out.println("������ �Է��Ͻÿ�.");
		score = sc.nextInt();
		if (score >= 60)
			System.out.println("PASS");
		// if (score<60) System.out.println("FAIL");
		else
			System.out.println("FAIL");*/

		/*
		 * �ڹ������� 90-100�̸� A 80-89�̸� B 70-79 C ---
		 */
		System.out.println("������ �Է��Ͻÿ�.");
		int javaScore = sc.nextInt();
		
		if (javaScore >= 90) {
			System.out.println("A");
		} else if (80 <= javaScore) {
			System.out.println("B");
		} else if (70 <= javaScore) {
			System.out.println("C");
		} else if (60 <= javaScore) {
			System.out.println("D");
		} else {
			System.out.println("FAIL");
		}

	}
}
