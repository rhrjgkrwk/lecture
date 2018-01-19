package com.casting.my;

public class Casting {
	public static void main(String[] args) {
		System.out.println(10/3); //  정수/정수 = 정수
		System.out.println(10.0/3);
		System.out.println(10/3.0);
		System.out.println(10.0/3.0);
		
		//Casting
		
		System.out.println((int)10.121521521);
		System.out.println((char)65);
		System.out.println((int)'A');
				
		short aa = 31000;
		int cc = aa; // 작은건 큰거에 에러없이 들어감
		
		int dd = 3;
		short ee = (short)dd; // 큰걸 작은데다 넣으려면 형변환 필요. 
		System.out.println(ee);
		
		//81page CastingEx4
		
		int i = 91234567;
		float f = (float)i;
		int i2 = (int)f;
		
		double d = (double)i;
		int i3 = (int)d;
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.println("i="+i);
		System.out.println("f="+f);
		System.out.println("i2="+i2);
		System.out.println("d="+d);
		System.out.println("i3="+i3);
		System.out.println("(int)"+f2+"="+i4);
	}
}
