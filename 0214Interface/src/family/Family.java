package family;

public class Family {
	private String name;
	public Family() {
	}
	public Family(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "�̸� : "+name;
	}
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
}
