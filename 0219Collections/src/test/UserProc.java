package test;

//데이타베이스 연동(비즈니스로직 처리)
public class UserProc {
	
	/*
	 *   getLoginUser 메서드를 만드시오
	 *   
	 *   매개변수로 들어온 pororo와 1234를 비교하여
	 *   맞으면  entity 객체를 만들어  ==> User entity=new User();
	 *   setter를 통해 id, pw, "뽀로로", 89.97를 대입하시오
	 *   
	 *   entity를 리턴하시오
	 */
	
	public User getLoginUser(String id, String pw){
		//여기서 있는지 없는지 체크.
		User entity = null;
		if (id.equals("pororo") && pw.equals("1234")) {
			entity = new User(id, pw, "뽀로로", 89.22);
		}
		return entity;
	}
	
}
