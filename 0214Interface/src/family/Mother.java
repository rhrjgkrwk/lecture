package family;

public class Mother extends Family implements Job{
	public Mother() {
	}

	public Mother(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString()+work(); //수정 필요
	}
	@Override
	public String work() {
		return "\n엄마 : 일을 한다.";
	}
}
