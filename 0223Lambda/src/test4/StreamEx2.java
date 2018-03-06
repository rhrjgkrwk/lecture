package test4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
	String name;
	int tot;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int tot) {
		this.name = name;
		this.tot = tot;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : "+name+" 점수 : "+tot;
	}
	
}

public class StreamEx2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("kim",99));
		list.add(new Student("lee",19));
		list.add(new Student("park",92));
		list.add(new Student("hong",49));
		list.add(new Student("kang",55));
		//객체 중에 점수가 80이상인 요소만 출력해보자.
		list.stream().filter(s -> s.tot>=80).forEach(System.out::println);
		System.out.println();
		list.stream().filter(s -> s.tot < 80).forEach(System.out::println);
		System.out.println();
		
		//앞에서부터 3개만 출력
		list.stream().limit(3).forEach(System.out::println);
	}
}
