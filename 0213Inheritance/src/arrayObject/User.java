package arrayObject;
/*
- 이런 객체를 자주 쓴다.
- VO(Value Ob), DTO(data transfer ob), Entity, Beans(JSP에서..)라고 불린다.
- 관련성있는 데이터들을 한데 모아놓은 클래스.
*/
public class User {
	private String name;
	private String phone;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
