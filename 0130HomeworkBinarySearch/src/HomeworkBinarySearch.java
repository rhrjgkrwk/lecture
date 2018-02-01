import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//binary search를 해보자.

public class HomeworkBinarySearch {
	public static void main(String[] args) {
		int arr[] = new int [100]; //배열의 길이는 100으로 고정한다.
		Random r = new Random();
		for (int t = 0; t < 100; t++) { 
			for (int i = 0; i < arr.length; i++) {
				while (true) {
					int rn = r.nextInt(10000) + 1; // random # 추출
					boolean chk = false; // 중복이 있는지 chk 
					for (int j = 0; j < i; j++) { 
						if (rn == arr[j]) {
							chk = true; //중복이 있으면 true
							break;
						}
					}
					if (chk==false) { 
						arr[i] = rn;
						break;
					}
				}
			}	
		}
		Arrays.sort(arr); //binary search를 위해 정렬한다.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("찾고자 하는 숫자를 입력하세요(1~10000) : ");
		int k = sc.nextInt();
		System.out.println(binarySearch1(k, arr));		
	}
	
	public static int binarySearch1(int k, int arr[]){ //배열에서 k를 찾아보자. 없으면 -1리턴
		int right = arr.length-1;
		int left = 0;
		//int count = 0; //몇 번 검색하는지 체크해보자.
		while (right>left+1) {
			int center = (left+right+1)/2;
			if (arr[center]==k) {
				return center;
			}
			else if (arr[center]>k) { // 왼쪽으로 
				right = center;
			}
			else{ //오른쪽으로
				left = center;
			}
		}
		return -1;
	}
}
