package com.example.view;

import java.util.List;

import com.example.entity.StudentEntity;

public class StudentView{
	public void insertStudent(String name){
		if(name != null){
			System.out.println(name+"���� �߰��Ǿ���\n");
		}else{
			System.out.println("���� �Է¿���!!");
		}
	}
	public void getStudent(StudentEntity entity){
		
	}
	public void getStudentList(List<StudentEntity> list){
		if (list != null) {
			for (StudentEntity entity : list) {
				System.out.print("��ȣ : " + entity.getNum() + "\t");
				System.out.print("�̸� : " + entity.getName() + "\t");
				System.out.print("���� : " + entity.getKor() + "\t");
				System.out.print("���� : " + entity.getEng() + "\t");
				System.out.print("���� : " + entity.getMat() + "\t");
				System.out.print("���� : " + entity.getTot() + "\t");
				System.out.print("��� : " + entity.getAvg() + "\n");
			}
			System.out.println();
		} else {
			System.out.println("�����Ͱ� �����ϴ�\n");
		}
	}
}










