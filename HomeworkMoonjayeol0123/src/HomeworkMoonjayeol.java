import java.util.Random;
import java.util.Scanner;

/*
문자열 3개를 입력받아 배열에 넣고
문자를 변형하여 출력해보자
ex. ondal --> odanl
*/
public class HomeworkMoonjayeol {
	public static void main(String[] args) {
		// 입력받아보자
		Scanner sc = new Scanner(System.in);
		String[] strarr = new String[3];
		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = sc.nextLine();
		}
		// 변형 및 출력
		Random r = new Random();
		for (int i = 0; i < strarr.length; i++) {
			char[] ch = strarr[i].toCharArray();
			for (int j = 0; j < 3; j++) { // 랜덤으로 3번만 바꿔주자.
				int rn1 = r.nextInt(ch.length);
				int rn2 = r.nextInt(ch.length);
				char temp = ch[rn1];
				ch[rn1] = ch[rn2];
				ch[rn2] = temp;
			}
			strarr[i] = new String(ch);
		}
		for (String s : strarr) {
			System.out.println(s);
		}
		sc.close();
	}
}
