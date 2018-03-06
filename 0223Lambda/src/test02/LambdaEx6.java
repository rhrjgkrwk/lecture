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


/* [문제]간단한 계산기를 람다식으로 작성하시오
 * 
 * 1. 인터페이스명 : Calc
 *  +calc(a:int,b:int):double
 *    
 * 2. CalcMain에서 
 *    Calc객체변수를 만들고 2,5값을 가지고 더하기/빼기/곱하기/나누기를 완성하시오
 *    
 * [실행결과]
 * 7
 * -3
 * 10
 * 0.4   
 */