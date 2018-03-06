package test3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MyMember mm = new MyMember();
		Method[] mt = mm.getClass().getMethods();
		
		for (Method m : mt) {
			System.out.println(m.getName());//MyMember가 가지고 있는 모든 메서드
			if (m.getName().equals("view1")||m.getName().equals("view2")) {
				m.invoke(mm, null);
			}
//			if (m.isAnnotationPresent(Member.class)) { //method에 해당 어노테이션이 붙어있으면
//				Member my = m.getDeclaredAnnotation(Member.class); //method에 붙어있는 어노테이션을 get
//				//Returns this element's annotation for the specified type if such an annotation is directly present, else null. 
//				if (my.name().equals(args[0])) { //해당 어노테이션의 name이 args[0]과 같으면
//					m.invoke(new MyMember(), null); //class명, 매개변수 값을 인자로 받음.
//				}
//			}
		}
	}
}
