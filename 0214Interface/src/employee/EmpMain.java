package employee;

public class EmpMain {
	public static void main(String[] args) {
		Developer dev=new Developer(101, "Scott", "5678");
		dev.setSalary(2500000);
		dev.setBonus(350000);
		System.out.println(dev.toString());
		
		Engineer eng=new Engineer(201,"Steve","1234");
		eng.setSalary(1500000);
		eng.setBonus(75000);
		System.out.println(eng.toString());
	}
}
/* �����ȣ:101
 * ����̸�:Scott
 * ������ȣ:5678
 * �⺻�޿�:2500000
 * ���ʽ�+����:450000
 * ���ޱݾ� : 2950000��
 * 
 * �����ȣ:201
 * ����̸�:Steve
 * ������ȣ:1234
 * �⺻�޿�:1500000
 * ���ʽ�+����:225000
 * ���ޱݾ� : 1725000��
 */

