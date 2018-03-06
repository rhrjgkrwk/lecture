package test3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MyMember mm = new MyMember();
		Method[] mt = mm.getClass().getMethods();
		
		for (Method m : mt) {
			System.out.println(m.getName());//MyMember�� ������ �ִ� ��� �޼���
			if (m.getName().equals("view1")||m.getName().equals("view2")) {
				m.invoke(mm, null);
			}
//			if (m.isAnnotationPresent(Member.class)) { //method�� �ش� ������̼��� �پ�������
//				Member my = m.getDeclaredAnnotation(Member.class); //method�� �پ��ִ� ������̼��� get
//				//Returns this element's annotation for the specified type if such an annotation is directly present, else null. 
//				if (my.name().equals(args[0])) { //�ش� ������̼��� name�� args[0]�� ������
//					m.invoke(new MyMember(), null); //class��, �Ű����� ���� ���ڷ� ����.
//				}
//			}
		}
	}
}
