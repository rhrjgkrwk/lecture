import java.util.Random;
import java.util.Scanner;

/*
���ڿ� 3���� �Է¹޾� �迭�� �ְ�
���ڸ� �����Ͽ� ����غ���
ex. ondal --> odanl
*/
public class HomeworkMoonjayeol {
	public static void main(String[] args) {
		// �Է¹޾ƺ���
		Scanner sc = new Scanner(System.in);
		String[] strarr = new String[3];
		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = sc.nextLine();
		}
		// ���� �� ���
		Random r = new Random();
		for (int i = 0; i < strarr.length; i++) {
			char[] ch = strarr[i].toCharArray();
			for (int j = 0; j < 3; j++) { // �������� 3���� �ٲ�����.
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
