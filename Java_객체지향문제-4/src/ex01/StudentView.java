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
st��ü�� �޾� ȭ�鿡 ��� �Ѵ�
(getter�� �̿�)
+viewStudentList(list:List<Student>):void
list��ü�� �޾� forEach�� �̿��Ͽ�
����Ѵ�(getter�� �̿�)*/