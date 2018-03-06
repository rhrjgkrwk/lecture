package test5;

import java.util.function.Function;

public class StreamEx7 {
	public static void main(String[] args) {
		Function<Integer, Integer> mf = (a)->a*a;
		System.out.println(mf.apply(3)); 
		
		System.out.println(mf.andThen(mf).apply(3)); 
		//andThen�� �Լ� �ߺ��� �ϵ����� 
		//��, mf��� �Լ��� ���ڷ� �޾� �ٽ� mf������ ���ش�.
		
		Function<String, Integer> f = s->s.length();
		int n = f.apply("dddd");
		
	}
}
