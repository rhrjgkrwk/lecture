package ex01;

import java.util.ArrayList;

public class MainEx {
	public static void main(String[] args) {
		Student st = new Student("�ε鷹",15,170,55);
		StudentView sv = new StudentView();
		ArrayList<Student> stList = new ArrayList<>();
		stList.add(st);
		stList.add(new Student("���޷�",22,156,53));
		stList.add(new Student("������",22,255,46));
		
		sv.viewStudent(st);
		System.out.println();
		sv.viewStudentList(stList);
	}
}

/*main()�� �ۼ� �Ѵ�
1. main �Լ� �ȿ��� Student Ÿ�Կ� ��ü�� �����ϸ鼭 ���ε鷡�� �����͸� �����Ѵ�
2. StudentView��ü�� �����viewStudent�޼��忡 ���ε鷡����ü���ѱ��
3. StudentView��ü�� �����viewStudentList�޼��忡 ArrsyList��ü�� �ѱ��*/
