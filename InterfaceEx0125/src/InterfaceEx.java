/*

���� ����� �غ���.
- ��Ģ������ ���� ����� �� �� ����. �ֳ�
	- �� Ŭ������ ��ӹ����� �� �θ� Ŭ������ �޼ҵ� �̸��� �ߺ��Ǿ��ٸ� ������ �� ����.
	- Diamond Problem�̶�� �Ѵ�.
- �׷��ٸ� ���..
	- Interface!!!!!!!!!! 
		- �߻�Ŭ������ ���̰�
		- �߻�Ŭ������ �Ϻ� ������ �� �߻�����. - 
		- �߻�Ŭ����ó�� �߻�޼��� ���.
	-why interface
		1. ���߻���� ����
		2. interface�� ��α����̱⶧���� interface�� ���� �۾��� �帧�� ���� �� �� �ִ�.(�ڼտ��� ������ �ؾ��ϹǷ� - ��ġ c��� �Լ� ����(��ܿ� �Լ���� ����))
		3. ���߽�, �о��� �ϰ� �Ǵµ�... ������ interface �̸�, �� �ٷ� �Ʒ� Ŭ���� �̸��� ���߰� �������� �����Ӱ� ¥���� �Ѵ�.
		   ��, �̸��� ����س��� �о��Ͽ� �۾��ϰ� ������ �ڵ带 ������ �� �ֵ��� �ϴ� �ϳ��� ������� ����.

- interface ������ ���!
	- ���߻���� �����ϴ�.
	- extends interface1, interface2 �̷�������ٰ�.
	


cf) interface - abstract class - class �������� ������ �� ��α���.(�߻�ȭ�� �־�)
*/

interface Animal extends Thing{ //���� O ���� X 
	void soom();
}

interface Thing {
	void gamani();
}

interface Human extends Thing, Animal{
	
}


class Saengseon {
	
}

class Bird{
	
}

class KKamagui extends Bird implements Animal{
	public void soom(){
		System.out.println("breathe");
	}
	public void gamani(){
		System.out.println("�ƹ��͵� ���Ѵ�");
	}
}

class Chamsae extends Bird implements Animal{		// Animal, Saengseon{ - �̷� ���� ����� �Ұ���.
	public void soom(){
		System.out.println("������");
	}
	public void gamani(){
		System.out.println("�ƹ��͵� ���Ѵ�");
	}
}


public class InterfaceEx {
	public static void main(String[] args) {
		Animal b[] = new Animal[2];
		//Animal c = new Animal(); !! error : interface�� �ν��Ͻ��� ������ �� ����. ����ȯ�� �̿��ؾ���.
		b[0] = new KKamagui();
		b[1] = new Chamsae();
		for (int i = 0; i < b.length; i++) {
			b[i].soom();
			b[i].gamani();
		}
	}
}
