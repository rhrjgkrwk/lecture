package family;

public class Father extends Family implements Job{
	
	public Father() {
	}

	public Father(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString()+work(); //���� �ʿ�
	}
	@Override
	public String work() {
		return "\n�ƺ� : ���� �Ѵ�.";
	}
}
