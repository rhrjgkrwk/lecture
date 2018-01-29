package com.poly.my;
/*
<다형성>
- 객체의 형변환에 대해서 알아보자.
	- 자료의 형변환은 (int)등의 캐스트 연산자로 간단하게 할 수 있따
	- 객체의 형변환은 ... 

<추상클래스>
	- abstract 실체가 없는
	- 추살클래스는 왜 쓰는가!!!!!!!(추상)
		1. 좀 더 가독성을 높이기 위해 쓰임
		2. !!!
*/

class Parent{
	
}

class Child extends Parent{
	
}

public class PolyMorphism {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		Parent p2 = new Child();
		Parent p3 = c1; //c1에 참조값을 p3에 넣는다. 즉, child에서 parent로 형변환한 것.
		
		Parent p4 = new Child(); //child 공간 > parent 공간이기 때문에 가능 - up scale
		//Child c2 = new Parent(); // child 공간 > parent 공간이기 때문에 불가능.(재산이 안맞으니깐) - down scale
		//고로 부모가 앞에 나온 것만 해당이 된다.
		
		
		Child c3 = (Child)p4; //어디서 왔는지 확인을 해봐야한다. p4 = new Child()로부터 왔으니 가능
		Child c4 = (Child)p1; //p1 = new Parent()n - 컴파일시 에러X 실행시간에 에러가 남.
		
		
	}
}
