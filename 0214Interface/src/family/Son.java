package family;

public class Son extends Family implements Job{
	public Son() {
	}

	public Son(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString()+work(); //수정 필요
	}
	@Override
	public String work() {
		return "\n아들 : 공부를 한다.";
	}
}
