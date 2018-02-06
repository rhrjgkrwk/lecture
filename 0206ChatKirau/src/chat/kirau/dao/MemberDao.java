package chat.kirau.dao;

public class MemberDao {
	void connectToDB(){}
	Member getMemberById(String id){}
	boolean getLoginCheck(String id, String pw){}
	boolean duplicateCheck(String id){
		/*//" SELECT COUNT(id) as cnt"
		cnt ==1이면 중복 true / 0이면 사용가능 false
		*/
	}
}
