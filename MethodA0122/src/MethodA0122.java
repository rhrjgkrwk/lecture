
public class MethodA0122 {
	public static void main(String[] args) {
		//refactoring : 소스의 기본 형식은 바꾸지 않고 뭔가 편하게 바꾸고 싶을 때 사용하는 이클립수 툴.'
		
		kaja();//메소드 이름 한번에 바꾸어보자. ALT + Shift + R
		kaja();
		kaja();
		kaja();
		kaja();
		
		
	}

	public static void kaja() {//소스를 메소드화 하기 : shift + alt + M
		System.out.println("메소드를 꿀잼으로 만들어 보자!");
		System.out.println("메소드 아니면 핵노잼?");
	}
}
