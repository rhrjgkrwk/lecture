package com.example.view;

import java.util.Scanner;
import com.example.biz.StudentBiz;
import com.example.entity.StudentEntity;
import static java.lang.System.exit;
import static java.lang.System.in;
import static java.lang.System.out;

public class StudentMain {
	StudentEntity entity = null;
	StudentBiz biz = null;
	Scanner sc = null;

	public StudentMain() {
		entity = new StudentEntity();
		biz = new StudentBiz();
		sc = new Scanner(in);
	}

	public void menu() {
		int n = 0;
		String name = null;
		while (true) {
			out.print("1.�߰� 2.�˻� 3.��ü���� 4.����\n����(1-4) : ");
			n = sc.nextInt();

			switch (n) {
			case 1:
				out.print("�̸��� �Է� : ");	entity.setName(sc.next());
				out.print("�������� �Է� : ");	entity.setKor(sc.nextInt());
				out.print("�������� �Է� : ");	entity.setEng(sc.nextInt());
				out.print("�������� �Է� : ");	entity.setMat(sc.nextInt());

				biz.insertStudent(entity);					
				break;

			case 2:
				out.print("ã���̸��� �Է� : ");	name = (sc.next());
				biz.getStudent(name);
				break;

			case 3:
				biz.getStudentList();
				break;

			case 4:
				sc.close();
				exit(0);
				break;
			default:
				out.println("�Է¿���!!\n");
			}
		}
	}

	public static void main(String[] args) {
		new StudentMain().menu();
	}

}
