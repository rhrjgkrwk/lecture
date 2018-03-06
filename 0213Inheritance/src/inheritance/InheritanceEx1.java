package inheritance;

class SuperEx1{
	public void show(){
		System.out.println("show1 method");
	}
}

class SubEx1 extends SuperEx1{
	public void show2(){
		System.out.println("show2 method");
	}
}

public class InheritanceEx1{
	public static void main(String[] args) {
		SubEx1 s = new SubEx1();
		s.show();
		s.show2();
	}
}
