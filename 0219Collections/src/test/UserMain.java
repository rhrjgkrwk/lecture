package test;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String id;
		String pw;
		
		System.out.print("ID�� �Է��Ͻÿ�:");  id=sc.next();
		System.out.print("PW�� �Է��Ͻÿ�:");  pw=sc.next();
		
		UserProc up=new UserProc();
		User entity=up.getLoginUser(id,pw);
		
		if (entity==null) {
			System.out.println("ID �Ǵ� PW�� Ʋ�ȴ�.");
		}
		else {
			System.out.println(entity.getName()+"���� �����ߴ�. \n���� ����Ʈ�� "+entity.getPoint()+"���̴�.");
			System.out.println("\n\n[[BOOk�� ��������]]");
			BookProc bp = new BookProc();
			for (Book b : bp.getList()) {
				System.out.println(b);
			}
		}
		sc.close();
	}
}
/* [1�� ����]
 * ID�� �Է��Ͻÿ� : pororo
 * PW�� �Է��Ͻÿ� : 1234
 * 
 * �Ƿηδ��� �����ϼ̽��ϴ�
 * ���������ʹ� 89.97�� �Դϴ�
 * 
 * -----------------------------------------------------
 *
 * ID�� �Է��Ͻÿ� : pororo
 * PW�� �Է��Ͻÿ� : 1111
 * 
 * ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�
 * 
 *=======================================================
 * [2������]
 * ID�� �Է��Ͻÿ� : pororo
 * PW�� �Է��Ͻÿ� : 1234
 * 
 * �Ƿηδ��� �����ϼ̽��ϴ�
 * ���������ʹ� 89.97�� �Դϴ�
 * 
 * 
 * [[BOOk�� ��������]]
 * å�̸�:JAVA    å����:kim      ������: 100
 * å�̸�:C++     å����:lee       ������: 250
 * å�̸�:JSP      å����:park     ������: 150
 * 

 */























