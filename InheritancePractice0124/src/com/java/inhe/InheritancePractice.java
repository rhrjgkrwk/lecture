package com.java.inhe;

class Saram{
	//속성 : 눈, 다리, 팔, 
	//움직임, 생각
	String name;
	int age;
	
	public Saram(){}
	public Saram(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void move(){
		System.out.println("움직이는 중");
	}
	public void think(){
		System.out.println("생각중");
	}
}
class Student extends Saram{
	//속성 : ??
	//행동 : 공부
	String studentId;
	public Student(){}
	public Student(String studentId) {
		super();
		this.studentId = studentId;
	}
	
	public void study(){
		System.out.println("공부 중");
	}
	public void javaCoding(){
		System.out.println("java coding 중");
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
