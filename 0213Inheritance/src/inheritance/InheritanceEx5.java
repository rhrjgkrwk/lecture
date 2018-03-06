package inheritance;


//디폴트 생성/인자2생성 toString
class Emp{
	private String name;
	private String addr;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "내 이름은 "+name+". "+addr+"에 산다.";
	}
}

class EmpCompany extends Emp{
	private String company;
	private int salary;
	public EmpCompany() {
		super();
	}
	public EmpCompany(String name, String addr, String company, int salary) {
		super(name, addr);
		this.company = company;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString()+"\n"+company+"에 다니고 있고 월급은 "+salary+"만원 이다.";
	}
}

public class InheritanceEx5{
	public static void main(String[] args) {
		Emp ob1 = new Emp("코난","일본");
		System.out.println(ob1+"\n");
		EmpCompany ob2 = new EmpCompany("코난","일본","삼성",1000);
		System.out.println(ob2);
	}
}
