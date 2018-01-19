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
				System.out.printf("%2s", "☆");
			}
			System.out.println();
		}

		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%2s", "☆");
			}
			System.out.println();
		}

		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 20; j++) {
				if (i <= j)
					System.out.printf("%2s", "★");
				/*
				 * else if(i+j==21) System.out.printf("%2s","☆"); else if(i==10)
				 * System.out.printf("%2s","☆"); else if(j==11)
				 * System.out.printf("%2s","☆");
				 */
				else
					System.out.printf("%2s", "　");
			}
			System.out.println();
		}
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 21 - i; j++) {
				System.out.printf("%2s", "★");
			}
			System.out.println();
		}
		/******** Do While **********/

		/*
		 * 바디가 뒤에나옴 : 따라서 반드시 뒤에 ;을 써야된다. 
		 * 조건에 관계없이 한번은 통과 평상시에는 쓰지말자. 
		 * 메뉴물어볼때 씀 :
		 * 1번 사용자 모드 / 2번 관리자 모드 등 메뉴선택 메뉴
		 */
		
		String s =null;
		String menus[] = {"짜장면", "짬뽕"};
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. "+menus[0]);
			System.out.println("2. "+menus[1]);
			System.out.print("메뉴를 선택하세요 : ");
			s = sc.nextLine();
		} while (!s.equals("1")&&!s.equals("2")); 
		
		//문자열을 받아서 바로 int로 형변환을 할 때, 
		//숫자가 아닌것을 입력하면
		//에러가 나기 때문에
		//equals를 사용하여 string 자체로 비교하는 것이 좋다.
		
		System.out.println(menus[Integer.parseInt(s)-1]+"은 200000원 입니다.");
		sc.close();
	}
}










