/*

다중 상속을 해보자.
- 원칙적으루 다중 상속은 할 수 없다. 왜냐
	- 두 클래스를 상속받을때 두 부모 클래스의 메소드 이름이 중복되었다면 구분할 수 없다.
	- Diamond Problem이라고 한다.
- 그렇다면 어떻게..
	- Interface!!!!!!!!!! 
		- 추상클래스와 사촌간
		- 추상클래스와 일부 같지만 더 추상적임. - 
		- 추상클래스처럼 추상메서드 사용.
	-why interface
		1. 다중상속을 위해
		2. interface는 상부구조이기때문에 interface를 보면 작업의 흐름을 얼추 알 수 있다.(자손에서 구현을 해야하므로 - 마치 c언어 함수 원형(상단에 함수목록 기재))
		3. 개발시, 분업을 하게 되는데... 맨위에 interface 이름, 그 바로 아래 클래스 이름만 맞추고 나머지는 자유롭게 짜도록 한다.
		   즉, 이름을 약속해놓고 분업하여 작업하고 각자의 코드를 연결할 수 있도록 하는 하나의 방법으로 쓰임.

- interface 끼리의 상속!
	- 다중상속이 가능하다.
	- extends interface1, interface2 이런식으루다가.
	


cf) interface - abstract class - class 왼쪽으로 갈수록 더 상부구조.(추상화에 있어)
*/

interface Animal extends Thing{ //선언 O 구현 X 
	void soom();
}

interface Thing {
	void gamani();
}

interface Human extends Thing, Animal{
	
}


class Saengseon {
	
}

class Bird{
	
}

class KKamagui extends Bird implements Animal{
	public void soom(){
		System.out.println("breathe");
	}
	public void gamani(){
		System.out.println("아무것도 안한다");
	}
}

class Chamsae extends Bird implements Animal{		// Animal, Saengseon{ - 이런 다중 상속은 불가능.
	public void soom(){
		System.out.println("꼬르륵");
	}
	public void gamani(){
		System.out.println("아무것도 안한다");
	}
}


public class InterfaceEx {
	public static void main(String[] args) {
		Animal b[] = new Animal[2];
		//Animal c = new Animal(); !! error : interface는 인스턴스를 생성할 수 없따. 형변환을 이용해야함.
		b[0] = new KKamagui();
		b[1] = new Chamsae();
		for (int i = 0; i < b.length; i++) {
			b[i].soom();
			b[i].gamani();
		}
	}
}
