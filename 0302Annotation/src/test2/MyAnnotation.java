package test2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) 
//JVM ���� ������ MyAnnotation�� ������ �� �ֵ��� RUNTIME ó��.��
public @interface MyAnnotation {
	
}
