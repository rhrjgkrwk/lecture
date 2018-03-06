package instance;

//�������� ���ʽ��� �ٸ��� ����
abstract class Employee{
	String name;
	int salary;
	
	public Employee() {
		super();
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	abstract public int getBonus();   //���Ժ��ʽ�
	
	@Override
	public String toString() {
		return name + "\t" + salary;
	}
}
//--------------------------------------------------------
class Engineer extends Employee{
	public Engineer() {
		super();
	}
	public Engineer(String name, int salary) {
		super(name, salary);
	}
	@Override
	public int getBonus() {
		return 150000;
	}
	@Override
	public String toString() {
		return super.toString()+"  \t"+getBonus();
	}
}
//--------------------------------------------------------
class Developer extends Employee{
	public Developer() {
		super();
	}
	public Developer(String name, int salary) {
		super(name, salary);
	}
	@Override
	public int getBonus() {
		return 100000;
	}
	@Override
	public String toString() {
		return super.toString()+"  \t"+getBonus();
	}
}
//--------------------------------------------------------
public class InstanceofEx2 {
	public static void main(String[] args) {
		Employee[] em=new Employee[]{new Engineer("kim", 1200000),
				                     new Developer("lee", 1750000),
				                     new Engineer("park", 2500000),
				                     new Developer("hong", 2350000)};
		
		/* Engineer�� �޿��� 13%, Developer�� 15%�� Ư�����ʽ��� ����*/
		System.out.println("�̸�    �޿�         ���Ժ��ʽ�   Ư�����ʽ�");
		System.out.println("=========================================");
		for (Employee e : em) {
			if (e instanceof Engineer) {//e == Engineer
				System.out.println(e+"  \t"+String.format("%d",(int)(e.salary*0.13)));
			}
			else if (e instanceof Developer) { //e == Developer
				System.out.println(e+"  \t"+String.format("%d",(int)(e.salary*0.15)));
			}
		}
	}
}















