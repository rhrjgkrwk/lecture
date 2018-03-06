package override;

class Test1{
	public void view1(){
		System.out.println("view1");
	}
	public void view3(){
		System.out.println("view3");
	}
}
class Test2 extends Test1{
	@Override //override 를 할 때는 annotation을 붙여주자!
	public void view1(){
		System.out.println("view11");
	}
	//@Override 오버라이딩 메서드가 아닌경우 에러가 뜬다.
	public void view2(){
		System.out.println("view22");
	}
}

public class OverrideEx {
	public static void main(String[] args) {
		Test2 ob = new Test2(); 
		ob.view1(); //view11
		ob.view2();//view22
		ob.view3();//view3
		
		Test1 ob1 = new Test2(); 
		ob1.view1(); //view11
		//ob1.view2();//error
		ob1.view3();//view3
	}
}
