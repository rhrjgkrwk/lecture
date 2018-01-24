/*
빵가게를 만들어보자.
빵종류
빵가격

- 접근제어자를 알아보자 (access modifier)
	1. private : 같은 클래스 내에서만 접근 가능
	2. default : 같은 패키지 내에서만 접근 가능
	3. protected : 같은 패키지 내 접근 가능
					다른 패키지의 자손클래스에서 접근 가능
	4. public : 접근 제한이 없다.

- 접근제어자의 필요성
	struct Bread{
		int a;
		int b;
	}
	구조체 (C에서)는 기본적으로 public으로 설정되어있었고
	외부에서 직접적으로 접근하기 때문에 문제가 많이 발생했다.
	택시 타고 계산 하려는데 택시기사가 내 주머니에서 지갑을 꺼내서 돈을 가져가는 느낌

- 캡슐화
	데이터 감추기, 
	외부에서 접근하면 안되는 혹은 접근할 필요가 없는 경우, 데이터 감추는것.
	정보의 은닉화


 */



	//  캡슐화를 해보자(encapsulation)
	
	class Bread{
		private String name; //private은 같은 클래스 내부에서만 접근이 가능
		private int price;	// 은닉화의 기본 private
		
		/*
		<GETTER / SETTER>
			- 캡슐화에서 getter/setter는 무조건 public이 되어야해. 그래야 값을 받고 넘김.
			- get/set 만들때는 get/set+변수명(첫글자 대문자) 로 만들어야한다.
		
			
		this에 대해 알아보자.
			- 자기자신을 참조하는 객체를 this라고 한다.
			- 여기서 this는 Bread class
			- 현재 클래스를 가리킨다고 생각하면 된다.
		*/
		
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setPrice(int price) {
			this.price = price;
		}
	
		/*
		- 인스턴스의 생성과 소멸(Constructor/Destructor)에 대해 알아보자.
			- new => 생성자(초기치를 넣어주는 역할)가 가동 => 인스턴스 생성 => ...
			... => 소멸자(destructor : 객체 등을 정리하는 역할) => 인스턴스 소멸(garbage collector : 메모리에서 out)
		- 소멸자는 언제 쓸까
			- 네트워크 강제종료 등등
		- 생성자에 대해 알아보자.
			- 인스턴스 초기치 설정할 때 사용한다.
			- 앞에는 반드시 public / 싱글톤패턴 사용할 때는 private을 쓰기도 한다.(생성자를 private으로 하면 메소드에 public static getInstance 필요)
			- void 생략
			- return 쓸 수 없음.
		*/
		
		//생성자 만들기(오버로딩) + 생성자에서 다른 생성자 부르기
		public Bread(){
			// this(null,0); = default 생성자와 완전히 같음.
		} 
		//default 생성자, 새로운 생성자를 추가하면 디폴트 생성자가 사라지므로 이렇게 직접 써야한다.
		//즉, 디폴트 생성자가 컴파일러에 의해서 자동으로 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 떄 뿐이다.

		public Bread(String name, int price){
			this.name = name;
			this.price = price;
		}
		
	
	
}		/*b.name = "soboru"; 
		 * 다른 클래스이기 떄문에 private 이런식( 인스턴스명.인스톤스변수 )으루 접근 불가능
		 * b.price = 1000;
		 * */
		//System.out.println(b.name+" "+b.price);
		

public class OOPBakery {
	public static void main(String[] args) {
		Bread b = new Bread();
		System.out.println(b.getName()+"\t\\"+b.getPrice());
		b.setName("소보루");
		b.setPrice(1000);
		System.out.println(b.getName()+"\t\\"+b.getPrice());
		
		Bread b1 = new Bread("피자빵",1800); //생성자를 이용해서 초기치를 설정해보자.
		System.out.println(b1.getName()+"\t\\"+b1.getPrice());
		
		
		/*
		- Method Overloading을 해보자!!!!
			- 메소드 중복
			- 가독성을 높이기 위해서 사용
			1. 메소드 이름이 같아야해요
			2. 인자의 타입이 다르거나 갯수가 달라야한다.
			ex. sysout도 오버로딩이다.
		*/
		
		kaja();
		kaja("굳--드");
		
		

		
	}
		
	public static void kaja(){
		System.out.println("객체 굳---드");
	}
	public static void kaja(String aa){
		System.out.println("오늘도"+aa);
	}

}


















