package com.oper.test;

import java.util.Scanner;

/* 년도를 입력받아 짝수해면 코코 보러가고 
 * 홀수면 신과함께 보러가자를 출력하는 자바 프로그램*/

public class OperatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int year = sc.nextInt();
		String str = (year%2 == 0) ? "코코 보러가즈아" : "신과함께 가즈아";
		String str1 = (year/2 == year/2.0) ? "코코 보러가즈아" : "신과함께 가즈아"; //정수/정수=정수, 정수/실수=실수 이용하여 비교.
		System.out.println(str);
		System.out.println(str1);
		System.out.println((year%2 == 0) ? "코코 보러가즈아" : "신과함께 가즈아");
		*/
		//숫자를 받을때 문자로 받고 나서 숫자로 바꿔보자
		
		System.out.print("년도 입력 : ");
		String str2 = sc.nextLine();
		
		int a = Integer.parseInt(str2);
		System.out.println(a+"년에는");
		System.out.println((a%2 == 0) ? "코코 보러가즈아" : "신과함께 보러가즈아");
		sc.close();
		
		//null에 대해 알아보자
		String str3 = null;
		System.out.println(str3=="");
		if (str3==null || str3=="" || str3.length() <= 0) {
			//어떤 값이 비어있는 경우를 체크할 떄 3 가지 조건을 모두 포함해서 물어보는 것이 좋다.
		
		}
		str3 = "";
		if (str3.length()<1) {
			System.out.println("DD");
		}
		
		//증감 연산자 - 전치/후치 단독으로 쓰일때는 차이 X
		
		int aaa=100;
		System.out.println(aaa++); //100 후치 연산자 : print -> incre
		System.out.println(aaa);     //101
		System.out.println(++aaa); //102 전치 연산자 : incre -> print
		System.out.println(aaa);     //102
		
		char ccc = 'a';
		System.out.println(ccc++);
		System.out.println(ccc);
		System.out.println(++ccc);
		
		//char형 숫자를 int로 바꿔보자. ascii코드 & char - char = int  활용
		//기준값을 빼주자. 문자를 숫자로 변형할 때에는 -'0'
		
		char num = '3';
		int soo = num - '0';
		//문자열을 숫자로 바꿀때는 Integer.parseInt() 를 이용
		String num1 = "300";
		int soo1 = Integer.parseInt(num1);	
		
		System.out.printf("%d  %d",soo, soo1); // 3 300
	}
}
