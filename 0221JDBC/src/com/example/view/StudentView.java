package com.example.view;
/*
+insertStudent(name:String):void
+getStudent(entity:StudentEntity):void
+getStudentList(list:List<StudentEntity>)
*/

import java.util.List;

import com.example.entity.StudentEntity;

public class StudentView{
	public void insertStudent(String name){
		System.out.println();
		System.out.println(name+"���� �߰��Ǿ���.");
		System.out.println();
	}
	public void getStudent(StudentEntity entity){
		System.out.println();
		if (entity!=null) {
			System.out.println(entity);
		}
		else System.out.println("�׷� ��� ����.");
		System.out.println();
	}
	public void getStudentList(List<StudentEntity> list){
		if (list.size()>0) {
			System.out.println();
			System.out.println(list.size() + "���� ��ϵǾ��ִ�.");
			for (StudentEntity s : list) {
				System.out.println(s);
			}
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println(list.size() + "���� ��ϵǾ��ִ�.");
			System.out.println();
		}
	}
}