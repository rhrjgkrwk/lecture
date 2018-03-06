package constructor;

public class ConstructorEx7 {
	public static void main(String[] args) {
		Emp ob1 = new Emp();
		Emp ob2 = new Emp("홍길동",22);
		ob1.view();
		ob2.view();
	}
}

class Emp{
	private String name = "이순신";
	private int age = 25;
	
	public Emp() {//Default 생성자는 무조건 만들자.
		// TODO Auto-generated constructor stub
	}
	
	public Emp(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	public void view(){
		System.out.println(name+" "+age);
	}
}