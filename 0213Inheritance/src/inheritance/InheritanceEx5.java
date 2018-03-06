package inheritance;


//����Ʈ ����/����2���� toString
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
		return "�� �̸��� "+name+". "+addr+"�� ���.";
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
		return super.toString()+"\n"+company+"�� �ٴϰ� �ְ� ������ "+salary+"���� �̴�.";
	}
}

public class InheritanceEx5{
	public static void main(String[] args) {
		Emp ob1 = new Emp("�ڳ�","�Ϻ�");
		System.out.println(ob1+"\n");
		EmpCompany ob2 = new EmpCompany("�ڳ�","�Ϻ�","�Ｚ",1000);
		System.out.println(ob2);
	}
}
