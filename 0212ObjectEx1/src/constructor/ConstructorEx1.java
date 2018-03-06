package constructor;

public class ConstructorEx1 {
	
	//생성자 오버로딩, 
	/*
	13. 생성자(Constructor) 
    :객체가 만들어지면서 자동호출하는 함수이며, 	
     객체의 초기작업을 할경우에 이용 된다.

   ① 반드시 클래명과 동일해야 한다
   ② 결과형(리턴값)이 없다 
   ③ 객체가 생성될때 자동 호출되며, 사용자가 임의로 호출할수 없다
   ④ 멤버필드의 값을 초기화 한다
   ⑤ 생략하면 컴파일시 자동으로 default생성자를 만든다
   ⑥ 여러개의 생성자를 만들수 있다(생성자 overloading)
   ⑦ 생성자내부에서 첫번째라인에 this(매개변수)를 사용하여 다른 생성자를 호출할수 있다.
       단, 1번만 호출이 가능하다

      this()               ---> 자기 클래스의 디폴트생성자호출
      this(변수)         ---> 자기 클래스의 인자값을 가진 다른생성자호출  
      this.필드명       ---> 자기 클래스의 변수를 지칭
      this.메서드명()  ---> 자기 클래스의 메서드를 지칭
	*/
	public ConstructorEx1() {
		// TODO Auto-generated constructor stub
		System.out.println("default cons");
	}
	
	public ConstructorEx1(String s) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println(s+" default cons");
	}
	
	public ConstructorEx1(String s, int a) {
		// TODO Auto-generated constructor stub
		this(s);
		System.out.println(s+" default cons " + a);
	}
	
	
	public static void main(String[] args) {
		new ConstructorEx1("메롱",10);
		//객체를 생성하고 아무것도 안하면 오류가 뜨는 것은 
		//메모리 낭비가 있어서 
	}
}
