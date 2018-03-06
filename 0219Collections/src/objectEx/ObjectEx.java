package objectEx;

import static java.lang.System.out; 
//static class를 import시 static 으로 소환하면 클래스명 을 생략할 수 있다.

public class ObjectEx extends Object{
	String str = "test";
	public ObjectEx() {
	}

	public void view(){
		out.println(str);
	}
	
	public static void main(String[] args) {
		ObjectEx ob = new ObjectEx();
		ob.view();
	}
}
