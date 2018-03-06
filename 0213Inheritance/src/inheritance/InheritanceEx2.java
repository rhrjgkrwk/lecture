package inheritance;

class SuperEx2{
	public void show(){
		System.out.println("show1 method");
	}
}

class SubEx2 extends SuperEx2{
	public void show(){
		super.show(); //F3누르면위의 show 메소드로 간드아!, 자식에서 부모 메서드를 호출하고 싶을떄.
		System.out.println("show2 method");
	}
}
public class InheritanceEx2 {
	public static void main(String[] args) {
		SubEx2 s = new SubEx2();
		s.show();
	}
}
