import java.util.Scanner;

/*	
<OVERRIDING>
- �������̵� : �޼��� ������
- ���� - ����ΰ� ��ġ�ؾ��ѵ��.
	1. �޼ҵ� �̸��� ���ƾ� �Ѵ�.
	2. ��ȯ Ÿ���� ��ġ
	3. �Ű������� ���ƾ��Ѵ�.
	4. ������������ ���, �θ� Ŭ������ �޼ҵ�� ���ų� �� �������̾���Ѵ�. �� �� �������� �� ����.
		- ex. �θ�(protected) - �ڽ�(protected or public)

- ���� ����ϴ°�
	1. 

*/

//overriding�� �غ���

class Boomo{
	public void car(){
		System.out.println("�θ��� ����̺� �θ��θ�");
	}
}

class Janyeo extends Boomo{
	public void car(){ //@@@override : ������
		System.out.println("������ ���� �θ��θ�");
	}
}

public class Overriding {
	public static void main(String[] args) {
		/*Boomo b1 = new Boomo();
		Janyeo j1 = new Janyeo();
		Boomo b2 = new Janyeo(); 
		//��ü�� ����ȯ �Ǿ�����, �θ� �������� Ÿ������ ������� �������̵�+����ȯ.
		b2.car(); //�������� ������.. 
		
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.����̺�   2.����");
		int aa = sc.nextInt();
		Boomo b1 = null;
		
		switch (aa) {
		case 1:
			b1 = new Boomo();
			break;
		case 2:
			b1 = new Janyeo();
			break;
		}
		b1.car();
		sc.close();
	}
}
