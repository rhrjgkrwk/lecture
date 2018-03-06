package employee;

/* EmpŬ������ ��� ������ 
 * -salary:long
 * -bonus:long
 * 
 * +Engineer()
 * +Engineer(eno:int, ename:String, phone:String)
 * +toString():String
 * 
 *  [����]
 *  ���ʽ�+=150000�� �������� ����
 */
public class Engineer extends Emp{
	private long salary;
	private long bonus;
	
	public Engineer() {
		super();
	}
	public Engineer(int eno, String ename, String phone) {
		super(eno, ename, phone);
	}
	@Override
	public void setSalary(long salary) {
		this.salary=salary;
	}
	@Override
	public void setBonus(long bonus) {
		this.bonus=bonus+150000;
	}
	public String toString(){
		return "�����ȣ:"+super.getEno() 
				+"\n����̸�:"+super.getEname()
				+"\n������ȣ:"+super.getPhone()
				+"\n�⺻�޿�:"+salary
				+"\n���ʽ�+����:"+bonus
				+"\n���ޱݾ�:"+(salary+bonus)+"��\n";
	}	
}
