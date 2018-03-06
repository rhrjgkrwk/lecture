package solution;

import java.util.Scanner;

/*[문제12]초를 입력하여 분과 초를 출력하시오
0이 입력될때 까지 계속 반복한다
음수가 입력되면 다시 입력을 받는다

[실행결과]
초 입력 : 250
[4]분 [10]초 입니다

초입력 : -84
초입력 : -12
초입력 : 123
[2]분 [3]초 입니다
초입력 : 0
프로그램을 종료합니다
*/
public class ExamTest12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		do {
			System.out.print("초를 입력하자 : ");
			input = sc.nextInt();
			if (input==0) {
				break;
			}
			else System.out.println("["+input/60+"]분 ["+input%60+"]초다.");
		} while (true);
		sc.close();
	}
}
