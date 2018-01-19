import java.util.Random;
import java.util.Scanner;

public class SwitchStudy {
	public static void main(String[] args) {
		// answer list
		String ans1 = "Yes";
		String ans2 = "No";
		String ans3 = "Wait a minute";
		boolean flag = true;

		// input
		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.print("input : ");
			String a = sc.nextLine();
			flag = a.equals("x") ? false : true;

			// random number
			Random rd = new Random();
			int r = rd.nextInt(3) + 1; // 1-3 랜덤 추출

			// print
			switch (r) { // switch 실수는 안됨. 문자열, 문자 다됨
			case 1:
				System.out.println(ans1);
				break;
			case 2:
				System.out.println(ans2);
				break;
			case 3:
				System.out.println(ans3);
				break;
			/*default:
				break;*/
			}
		}
		sc.close();
	}
}
