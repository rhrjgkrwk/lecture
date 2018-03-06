package homework3;
/*
[����8] ���� ���α׷��� �ϼ��Ͻÿ�
(1)Ŭ������ : Salary
  -name:String
  -salary:int
  +Salary(name:String, int salary:int) 
  +toString():String  ==>�̸��� ������ ����

(2)Ŭ������ : Test8 ==> Salary�� ��ӹ���
  -department:String
  +Test8(name:String, salary:int,department:String)
  +toString():String   ==>�μ��� ����

(3)main()�Լ�����
   public static void main(String[] args){
         Test8 ob=new Test8("��ȣ��",85000000,"���ߺ�");
         System.out.println(ob.toString()); 
   }

[���ȭ��]
�̸� : ��ȣ��
���� : 85000000
�μ� : ���ߺ�
*/
class Salary{
	private String name;
	private int salary;
	public Salary() {
	}
	public Salary(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "�̸� : "+name+"\n���� : "+salary+"\n";
	}
}

public class Test8 extends Salary{
	private String department;
	
	public Test8(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"�μ� : "+department;
	}

	public static void main(String[] args) {
		  Test8 ob=new Test8("��ȣ��",85000000,"���ߺ�");
	      System.out.println(ob.toString()); 
	}
}
