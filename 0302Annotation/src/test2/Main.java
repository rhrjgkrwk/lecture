package test2;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		MyHello ob = new MyHello();
		
		try {
			Method md2 = ob.getClass().getDeclaredMethod("hello1"); 
			//����Ǿ����� ���� �޼ҵ��� no such method exception�߻�
			Method method = ob.getClass().getDeclaredMethod("hello");
			System.out.println(method.getName());
			System.out.println(md2.getName());
			if (method.isAnnotationPresent(MyAnnotation.class)) {
				for (int i = 0; i < 10; i++) {
					ob.hello();
					
				}
			}	
			else {
				ob.hello();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
