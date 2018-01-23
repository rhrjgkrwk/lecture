
/*
OOP를 해보자
1. 정의
2. 생성
3. 사용
*/

class Car{
	String color;
	int door;
	int wheel;

	//constructor
	public Car() {}
	public Car(String color, int door, int wheel) {
		super();
		this.color = color;
		this.door = door;
		this.wheel = wheel;
	}
}

public class OOP {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car myCar1 = new Car("black",4,50);
		
		System.out.println(myCar1); //인스턴스 명을 넣으면 주소값이 찍힌다.
		System.out.println(myCar1.color);
		System.out.println(myCar1.door);
		System.out.println(myCar1.wheel);

		myCar.color = "red";
		myCar.door = 2;
		myCar.wheel = 41;
		
		System.out.println(myCar); //인스턴스 명을 넣으면 주소값이 찍힌다.
		System.out.println(myCar.color);
		System.out.println(myCar.door);
		System.out.println(myCar.wheel);
	}
}

