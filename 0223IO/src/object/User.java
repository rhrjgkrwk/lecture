package object;

import java.io.Serializable;

public class User implements Serializable{  //객체 직렬화 - 한줄만 써주면 끝!
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
