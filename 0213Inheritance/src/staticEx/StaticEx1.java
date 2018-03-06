package staticEx;

/*
(1) static 필드 :데이타 값의 공유를 위해 선언하는 공간(멤버필드만 가능)
①클래스이름으로 접근가능
②객체발생전 메모리할당
 <형식> 클래스명.멤버변수  or  객체명.멤버변수   
(2) static 초기화영역
 <형식> static {   초기화구문;  }
(3) static 메서드 : static필드를 컨트롤할 목적으로 쓰임
(4) 스테틱은 언제쓰이는가!
	

static 은 객체 생성 전에 메모리에 로드
static은 공유필드를 위한 static (this변수 없다)
static은 this. 으로 초기화하지 않는다.
static 멤버변수는 static 전용 초기화 공간인 static{} 블럭에서 초기화한다.
*/
class Test{
	int x;
	int y;
	static int z;
	static{
		System.out.println("static 초기화");
		z = 123;
	}
	public Test(int x, int y, int z1) {
		this.x = x;
		this.y = y;
		z = z1;
		System.out.println("객체의 초기화 영역");
	}
	public void view(){
		System.out.println(x+" "+y+" "+z);
	}
}
public class StaticEx1 {
	public static void main(String[] args) {
		Test t1 = new Test(1,2,3);
		Test t2 = new Test(4,5,7);
		t1.view();
		t2.view();
	}
}
