package test01;


public class LambdaEx1{
	public static void main(String[] args) {
		Print p = new Print() {
			@Override
			public void view() {
				System.out.println("Hello");
			}
		};
		p.view();
	}
}
