package view;

import static java.lang.System.exit;
import static java.lang.System.out;

import java.util.Scanner;

import biz.MemberBiz;
import vo.MemberVo;

//MemberMain : �Է°� ��� �ڵ带 �ϼ��Ѵ�
//5) ��� ����� MemberMain���� �Ѵ� 

/*
[��.���ȭ��]
1.�߰�  2.����  3.��ü����  4.ã��  5.����
����(1~5) : 1

�̸�: ��ȣ�� 
��ȭ: 010-123-4567
�߰��Ǿ����ϴ�

1.�߰�  2.����  3.��ü����  4.ã��  5.����
����(1~5) : 3
��ȣ��  010-123-4567
�̸���  011-789-4561

1.�߰�  2.����  3.��ü����  4.ã��  5.����
����(1~5) : 4
ã�»�� : ��ȣ��
��ȣ��  010-123-4567

1.�߰�  2.����  3.��ü����  4.ã��  5.����
����(1~5) : 2
�����һ�� : ��ȣ��
�����Ǿ����ϴ�

1.�߰�  2.����  3.��ü����  4 .ã��  5.����
����(1~5) : 4
*** �۾��� ****
*/

public class MemberMain {
	Scanner sc = null;
	MemberBiz biz = null;
	public MemberMain() {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		biz = new MemberBiz();
	}
	
	public void menu(){
		int n = 0;
		String name = null;
		MemberVo member = new MemberVo();
		while (true) {
			System.out.print("1.�߰�  2.����  3.��ü����  4.ã��  5.����");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("�̸� : ");		member.setName(sc.next());
				System.out.print("��ȭ : ");		member.setPhone(sc.next());

				biz.insertMember(member);					
				break;
			case 2:
				System.out.print("���ٻ�� : ");	name = sc.next();
				biz.deleteMember(name);
				break;
			case 3:
				biz.getMemberList();
				break;
				
			case 4:
				System.out.print("ã����� : ");	name = sc.next();
				biz.getMember(name);
				break;
				
			case 5:
				sc.close();
				System.exit(0);
				break;
			default:
				out.println("�Է¿���!!\n");
			}
		}
	}
	
	public static void main(String[] args) {
		new MemberMain().menu();
	}
}
