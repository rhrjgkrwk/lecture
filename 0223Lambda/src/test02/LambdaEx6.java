package test02;

@FunctionalInterface
interface Calc{
	public double calc(int a, int b);
}

public class LambdaEx6 {
	public static void main(String[] args) {
		Calc c = (a,b)->{ return a+b;};
		System.out.println((int)c.calc(2, 5));
		c = (a,b)->{ return a-b;};
		System.out.println((int)c.calc(2, 5));
		c = (a,b)->{ return a*b;};
		System.out.println((int)c.calc(2, 5));
		c = (a,b)->{ return (double)a/b;};
		System.out.println(c.calc(2, 5));
	}
}


/* [����]������ ���⸦ ���ٽ����� �ۼ��Ͻÿ�
 * 
 * 1. �������̽��� : Calc
 *  +calc(a:int,b:int):double
 *    
 * 2. CalcMain���� 
 *    Calc��ü������ ����� 2,5���� ������ ���ϱ�/����/���ϱ�/�����⸦ �ϼ��Ͻÿ�
 *    
 * [������]
 * 7
 * -3
 * 10
 * 0.4   
 */