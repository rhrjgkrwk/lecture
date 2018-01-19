import java.util.Scanner;

/*다이아몬드 스타워즈를 출력해보자.*/
public class Diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.print("홀수 입력 : ");
		input = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= input; i++) {
			if (i < (input + 1) / 2) {//증가
				for (int j = 1; j <= 2*i+1; j++) {
					
				}
			}
			else if (i > (input + 1) / 2) { //감소
				for (int j = 0; j < args.length; j++) {
					
				}
			}
			else{ //가운데
				for (int j = 0; j < args.length; j++) {
					
				}
			}
			System.out.println();
		}
	}
}