import java.util.Scanner;

public class Forwhile {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%2d  * %2d = %2d\t\t", j, i, i * j);
			}
			System.out.println();
		}

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.printf("%2s", "��");
			}
			System.out.println();
		}

		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%2s", "��");
			}
			System.out.println();
		}

		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 20; j++) {
				if (i <= j)
					System.out.printf("%2s", "��");
				/*
				 * else if(i+j==21) System.out.printf("%2s","��"); else if(i==10)
				 * System.out.printf("%2s","��"); else if(j==11)
				 * System.out.printf("%2s","��");
				 */
				else
					System.out.printf("%2s", "��");
			}
			System.out.println();
		}
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 21 - i; j++) {
				System.out.printf("%2s", "��");
			}
			System.out.println();
		}
		/******** Do While **********/

		/*
		 * �ٵ� �ڿ����� : ���� �ݵ�� �ڿ� ;�� ��ߵȴ�. 
		 * ���ǿ� ������� �ѹ��� ��� ���ÿ��� ��������. 
		 * �޴������ �� :
		 * 1�� ����� ��� / 2�� ������ ��� �� �޴����� �޴�
		 */
		
		String s =null;
		String menus[] = {"¥���", "«��"};
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. "+menus[0]);
			System.out.println("2. "+menus[1]);
			System.out.print("�޴��� �����ϼ��� : ");
			s = sc.nextLine();
		} while (!s.equals("1")&&!s.equals("2")); 
		
		//���ڿ��� �޾Ƽ� �ٷ� int�� ����ȯ�� �� ��, 
		//���ڰ� �ƴѰ��� �Է��ϸ�
		//������ ���� ������
		//equals�� ����Ͽ� string ��ü�� ���ϴ� ���� ����.
		
		System.out.println(menus[Integer.parseInt(s)-1]+"�� 200000�� �Դϴ�.");
		sc.close();
	}
}










