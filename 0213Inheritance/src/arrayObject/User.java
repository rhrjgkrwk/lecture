package arrayObject;
/*
- �̷� ��ü�� ���� ����.
- VO(Value Ob), DTO(data transfer ob), Entity, Beans(JSP����..)��� �Ҹ���.
- ���ü��ִ� �����͵��� �ѵ� ��Ƴ��� Ŭ����.
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
