/*다이아몬드 스타워즈를 출력해보자.*/
public class Diamond {
	public static void main(String[] args) {
		for (int i = 1,k=0; i <= 9; i++) {
			for (int j = 0; j < k+5; j++) {
				if (j<4-k) {
					System.out.printf("%2s","　");
				}
				else {
					System.out.printf("%2s","★");
				}
			}
			if (i<4) {
				k++;
			}
			else {
				k--;
			}
			System.out.println();
		}
	}
}