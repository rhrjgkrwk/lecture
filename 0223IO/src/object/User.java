package object;

import java.io.Serializable;

public class User implements Serializable{  //��ü ����ȭ - ���ٸ� ���ָ� ��!
	private String name;
	private int age;
	private double score;
	
	public User() {
	
	}
	
	public User(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void display(){
		System.out.println(name+" "+age+" "+score);
	}
}
