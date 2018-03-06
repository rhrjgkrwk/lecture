package ex01;

import java.util.ArrayList;

public class MainEx {
	public static void main(String[] args) {
		Student st = new Student("민들레",15,170,55);
		StudentView sv = new StudentView();
		ArrayList<Student> stList = new ArrayList<>();
		stList.add(st);
		stList.add(new Student("진달래",22,156,53));
		stList.add(new Student("개나리",22,255,46));
		
		sv.viewStudent(st);
		System.out.println();
		sv.viewStudentList(stList);
	}
}

/*main()을 작성 한다
1. main 함수 안에서 Student 타입에 객체를 생성하면서 ‘민들래’ 데이터를 대입한다
2. StudentView객체를 만들어viewStudent메서드에 ‘민들래‘객체를넘긴다
3. StudentView객체를 만들어viewStudentList메서드에 ArrsyList객체를 넘긴다*/
