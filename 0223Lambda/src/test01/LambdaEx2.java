package test01;

public class LambdaEx2 {
	public static void main(String[] args) {
		Print m = ()->System.out.println("hello lambda");
		m.view();
	}
	
}
