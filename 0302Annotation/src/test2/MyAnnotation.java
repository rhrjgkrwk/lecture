package test2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) 
//JVM 실행 시점에 MyAnnotation을 감지할 수 있도록 RUNTIME 처리.ㄴ
public @interface MyAnnotation {
	
}
