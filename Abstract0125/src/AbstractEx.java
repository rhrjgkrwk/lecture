
/*
<다형성>
- 객체의 형변환에 대해서 알아보자.
	- 자료의 형변환은 (int)등의 캐스트 연산자로 간단하게 할 수 있따
	- 객체의 형변환은 ... 

<추상클래스>
	- abstract 실체가 없는
	- 추살클래스는 왜 쓰는가!!!!!!!(추상)
		1. 좀 더 가독성을 높이기 위해 쓰임(
		2. !!!다형성.
*/
abstract class Fruit{ //추상메소드가 있는 클래스는 반드시 abstract 클래스여야한다.
	public void eat(){
		System.out.println("냠냠쿰척쿰척");
	}
	public abstract void eat1(); 
	//abstract가 붙은 메소드를 추상메소드라고 한다.
	//추상은 말 그대로 실체가 없다
	//선언만 가능하고 구현은 불가능하다.
}

class Bae extends Fruit{
	public void eat1(){
		System.out.println("배를 먹자");
	}
}

class Sakwa extends Fruit{
	public void eat1(){
		System.out.println("사과는 둥글게 깎아서 먹자");
	}
}

class Gam extends Fruit{
	public void eat1(){
		System.out.println("감은 그냥 먹자");
	}
}

/*class Apple extends Fruit{
	
}
class Orange extends Fruit{
	
}*/
public class AbstractEx {
	public static void main(String[] args) {
		//Fruit f = new Fruit(); //추상클래스는 객체 생성이 불가능해.
		Fruit f = new Gam();
		///f.eat1();
		
		//객체배열을 만들어서 쉽게 다루어보자
		
		Fruit[] f1 = new Fruit[3];
		f1[0] = new Gam();
		f1[1] = new Sakwa();
		f1[2] = new Bae();
		
		for (int i = 0; i < f1.length; i++) {
			f1[i].eat1();
			f1[i].eat();
		}
	}
}
