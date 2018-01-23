import java.util.Random;

/*
 * 오느르숙제 0122
1. 로또를 랜덤으로 나오게 한 후 오름차순으로 소트랗여 출력하시오. 단, 소트 부분은 메소드 2형식으루다가
2. 위의 로도 출력을 10게임으로 출력하되 중복을 제거하여 출력해보자.
*/

public class LottoTen {
	public static void main(String[] args) {
		int arr[] = new int[6];
		Random r = new Random();
		System.out.println("<랜덤 로또 추출기>");
		for (int t = 0; t < 10; t++) { // 로또를 10개 생성해보자.
			System.out.printf("%-3d번째 로또 : ", t + 1);
			for (int i = 0; i < arr.length; i++) {
				while (true) {
					int rn = r.nextInt(45) + 1; // random # 추출
					boolean chk = false; // 중복이 있는지 chk 
					
					for (int j = 0; j < i; j++) { // 검토하고 중복이 있으면 루프 반복
						if (rn == arr[j]) {
							chk = true; //중복이 있으면 true
							break;
						}
					}
					if (chk==false) { // 중복이 없으면 rn을 arr[i]에 대입
						arr[i] = rn;
						break;
					}
				}
			}
			SelectionSort(arr); // 정렬을 해보자.
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + "\t"); // 방금 생성한 로또를 출력해보자.
			System.out.println();
		}
	}

	public static void SelectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
