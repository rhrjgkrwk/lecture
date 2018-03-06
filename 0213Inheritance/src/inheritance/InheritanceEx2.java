package inheritance;

class SuperEx2{
	public void show(){
		System.out.println("show1 method");
	}
}

class SubEx2 extends SuperEx2{
	public void show(){
		super.show(); //F3���������� show �޼ҵ�� �����!, �ڽĿ��� �θ� �޼��带 ȣ���ϰ� ������.
		System.out.println("show2 method");
	}
}
public class InheritanceEx2 {
	public static void main(String[] args) {
		SubEx2 s = new SubEx2();
		s.show();
	}
}
