package objectEx;

import static java.lang.System.out; 
//static class�� import�� static ���� ��ȯ�ϸ� Ŭ������ �� ������ �� �ִ�.

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
