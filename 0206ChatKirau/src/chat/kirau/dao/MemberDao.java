package chat.kirau.dao;

public class MemberDao {
	void connectToDB(){}
	Member getMemberById(String id){}
	boolean getLoginCheck(String id, String pw){}
	boolean duplicateCheck(String id){
		/*//" SELECT COUNT(id) as cnt"
		cnt ==1�̸� �ߺ� true / 0�̸� ��밡�� false
		*/
	}
}
