package homework3;
/*
[문제8] 다음 프로그램을 완성하시오
(1)클래스명 : Salary
  -name:String
  -salary:int
  +Salary(name:String, int salary:int) 
  +toString():String  ==>이름과 연봉을 리턴

(2)클래스명 : Test8 ==> Salary를 상속받음
  -department:String
  +Test8(name:String, salary:int,department:String)
  +toString():String   ==>부서를 리턴

(3)main()함수에서
   public static void main(String[] args){
         Test8 ob=new Test8("강호동",85000000,"개발부");
         System.out.println(ob.toString()); 
   }

[출력화면]
이름 : 강호동
연봉 : 85000000
부서 : 개발부
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
		return "이름 : "+name+"\n연봉 : "+salary+"\n";
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
		return super.toString()+"부서 : "+department;
	}

	public static void main(String[] args) {
		  Test8 ob=new Test8("강호동",85000000,"개발부");
	      System.out.println(ob.toString()); 
	}
}
