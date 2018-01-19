package com.iftest.my;

import java.util.Scanner;

/*점수를 입력받아 60점이상이면 pass, 미만이면 fail을 출력하시오.*/
public class IfTest {
	public static void main(String[] args) {
		/*
		 * int aa = 3; int bb = 65;
		 * 
		 * if (aa < bb) { System.out.println("bb가 크네"); } if (aa < 10)
		 * System.out.println("aa10보다 작"); System.out.println("Gazua");
		 */

		//int score;
		Scanner sc = new Scanner(System.in);
		/*System.out.println("점수를 입력하시오.");
		score = sc.nextInt();
		if (score >= 60)
			System.out.println("PASS");
		// if (score<60) System.out.println("FAIL");
		else
			System.out.println("FAIL");*/

		/*
		 * 자바점수가 90-100이면 A 80-89이면 B 70-79 C ---
		 */
		System.out.println("점수를 입력하시오.");
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
