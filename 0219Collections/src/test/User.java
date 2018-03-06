package test;

/*
-id:String   -pw:String   -name:String   -point:double
�⺻������ / 4�����ڻ����� / getter&setter
*/
//entity, VO(Value Object), Bean, DTO(Data Tranfer Object)
public class User {
	private String id;
	private String pw;
	private String name;
	private double point;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String id, String pw, String name, double point) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
	
}
