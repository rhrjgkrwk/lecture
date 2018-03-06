package test03;

interface Function{
	public int calc(int a, int b);
	default void view1(){  //디폴트 접근제어자를 붙이면 이미 있는 메서드는 가져다 쓸 수 있다.
		System.out.println("view1 method");  
	}
	default void view2(){  //디폴트 접근제어자를 붙이면 이미 있는 메서드는 가져다 쓸 수 있다.
		System.out.println("view2 method");  
	}
}

public class LambdaEx7 {
	public static void main(String[] args) {
		Function m1 = (a,b) -> a+b;
		Function m2 = (a,b) -> a-b;
		int m3 = m1.calc(10, 20) + m2.calc(30, 40);
		System.out.println(m3);
	}
}
