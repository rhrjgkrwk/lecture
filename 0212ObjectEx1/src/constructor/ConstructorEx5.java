package constructor;

import java.util.Scanner;

/*
[문제] 생성자에서 두수를 입력받아 큰수와 작은수를 출력하시오
show()메서드에서 maxValue(), minValue()를 호출할것

클래스명 : Max
-a:int
-b:int
+Max()
+maxValue():int
+minValue():int
+show():void

[출력]
Input a: 5
Input b: 3

큰수 : 5
작은수: 3
 */

class Max {
	private int a;
	private int b;

	public Max() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a : ");
		a = sc.nextInt();
		System.out.print("Input b : ");
		b = sc.nextInt();
	}

	public void show() {
		System.out.println("큰 수 : "+maxValue());
		System.out.println("작은 수 : "+minValue());
	}

	public int minValue() {
		return a<b?a:b;
	}

	public int maxValue() {
		return a>b?a:b;
	}
}

public class ConstructorEx5 {
	public static void main(String[] args) {
		new Max().show();
		// Max m=new Max();
		// m.show();
	}
}
