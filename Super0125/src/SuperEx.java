
/*
Super�� ����غ���.!

*/

class Parent {
	int age;
	public Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("�θ��� ����� ����");
	}
	public Parent(int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		System.out.println("�θ��� "+this.age+"��");
	}
	public void jangsoo() {
		System.out.println("�츮 ������ ��� ����");
	}
}

class Child extends Parent{
	int cAge;
	public Child(int cAge) {
		// TODO Auto-generated constructor stub
		super(162); //��������� �θ� �����ڸ� ȣ���ϰ��� �ϸ� super()�� �ϸ�ȴ�.
		this.cAge = cAge;
		System.out.println("�ڽĳ��� "+this.cAge+"��");
		super.jangsoo(); //super�� �θ� ����Ų��.
		this.jangsoo(); //this�� ���� Ŭ����.
	}
	public void jangsoo() {
		System.out.println("��� ����");
	}
}

public class SuperEx {
	public static void main(String[] args) {
		Child c = new Child(123); //�θ��� ����� ���ߵ� ���� ����..
		//�� �θ��� �����ڸ� �����ұ�
		//��ӿ��� �ڽ� �����ڸ� ȣ���ϸ� 
		//�θ� ���� ã�ư��� ó���� �� �ڳฦ ó���Ѵ�.!!!!!!
		//�θ� ���� ã�ư��� ������ �θ� �����ڸ� ã�ư� ����� ����
		//
		//
	}
}
