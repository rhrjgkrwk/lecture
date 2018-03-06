package test4;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private int age;
	private double tall;
	
	public User() {
		super();
	}
	public User(String name, int age, double tall) {
		super();
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	@Override
	public String toString() {
		return "이름 : " + name +"\t나이 : " + age +"\t키 : "+tall;
	}	
	
}
