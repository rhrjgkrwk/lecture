/*
- ��ӿ� ���� �˾ƺ���.
	- ������ �� �� �ִ�.
	- �����޴´�.
	- 100% ��� - ��缱�� �Ұ���(�θ� �� �޴´�.)
- ����� ��Ģ
	- 100% ���
	- ����, �ڳ��� ����� �θ𺸴� ���ų� ����.
	- ���� Ŭ����, �θ� Ŭ����, �⺻ Ŭ����, ���̽� Ŭ���� / ���ϵ� Ŭ����, �ڽ� Ŭ����, �Ļ�(delived) Ŭ����
	
	class Animal{  }
	
	class Bird extends Animal{ 
		��� = extends = �ڽ� is a kind of �θ�
	 }
	
*/

class Animal{
	int numOfLegs;
	public void move(){
		System.out.println("�����ε�ƾƾƾ�");
	}
}

class Bird extends Animal{
	public void sing(){
		System.out.println("�뷡 : ��Ǳ�ƾƾƾƾƾƾƾƾƾ�");
	}
}

public class Sangsok {
	public static void main(String[] args) {
		Bird kkach = new Bird();
		kkach.move();
		kkach.sing();
		Animal animal = new Animal();
		animal.move();
		animal.numOfLegs = 4;
		System.out.println(animal.numOfLegs);
	}
}
