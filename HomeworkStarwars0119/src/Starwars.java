import java.util.Scanner;

/*���� �Է¹޾� ���� ����ŭ ��Ÿ��� ����Ͻÿ�. */

public class Starwars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.print("input : ");
		input = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= input; i++) {
			for (int j = 1 ; j <= input-i ; j++) {
				System.out.printf("%3s"," ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.printf("%3d",k);
			}
			System.out.println();
		}
				
		sc.close();
	}
}
