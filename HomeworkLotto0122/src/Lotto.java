import java.util.Random;

/*
 * 오느르숙제 0122
1. 로또를 랜덤으로 나오게 한 후 오름차순으로 소트랗여 출력하시오. 단, 소트 부분은 메소드 2형식으루다가
2. 위의 로도 출력을 10게임으로 출력하되 중복을 제거하여 출력해보자.
*/


public class Lotto {
	public static void main(String[] args) {
		int arr[] = new int[6];
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int rn = r.nextInt(45)+1; //random # 추출
			for (int j = 0; j <= i; j++) { //이미 나왔던 수인지 chk'
				if (arr[j]!=rn) { //기존에 안나왔던 수면 
					arr[i] = rn; //배열에 담는다.
				}
			}
		}
		//정렬 전
		System.out.println("정렬 전");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		SelectionSort(arr); // 정렬을 해보자.
		//정렬 후
		System.out.println("정렬 후");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		
	}
	public static void SelectionSort(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
