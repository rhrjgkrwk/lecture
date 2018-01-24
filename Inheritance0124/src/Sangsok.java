/*
- 상속에 대해 알아보자.
	- 재사용을 할 수 있다.
	- 물려받는다.
	- 100% 상속 - 취사선택 불가능(부모꺼 다 받는다.)
- 상속의 규칙
	- 100% 상속
	- 따라서, 자녀의 재산은 부모보다 같거나 많다.
	- 페어런츠 클래스, 부모 클래스, 기본 클래스, 베이스 클래스 / 차일드 클래스, 자식 클래스, 파생(delived) 클래스
	
	class Animal{  }
	
	class Bird extends Animal{ 
		상속 = extends = 자식 is a kind of 부모
	 }
	
*/

class Animal{
	int numOfLegs;
	public void move(){
		System.out.println("움직인드아아아아");
	}
}

class Bird extends Animal{
	public void sing(){
		System.out.println("노래 : 까악까아아아아아아아아아악");
	}
}

public class Sangsok {
	public static void main(String[] args) {
		Bird kkach = new Bird();
		kkach.move();
		kkach.sing();
		Animal animal = new Animal();
		animal.move();
		animal.numOfLegs = 4;
		System.out.println(animal.numOfLegs);
	}
}
