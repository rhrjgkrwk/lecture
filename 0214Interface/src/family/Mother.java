package family;

public class Mother extends Family implements Job{
	public Mother() {
	}

	public Mother(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString()+work(); //���� �ʿ�
	}
	@Override
	public String work() {
		return "\n���� : ���� �Ѵ�.";
	}
}
