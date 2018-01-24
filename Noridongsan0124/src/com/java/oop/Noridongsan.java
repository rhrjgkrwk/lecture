package com.java.oop;
/*
패키지안에 있는 여러 자바 파일은 한 파일로 취급되기 때문에
패키지 내부의 class 이름이 중복되면 안된다.
*/

public class Noridongsan {
	static int chong = 0; 

	/*
	static 변수에 대해서 알아보자.
	1. 지역변수는 중괄호 안에 살면서 벗어나면 죽는다.
	2. static은 프로그램 끝날때 까지 살아있는다. 
	3. 메모리의 static 영역에 살고있다.
	4. 프로그램 실행 중 없어지면 안되는 것을 보통 static으로 쓴다.
	5. static을 너무 많이 쓰면 메모리 낭비 / 
	*/
	
	
	public static void main(String[] args) {
		//int chong =0;
		Danche d1 = new Danche("902허",20);
		chong+=d1.totalFee();
		Danche d2 = new Danche("ASD",10);
		chong+=d2.totalFee();
		Danche d3 = new Danche("SDD",220);
		chong+=d3.totalFee();
		Danche d4 = new Danche("NMN",152);
		chong+=d4.totalFee();
		System.out.println("단체명\t인원");
		System.out.println(d1.getDanName()+"\t"+d1.getInwon());
		System.out.println(d2.getDanName()+"\t"+d2.getInwon());
		System.out.println(d3.getDanName()+"\t"+d3.getInwon());
		System.out.println(d4.getDanName()+"\t"+d4.getInwon());
		System.out.println("총요금 : "+chong+"원");
		
		
	}
}
