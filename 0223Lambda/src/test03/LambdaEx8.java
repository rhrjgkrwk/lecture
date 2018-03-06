package test03;

import java.util.ArrayList;
import java.util.List;

class Student{
	private String name;
	private int tot;
	
	public Student() {
		
	}
	
	public Student(String name, int tot) {
		this.name = name;
		this.tot = tot;
	}

	public String getName() {
		return name;
	}

	public int getTot() {
		return tot;
	}
	
}

public class LambdaEx8 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("kim", 100));
		list.add(new Student("lee", 70));
		list.add(new Student("park", 85));
		list.add(new Student("hong", 60));
		list.add(new Student("kang", 95));
		
		System.out.println("정렬 전");
		list.forEach((s)->System.out.println(s.getName()+" "+s.getTot()));
//		
//		Collections.sort(list, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
//		
		list.sort((o1,o2) -> o1.getName().compareTo(o2.getName())); //이렇게 바꿀 수 있다.
		
		System.out.println("정렬 후");
		list.forEach((s)->System.out.println(s.getName()+" "+s.getTot()));
	}
}
