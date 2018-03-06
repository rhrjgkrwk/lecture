package test2;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		MyHello ob = new MyHello();
		
		try {
			Method md2 = ob.getClass().getDeclaredMethod("hello1"); 
			//선언되어있지 않은 메소드라면 no such method exception발생
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
