package inheritance;
class ParentEx{
	public ParentEx() {
		// TODO Auto-generated constructor stub
		super(); // Object Ŭ������ �����ڸ� ȣ��
		System.out.println("parent class");
	}
	public void show(){
		System.out.println("show1 method");
	}
}

//��ӽ� ������ �θ��� �����ڸ� ���� ��ġ�� �ڽ��� �����ڸ� �����ϰ� �Ǿ��ִµ�
//�̴� �θ� ��ӹޱ� ������ �ڽ� ������ ��ü ������ �θ��� �޸� ������ ����� �־�� �ϱ� �����̴�.

class ChildEx extends ParentEx{
	public ChildEx() {
		// TODO Auto-generated constructor stub
		System.out.println("child class");
	}
	public void show(){
		System.out.println("show2 method");
	}
}
public class InheritanceEx3 {
	public static void main(String[] args) {
		ChildEx c = new ChildEx();
	}
}
