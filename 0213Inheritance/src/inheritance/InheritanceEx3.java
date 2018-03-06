package inheritance;
class ParentEx{
	public ParentEx() {
		// TODO Auto-generated constructor stub
		super(); // Object 클래스의 생성자를 호출
		System.out.println("parent class");
	}
	public void show(){
		System.out.println("show1 method");
	}
}

//상속시 무조건 부모의 생성자를 먼저 거치고 자식의 생성자를 실행하게 되어있는데
//이는 부모를 상속받기 때문에 자식 측에서 객체 생성시 부모의 메모리 영역도 만들어 주어야 하기 때문이다.

class ChildEx extends ParentEx{
	public ChildEx() {
		// TODO Auto-generated constructor stub
		System.out.println("child class");
	}
	public void show(){
		System.out.println("show2 method");
	}
}
public class InheritanceEx3 {
	public static void main(String[] args) {
		ChildEx c = new ChildEx();
	}
}
