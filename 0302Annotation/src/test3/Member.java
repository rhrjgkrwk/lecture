package test3;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.METHOD;
@Retention(RUNTIME)
@Target(METHOD) //Ÿ���� �޼���� ����
public @interface Member {
	public String name(); //������̼� attr�� ����?
}
