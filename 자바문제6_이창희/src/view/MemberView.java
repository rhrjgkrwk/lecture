package view;

import java.util.List;

import vo.MemberVo;

public class MemberView {
	public void insertMember(int n){ //return inserted name 
		if (n>0) {
			System.out.println("�߰��Ǿ���.");
		}
		else {
			System.out.println("�߰� �����ߴ�.");
		}
	}
	public void deleteMember(int n){
		if (n>0) {
			System.out.println("�����Ǿ���.");
		}
		else {
			System.out.println("�׷� ��� ����.");
		}
	}
	public void getMember(MemberVo member){
		if (member!=null) {
			System.out.println(member);
		}
		else {
			System.out.println("�׷� ��� ����.");
		}
	}
	public void getMemberList(List<MemberVo> list){
		if (list.size()>0) {
			for (MemberVo member : list) {
				System.out.println(member);
			}
		}
		else{
			System.out.println("���̺� �����Ͱ� ����.");
		}
	}
}
