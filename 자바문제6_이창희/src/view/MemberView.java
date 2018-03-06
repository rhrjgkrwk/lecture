package view;

import java.util.List;

import vo.MemberVo;

public class MemberView {
	public void insertMember(int n){ //return inserted name 
		if (n>0) {
			System.out.println("추가되었다.");
		}
		else {
			System.out.println("추가 실패했다.");
		}
	}
	public void deleteMember(int n){
		if (n>0) {
			System.out.println("삭제되었다.");
		}
		else {
			System.out.println("그런 사람 없다.");
		}
	}
	public void getMember(MemberVo member){
		if (member!=null) {
			System.out.println(member);
		}
		else {
			System.out.println("그런 사람 없다.");
		}
	}
	public void getMemberList(List<MemberVo> list){
		if (list.size()>0) {
			for (MemberVo member : list) {
				System.out.println(member);
			}
		}
		else{
			System.out.println("테이블에 데이터가 없다.");
		}
	}
}
