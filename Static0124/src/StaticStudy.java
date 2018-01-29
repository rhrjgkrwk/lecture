class Emp{
	String name; //instance 변수
	static int num = 0; //static 변수
	/*
	static 변수에 대해 알아보자
	- static 변수는 별도의 공간에 저장된다.
	- 스테틱은 실행시 초기치를 넣어줘야한다.
	- instance 생성 없이 사용가능.
	- 스테틱은 객체와 관련이 없다. - 인스턴스 생성없이 사용이 가능하다.
	- 사용시 class명.스테틱변수명 으로 한다.
	- 스테틱은 실행시 초기치를 넣어줘야한다.
	- 
	*/
	public Emp(){ //생성좌
		System.out.println("객체 생성수 : "+ ++num);
	}
	/*
	static 메서드에 대해서 알아보자.
	- static method 안에는 static 변수가 들어감.
	*/
	public static int getEmpNum(){ //static method 안에는 static 변수가 들어감.
		return num;
	}
}

public class StaticStudy {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		System.out.println("객체 생성수 : "+ Emp.getEmpNum());
		Emp.num = 12; //Class명.staticVar명으로 사용.
		System.out.println(Emp.num);
	}
}
