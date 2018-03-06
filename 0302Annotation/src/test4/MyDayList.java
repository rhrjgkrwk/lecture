package test4;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(MyDayList.class) //�ݺ�
@interface Day {
	String name();
}
@Retention(RetentionPolicy.RUNTIME)
public @interface MyDayList {
	Day[] value();
}
