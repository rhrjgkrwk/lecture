package test3;

public class Soccer implements Comparable<Soccer>{
	private String name;
	private String position;
	private int age;
	
	public Soccer() {
		// TODO Auto-generated constructor stub
	}
	
	public Soccer(String name, String position, int age) {
		this.name = name;
		this.position = position;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Soccer o) {
		// TODO Auto-generated method stub
		return this.position.compareTo(o.position); //포지션 오림차순
//		return this.age - o.age; //나이 오름차순
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+position+" "+age;
		
	}
}
