package test3;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.METHOD;
@Retention(RUNTIME)
@Target(METHOD) //타겟을 메서드로 지정
public @interface Member {
	public String name(); //어노테이션 attr을 지정?
}
