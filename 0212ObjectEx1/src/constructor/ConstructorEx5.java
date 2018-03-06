package constructor;

import java.util.Scanner;

/*
[����] �����ڿ��� �μ��� �Է¹޾� ū���� �������� ����Ͻÿ�
show()�޼��忡�� maxValue(), minValue()�� ȣ���Ұ�

Ŭ������ : Max
-a:int
-b:int
+Max()
+maxValue():int
+minValue():int
+show():void

[���]
Input a: 5
Input b: 3

ū�� : 5
������: 3
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
		System.out.println("ū �� : "+maxValue());
		System.out.println("���� �� : "+minValue());
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
