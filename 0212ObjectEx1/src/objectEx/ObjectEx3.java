package objectEx;


//GSetter :멤버변수 하나당 하나씩 깞을 대입해보자!!!
//새터와 그 값을 리턴하는 개터
class Member{
	private String name;
	private int age;
	private double tall;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String name, int age, double tall) {
		super();
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	
}


public class ObjectEx3 {
	public static void main(String[] args) {
		Member m = new Member();
		m.setAge(22);
		m.setName("이창희");
		m.setTall(200.0);
		
		System.out.println("이름 : "+m.getName());
		System.out.println("나이 : "+m.getAge());
		System.out.println("키 : "+m.getTall());
		
	}
}
