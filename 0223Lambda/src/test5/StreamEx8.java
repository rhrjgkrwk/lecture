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

		IntPredicate  a =  n ->(n%5) ==0; //int 타입만을 인자로 받는 predicate
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
System.out.println("9는 2와 3의 배수입니까? " + result);

predicateAB = predicateA.or(predicateB);
result = predicateAB.test(9);
System.out.println("9는 2또는 3의 배수입니까? " + result);

predicateAB = predicateA.negate();
result = predicateAB.test(9);
System.out.println("9는 홀수입니까? " + result);*/



//다음 예제는 두 문자열을 비교하기 위해 Predicate의 isEqual() 정적 메소드를 사용했습니다.
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


//Predicate<T>   : 인수 값을 받아  논리값으로  결과를 판정한다. test(T)
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