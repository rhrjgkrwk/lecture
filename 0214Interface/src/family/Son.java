package family;

public class Son extends Family implements Job{
	public Son() {
	}

	public Son(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString()+work(); //���� �ʿ�
	}
	@Override
	public String work() {
		return "\n�Ƶ� : ���θ� �Ѵ�.";
	}
}
