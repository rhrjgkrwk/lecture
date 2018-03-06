package objectEx;

// -(private)    + (public)    #(protected)     X : default
/* 
 * -name:String                    
 * -dept:String 
 * -pay:int
 * -score:double
 * 
 * +setName(name:String):void
 * +setDept(dept:String):void
 * +setPay(pay:int):void
 * +setScore(score:double):void
 * +getName():String
 * +getDept():String
 * +getPay():int
 * +getScore():double
 * 
 * +setEmployee(name:String, dept:String, pay:int, score:double):void
 * +toString():String 
 * <Ŭ���� ����>
 * ������ ������
 * �⺯
 * ������
 * GS
 * ���� Method
 * �������� �ּ��� ���� �޾�����.
 */
public class Employee {
	private String name;
	private String dept;
	private int pay;
	private double score;
	
	//GSttrs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public void setEmployee(String name, String dept, int pay, double score){
		this.name = name;
		this.dept = dept;
		this.pay = pay;
		this.score = score;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸��� "+name+"�̰� "+dept+"�� �ٹ��ϸ� �޿��� "+pay+"�� �Ի缺���� "+score+"�Դϴ�";
	}
	
}

 



