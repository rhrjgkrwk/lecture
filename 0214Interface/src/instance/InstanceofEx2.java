package instance;

//직군별로 보너스를 다르게 지급
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
	abstract public int getBonus();   //정규보너스
	
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
		
		/* Engineer는 급여의 13%, Developer는 15%의 특별보너스를 지급*/
		System.out.println("이름    급여         정규보너스   특별보너스");
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















