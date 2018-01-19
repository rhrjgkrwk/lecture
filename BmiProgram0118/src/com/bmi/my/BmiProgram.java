package com.bmi.my;

import java.util.Scanner;

/*
 * BMI는 비만도인데요
몸무게/(키의 제곱)이
30이상 비만
25-30 과체중
20-25 보통
20미만 저체중

정상 :  BMI 20~25, 
과체중(1도 비만) : BMI 25~29.9, 
비만(2도 비만) : BMI 30~40, 
고도비만 : BMI 40.1 이상을 말한다.

*/

public class BmiProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게를 입력하세요(kg) : ");
		double weight=sc.nextDouble();
		System.out.print("키를 입력하세요(cm) : ");
		double height=sc.nextDouble();
		double bmi = Math.round(weight/Math.pow(height/100,2)*100)/100.0;
		
		System.out.printf("당신의 BMI지수는 %.2f 입니다.\n",bmi);
		/*
		if (18.5>bmi) {//저체중
			System.out.println("당신은 저체중입니다.");
		}
		else if (23>bmi) {//정상
			System.out.println("당신은 정상체중입니다.");
		}
		else if (25>bmi) {//과체중
			System.out.println("당신은 과제충입니다.");
		}
		else if (30>bmi) {//1도비만
			System.out.println("당신은 1도 비만입니다.");
		}
		else if (40>bmi) {//2도비만
			System.out.println("당신은 2도비만입니다.");
		}
		else { //고도
			System.out.println("당신은 고도비만입니다.");
		}*/
		
		String result = null; //if문에서 위의 주석처리된 부분처럼 sysout을 여러번 찍는 것 보다 string 변수에 받아서 하는 것이 더 깔꼼.
		if (18.5>bmi) {//저체중
			result = "당신은 저체중입니다.";
		}
		else if (23>bmi) {//정상
			result = "당신은 정상체중입니다.";
		}
		else if (25>bmi) {//과체중
			result = "당신은 과체중입니다.";
		}
		else if (30>bmi) {//1도비만
			result = "당신은 1도비만입니다.";
		}
		else if (40>bmi) {//2도비만
			result = "당신은 2도비만입니다.";
		}
		else { //고도
			result = "당신은 고도비만입니다.";
		}
		System.out.println(result);
		sc.close();
	}
}
