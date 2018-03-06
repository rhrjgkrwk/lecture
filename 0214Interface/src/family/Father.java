package family;

public class Father extends Family implements Job{
	
	public Father() {
	}

	public Father(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString()+work(); //수정 필요
	}
	@Override
	public String work() {
		return "\n아빠 : 일을 한다.";
	}
}
