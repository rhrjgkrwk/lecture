package com.leapyear.my;

import java.util.Scanner;

/*
 *  어떤 해가 윤년인지 아닌지 알아보자!
 *  지구 공전 : 365.2422일 - 30km/s
 *  4년에 1번씩 윤년
 *  100년에 한번씩 평년
 *  400년에 한번씩 윤년.
 *  윤년은 2월이 29일  
 *  
 */

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year : ");
		
		int year = sc.nextInt();
		boolean yoon = false;
		
		yoon = ((year%4 == 0)&&(year%100!=0))? true :   year%400==0 ? true : false; 
		//		             └ 확실한 윤년                      └앞의 조건에 해당되지 않는 것 중 400으로 나누어 떨어지는 것도 윤년.
		//(4로 나누어떨어지면서 100으로 나누어 떨어지지 않는 해)
		yoon = (year%4==0&&year%100!=0||year%400==0) ? true:false;
		System.out.println(yoon ? year+"년은 윤년입니다." : year+"년은 평년입니다.");
		sc.close();
	}
}
