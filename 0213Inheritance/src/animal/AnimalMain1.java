package animal;

import java.util.Scanner;

public class AnimalMain1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Dog ob1 = null;
		Cat ob2 = null;
		Fish ob3 = null;
		Duck ob4 = null;

		while (true) {
			System.out.println();
			System.out.println("[1. dog] [2. cat] [3. fish] [4. duck] [0. exit]");
			n = sc.nextInt();
			switch (n) {
			case 1:
				ob1 = new Dog();
				ob1.speak();
				ob1.walk();
				break;
			case 2:
				ob2 = new Cat();
				ob2.speak();
				ob2.walk();
				break;
			case 3:
				ob3 = new Fish();
				ob3.speak();
				ob3.walk();
				break;
			case 4:
				ob4 = new Duck();
				ob4.speak();
				ob4.walk();
				break;
			case 0:
				System.out.println("종료한다.");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("다시 입력해라 0~4");
			}
		}

		
	}
}
