package objectEx;


//GSetter :������� �ϳ��� �ϳ��� ���� �����غ���!!!
//���Ϳ� �� ���� �����ϴ� ����
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
		m.setName("��â��");
		m.setTall(200.0);
		
		System.out.println("�̸� : "+m.getName());
		System.out.println("���� : "+m.getAge());
		System.out.println("Ű : "+m.getTall());
		
	}
}
