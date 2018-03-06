package emp;

import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
		EmpDao dao=new EmpDao();
		System.out.println("** ��� ��� ����ϱ� **");
		
		List<EmpVo> list= dao.getEmpList();
		
		//------------------------------------------------------

		for (EmpVo e : list) {
			System.out.println(e);
		}
		
		System.out.println("** lee ��� ����ϱ� **");
		//��� ã��.
		EmpVo ob=dao.getEmp("lee");	
		System.out.println(ob==null?"ã�� ����� �����ϴ�.":ob);	
	}
}
/*
***��� ��� ����ϱ�***
�̸� : kim
�μ� : ������
�޿� : 1000000

�̸� : lee
�μ� : ���ߺ�
�޿� : 1500000

�̸� : park
�μ� : ������
�޿� : 3000000
============================
** lee��� ����ϱ�**
lee  ���ߺ�  1500000
*/
