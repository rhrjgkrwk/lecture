package test4;

import java.util.Arrays;
import java.util.stream.Collector;

public class StreamEx1 {
	public static void main(String[] args) {
//		Arrays.asList(1,2,3,4,5,6,7).stream().forEach(System.out::println); // :: 소속을 밝혀주는 연산자.
//		
//		Arrays.asList(1,2,3,4,5,6,7).stream().map(i->i*i).forEach(System.out::println); // :: 소속을 밝혀주는 연산자.
//		Arrays.asList(1,2,3,4,5,6,7).stream().limit(3).forEach(System.out::println); // :: 소속을 밝혀주는 연산자.
//		Arrays.asList(Arrays.asList(1,2,3,4,5,6,7),Arrays.asList(1,2,3,4,5,6,7),Arrays.asList(1,2,3,4,5,6,7))
//		.flatMap(i -> i.stream())
//				.forEach(System.out::println);// (str -> System.out.println())와 같음
//		
		System.out.println(Arrays.asList(1,2,3).stream().reduce((a,b)->a-b).get());
	}
}
