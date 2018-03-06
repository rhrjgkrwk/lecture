package test1;

public class DeprecatedTest {
	@Deprecated
	public void print(){ //앞으로 사용하지 않을 것이 권장되는 메서드명시
		System.out.println("print!!");
	}
	public void show(){
		System.out.println("show!!");
	}
	public static void main(String[] args) {
		DeprecatedTest ob = new DeprecatedTest();
		ob.print(); //
		ob.show();
	}
}
