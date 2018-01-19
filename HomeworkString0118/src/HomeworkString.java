import java.util.Random;
import java.util.Scanner;

/* 영어 문자열을 입력받아
 * 해당 문자열 중 임의로 3개의문자를
 * 무작위로 출력하시오.
 * 중복출력 가능*/

public class HomeworkString {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		String str = sc.nextLine();
		System.out.printf("%c%c%c",
				str.charAt(r.nextInt(str.length())),
				str.charAt(r.nextInt(str.length())),
				str.charAt(r.nextInt(str.length())));
		sc.close();
	}
}
