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
				System.out.println("종료한다.");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("다시 입력해라 0~4");
			}
			ob.speak();
			ob.walk();
		}
	}
}
/*
정적바인딩 - 컴파일시점에 호출 함수를 이미 알고 있따.
동적바인딩 - 실행시점에 호출 함수를 결정 : 코딩량을 대폭 줄일 수 있다.
*/
