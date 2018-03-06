package test5;

import java.util.function.Function;

public class StreamEx7 {
	public static void main(String[] args) {
		Function<Integer, Integer> mf = (a)->a*a;
		System.out.println(mf.apply(3)); 
		
		System.out.println(mf.andThen(mf).apply(3)); 
		//andThen은 함수 중복을 하도록함 
		//즉, mf라는 함수을 인자로 받아 다시 mf연산을 해준다.
		
		Function<String, Integer> f = s->s.length();
		int n = f.apply("dddd");
		
	}
}
