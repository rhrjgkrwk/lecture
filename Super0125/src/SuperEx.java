
/*
Super를 사용해보자.!

*/

class Parent {
	int age;
	public Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("부모나이 출력이 없넹");
	}
	public Parent(int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		System.out.println("부모나이 "+this.age+"세");
	}
	public void jangsoo() {
		System.out.println("우리 가족은 장수 가족");
	}
}

class Child extends Parent{
	int cAge;
	public Child(int cAge) {
		// TODO Auto-generated constructor stub
		super(162); //명시적으로 부모 생성자를 호출하고자 하면 super()를 하면된다.
		this.cAge = cAge;
		System.out.println("자식나이 "+this.cAge+"세");
		super.jangsoo(); //super는 부모를 가리킨다.
		this.jangsoo(); //this는 현재 클래스.
	}
	public void jangsoo() {
		System.out.println("장수 가족");
	}
}

public class SuperEx {
	public static void main(String[] args) {
		Child c = new Child(123); //부모나이 출력이 없넹도 같이 찍힘..
		//왜 부모의 생성자를 실행할까
		//상속에서 자식 생성자를 호출하면 
		//부모를 먼저 찾아가서 처리한 후 자녀를 처리한다.!!!!!!
		//부모를 먼저 찾아가지 않으면 부모 생성자를 찾아갈 방법이 읍슴
		//
		//
	}
}
