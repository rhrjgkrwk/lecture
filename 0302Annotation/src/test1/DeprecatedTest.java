package test1;

public class DeprecatedTest {
	@Deprecated
	public void print(){ //������ ������� ���� ���� ����Ǵ� �޼�����
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
