package objectEx;

public class ObjectEx4 {
	public static void main(String[] args) {
		Employee  em=new Employee();
		//setter�� ���� �����ϰ� toString()�� ����Ͻÿ�
		em.setName("������");
		em.setDept("�����");
		em.setPay(50000000);
		em.setScore(99.0);
		System.out.println(em);
		
		em.setEmployee("���޷�","�渮��",1200000,75.34);
		//getter�� ����Ͻÿ�
		System.out.println("�̸� : "+em.getName());
		System.out.println("�μ� : "+em.getDept());
		System.out.println("���� : "+em.getPay()+"��");
		System.out.println("���� : "+em.getScore()+"��");
	}
}
/*
�̸��� �̼����̰� ���ߺο� �ٹ��ϸ� �޿��� 1500000�� �Ի缺���� 85.75�Դϴ�

����̸� : ���޷�
�ٹ��μ� : �渮��
�޴±޿� : 1200000��
�Ի����� : 75.34��
*/




