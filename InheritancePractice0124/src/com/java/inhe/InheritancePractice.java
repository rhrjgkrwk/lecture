package com.java.inhe;

class Saram{
	//�Ӽ� : ��, �ٸ�, ��, 
	//������, ����
	String name;
	int age;
	
	public Saram(){}
	public Saram(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void move(){
		System.out.println("�����̴� ��");
	}
	public void think(){
		System.out.println("������");
	}
}
class Student extends Saram{
	//�Ӽ� : ??
	//�ൿ : ����
	String studentId;
	public Student(){}
	public Student(String studentId) {
		super();
		this.studentId = studentId;
	}
	
	public void study(){
		System.out.println("���� ��");
	}
	public void javaCoding(){
		System.out.println("java coding ��");
	}
}


public class InheritancePractice {
	public static void main(String[] args) {
		Saram a1 = new Saram();
		Student b1 = new Student();
		Student b2 = new Student("20110543");
		Saram a2 = new Saram("changhee",23);
		a1.move();
		a2.move();
		b1.move();
		b2.move();
		a1.think();
		b1.think();
		b1.study();
		b1.think();
		b2.javaCoding();
		b2.age = 12;
		b2.name = "chang";
		System.out.println(b2.age+" "+b2.name+" "+b2.studentId);
	}
}
