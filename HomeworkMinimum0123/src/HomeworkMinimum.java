import java.util.Random;

/*
정수배열 10개를 잡아 그중 최솟값을 출력하자
*/
public class HomeworkMinimum {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Random r = new Random();
		System.out.print("생성된 배열 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1000);
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum : "+min);
	}
}
