package ex01;

import java.util.List;

public class StudentView {
	public void viewStudent(Student st){
		System.out.println(st.getName()+" \t"+st.getAge()+" \t"+st.getHeight()+" \t"+st.getWeight());
	}
	public void viewStudentList(List<Student> list){
		for (Student st : list) {
			viewStudent(st);
		}
	}
}

/*+viewStudent(st:Student):void
st객체를 받아 화면에 출력 한다
(getter를 이용)
+viewStudentList(list:List<Student>):void
list객체를 받아 forEach를 이용하여
출력한다(getter를 이용)*/