package test5;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class StreamEx8 {
	public static void main(String[] args) {
		Predicate<String> predicate;

		predicate = Predicate.isEqual(null);
		System.out.println("null, null: " + predicate.test(null));

		predicate = Predicate.isEqual("Java");
		System.out.println("Java, null: " + predicate.test(null));

		predicate = Predicate.isEqual(null);
		System.out.println("null, Java: " + predicate.test("Java"));

		predicate = Predicate.isEqual("Java");
		System.out.println("Java, Java: " + predicate.test("Java"));
		
		Predicate<String>   p= s->s.isEmpty();
		System.out.println( p.test("abc"));
		System.out.println( p.test(""));

		IntPredicate  a =  n ->(n%5) ==0; //int Ÿ�Ը��� ���ڷ� �޴� predicate
		IntPredicate  b =  n ->(n%3) ==0;
		IntPredicate   r = a.and(b);
		for(int i =1; i<=20;i++) {
			System.out.println( i +" : "+ r.test(i));
		}
		
	}
}


/*		IntPredicate predicateA = a -> a % 2 == 0;

IntPredicate predicateB = b -> b % 3 == 0;

boolean result;
IntPredicate predicateAB = predicateA.and(predicateB);
result = predicateAB.test(9);
System.out.println("9�� 2�� 3�� ����Դϱ�? " + result);

predicateAB = predicateA.or(predicateB);
result = predicateAB.test(9);
System.out.println("9�� 2�Ǵ� 3�� ����Դϱ�? " + result);

predicateAB = predicateA.negate();
result = predicateAB.test(9);
System.out.println("9�� Ȧ���Դϱ�? " + result);*/



//���� ������ �� ���ڿ��� ���ϱ� ���� Predicate�� isEqual() ���� �޼ҵ带 ����߽��ϴ�.
/*
Predicate<String> predicate;

predicate = Predicate.isEqual(null);
System.out.println("null, null: " + predicate.test(null));

predicate = Predicate.isEqual("Java");
System.out.println("Java, null: " + predicate.test(null));

predicate = Predicate.isEqual(null);
System.out.println("null, Java: " + predicate.test("Java"));

predicate = Predicate.isEqual("Java");
System.out.println("Java, Java: " + predicate.test("Java"));

*/


//Predicate<T>   : �μ� ���� �޾�  ��������  ����� �����Ѵ�. test(T)
//BiPredicate<T,U>   : test(T t, U u) 	
/*		
Predicate<String>   p= s->s.isEmpty();
System.out.println( p.test("abc"));
System.out.println( p.test(""));

IntPredicate  a =  n ->(n%5) ==0;
IntPredicate  b =  n ->(n%3) ==0;
IntPredicate   r = a.and(b);
for(int i =1; i<=20;i++) {
	System.out.println( i +" : "+ r.test(i));
}	*/	