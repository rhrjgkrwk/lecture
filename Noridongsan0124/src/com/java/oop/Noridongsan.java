package com.java.oop;
/*
��Ű���ȿ� �ִ� ���� �ڹ� ������ �� ���Ϸ� ��޵Ǳ� ������
��Ű�� ������ class �̸��� �ߺ��Ǹ� �ȵȴ�.
*/

public class Noridongsan {
	static int chong = 0; 

	/*
	static ������ ���ؼ� �˾ƺ���.
	1. ���������� �߰�ȣ �ȿ� ��鼭 ����� �״´�.
	2. static�� ���α׷� ������ ���� ����ִ´�. 
	3. �޸��� static ������ ����ִ�.
	4. ���α׷� ���� �� �������� �ȵǴ� ���� ���� static���� ����.
	5. static�� �ʹ� ���� ���� �޸� ���� / 
	*/
	
	
	public static void main(String[] args) {
		//int chong =0;
		Danche d1 = new Danche("902��",20);
		chong+=d1.totalFee();
		Danche d2 = new Danche("ASD",10);
		chong+=d2.totalFee();
		Danche d3 = new Danche("SDD",220);
		chong+=d3.totalFee();
		Danche d4 = new Danche("NMN",152);
		chong+=d4.totalFee();
		System.out.println("��ü��\t�ο�");
		System.out.println(d1.getDanName()+"\t"+d1.getInwon());
		System.out.println(d2.getDanName()+"\t"+d2.getInwon());
		System.out.println(d3.getDanName()+"\t"+d3.getInwon());
		System.out.println(d4.getDanName()+"\t"+d4.getInwon());
		System.out.println("�ѿ�� : "+chong+"��");
		
		
	}
}
