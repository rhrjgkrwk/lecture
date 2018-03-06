package view;

import static java.lang.System.exit;
import static java.lang.System.out;

import java.util.Scanner;

import biz.MemberBiz;
import vo.MemberVo;

//MemberMain : 입력과 출력 코드를 완성한다
//5) 모든 출력은 MemberMain에서 한다 

/*
[입.출력화면]
1.추가  2.삭제  3.전체보기  4.찾기  5.종료
선택(1~5) : 1

이름: 강호동 
전화: 010-123-4567
추가되었습니다

1.추가  2.삭제  3.전체보기  4.찾기  5.종료
선택(1~5) : 3
강호동  010-123-4567
이만기  011-789-4561

1.추가  2.삭제  3.전체보기  4.찾기  5.종료
선택(1~5) : 4
찾는사람 : 강호동
강호동  010-123-4567

1.추가  2.삭제  3.전체보기  4.찾기  5.종료
선택(1~5) : 2
삭제할사람 : 강호동
삭제되었습니다

1.추가  2.삭제  3.전체보기  4 .찾기  5.종료
선택(1~5) : 4
*** 작업끝 ****
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
			System.out.print("1.추가  2.삭제  3.전체보기  4.찾기  5.종료");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("이름 : ");		member.setName(sc.next());
				System.out.print("전화 : ");		member.setPhone(sc.next());

				biz.insertMember(member);					
				break;
			case 2:
				System.out.print("없앨사람 : ");	name = sc.next();
				biz.deleteMember(name);
				break;
			case 3:
				biz.getMemberList();
				break;
				
			case 4:
				System.out.print("찾을사람 : ");	name = sc.next();
				biz.getMember(name);
				break;
				
			case 5:
				sc.close();
				System.exit(0);
				break;
			default:
				out.println("입력오류!!\n");
			}
		}
	}
	
	public static void main(String[] args) {
		new MemberMain().menu();
	}
}
