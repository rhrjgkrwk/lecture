package com.oper.my;

public class OperatorEx {
	public static void main(String[] args) {
		System.out.println((3+5)*((4-23)/7-34)+57); // 산술 > 관계 > 논리
		System.out.println(3<5 && 2>4 || 7 -3 > 8); // and > or
 		//                    true      false      false
		//                        false             false
		//                                 false
		int aa = 30;
		float ff = 42.22f;
		OperatorEx e = new OperatorEx();
		
		System.out.println(aa+ff);
		
		System.out.println(10%2);
		System.out.println(10/2==10/2.0); //같으면 짝수
		System.out.println(11/2==11/2.0); //다르면 홀수 (정수/실수=실수, 정수/정수=정수 이기 때문에 홀수일때 값이 다르게 나옴)
		
		//삼항 연산자
		//(조건) ? (yes일때) : (no일때)
		
		String str = OperatorEx.test2(4,2)?"맞넹":"아니넹";
		System.out.println(str);
		
		
		
		
		
	}
	static public boolean test2(int a, int b) {
		// TODO Auto-generated method stub
		if (a%b==0) {
			return true;
		}
		else{
			return false;
		}
	}
}
