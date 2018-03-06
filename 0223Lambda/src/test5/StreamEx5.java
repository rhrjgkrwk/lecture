package test5;

import java.util.function.Supplier;

//Supplier를 써보자. getter에 사용된.
public class StreamEx5 {
	public static void main(String[] args) {
	Supplier<Integer> s = ()->2; 
	//인자를 받지 않으며 이름그대로 결과값만 제공한다. 즉, 항상 결과가 같다.
	System.out.println(s.get());
	
	}
}


//public class StreamEx5 {
//	public static String get1(){  return "hello"; } 
//	public static int get2(){  return 100; }
//	public static double get3(){  return 90.5; }
//	
//	public static void main(String[] args) {
//			System.out.println(get1());
//			System.out.println(get2());
//			System.out.println(get3());
//	}
//}