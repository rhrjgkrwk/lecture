package emp;

//����Ʈ������, ����3���޴� ������, getter&setter
// VO(Value Object), Entity, DTO(Data Transfer Object), Bean
// : ����Ÿ�� �ϳ��� ��� ������ �������� ���� Ŭ����
public class EmpVo {
	private String ename;
	private String dept;
	private int salary;
	public EmpVo() {
		// TODO Auto-generated constructor stub
	}
	public EmpVo(String ename, String dept, int salary) {
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸� : "+ename+"\n�μ� : "+dept+"\n�޿� : "+salary;
	}
}
