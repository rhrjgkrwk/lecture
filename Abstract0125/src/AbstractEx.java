
/*
<������>
- ��ü�� ����ȯ�� ���ؼ� �˾ƺ���.
	- �ڷ��� ����ȯ�� (int)���� ĳ��Ʈ �����ڷ� �����ϰ� �� �� �ֵ�
	- ��ü�� ����ȯ�� ... 

<�߻�Ŭ����>
	- abstract ��ü�� ����
	- �߻�Ŭ������ �� ���°�!!!!!!!(�߻�)
		1. �� �� �������� ���̱� ���� ����(
		2. !!!������.
*/
abstract class Fruit{ //�߻�޼ҵ尡 �ִ� Ŭ������ �ݵ�� abstract Ŭ���������Ѵ�.
	public void eat(){
		System.out.println("�ȳ���ô��ô");
	}
	public abstract void eat1(); 
	//abstract�� ���� �޼ҵ带 �߻�޼ҵ��� �Ѵ�.
	//�߻��� �� �״�� ��ü�� ����
	//���� �����ϰ� ������ �Ұ����ϴ�.
}

class Bae extends Fruit{
	public void eat1(){
		System.out.println("�踦 ����");
	}
}

class Sakwa extends Fruit{
	public void eat1(){
		System.out.println("����� �ձ۰� ��Ƽ� ����");
	}
}

class Gam extends Fruit{
	public void eat1(){
		System.out.println("���� �׳� ����");
	}
}

/*class Apple extends Fruit{
	
}
class Orange extends Fruit{
	
}*/
public class AbstractEx {
	public static void main(String[] args) {
		//Fruit f = new Fruit(); //�߻�Ŭ������ ��ü ������ �Ұ�����.
		Fruit f = new Gam();
		///f.eat1();
		
		//��ü�迭�� ���� ���� �ٷ���
		
		Fruit[] f1 = new Fruit[3];
		f1[0] = new Gam();
		f1[1] = new Sakwa();
		f1[2] = new Bae();
		
		for (int i = 0; i < f1.length; i++) {
			f1[i].eat1();
			f1[i].eat();
		}
	}
}
