package test5;

import java.util.function.Supplier;

//Supplier�� �Ẹ��. getter�� ����.
public class StreamEx5 {
	public static void main(String[] args) {
	Supplier<Integer> s = ()->2; 
	//���ڸ� ���� ������ �̸��״�� ������� �����Ѵ�. ��, �׻� ����� ����.
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