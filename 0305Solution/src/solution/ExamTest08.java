package solution;

import java.util.Scanner;

/*[문제8]3자리 정수를 입력받아서 각각 자리수의 합을 구하시오.

[결과 화면]
3자리 정수를 입력하세요 :457
3자리의 합은 16 입니다.
*/
public class ExamTest08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리 정수를 입력하세요 :");
		int num = Integer.parseInt(sc.next());
		int num_100, num_10, num_1;
		
		num_100 = num / 100;	num = num % 100;
		num_10 = num / 10;		num = num % 10;
		num_1 = num / 1;
		System.out.printf("3자리의 합은 %d 입니다.\n", num_100 + num_10 + num_1);
		sc.close();
	}
}
