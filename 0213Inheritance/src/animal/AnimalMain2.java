package animal;

import java.util.Scanner;

public class AnimalMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Animal ob = null;

		while (true) {
			System.out.println();
			System.out.println("[1. dog] [2. cat] [3. fish] [4. duck] [0. exit]");
			n = sc.nextInt();
			switch (n) {
			case 1:
				ob = new Dog();
				System.out.println(ob);
				System.out.println(Integer.toHexString(ob.hashCode()));
				Object o = ob.hashCode();
				
				System.out.println(Integer.toHexString(o.hashCode()));
				break;
			case 2:
				ob = new Cat();
				break;
			case 3:
				ob = new Fish();
				break;
			case 4:
				ob = new Duck();
				break;
			case 0:
				System.out.println("�����Ѵ�.");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("�ٽ� �Է��ض� 0~4");
			}
			ob.speak();
			ob.walk();
		}
	}
}
/*
�������ε� - �����Ͻ����� ȣ�� �Լ��� �̹� �˰� �ֵ�.
�������ε� - ��������� ȣ�� �Լ��� ���� : �ڵ����� ���� ���� �� �ִ�.
*/
