import java.util.Scanner;

/*���̾Ƹ�� ��Ÿ��� ����غ���.*/
public class Diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.print("Ȧ�� �Է� : ");
		input = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= input; i++) {
			if (i < (input + 1) / 2) {//����
				for (int j = 1; j <= 2*i+1; j++) {
					
				}
			}
			else if (i > (input + 1) / 2) { //����
				for (int j = 0; j < args.length; j++) {
					
				}
			}
			else{ //���
				for (int j = 0; j < args.length; j++) {
					
				}
			}
			System.out.println();
		}
	}
}