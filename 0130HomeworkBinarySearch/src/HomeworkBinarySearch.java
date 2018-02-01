import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//binary search�� �غ���.

public class HomeworkBinarySearch {
	public static void main(String[] args) {
		int arr[] = new int [100]; //�迭�� ���̴� 100���� �����Ѵ�.
		Random r = new Random();
		for (int t = 0; t < 100; t++) { 
			for (int i = 0; i < arr.length; i++) {
				while (true) {
					int rn = r.nextInt(10000) + 1; // random # ����
					boolean chk = false; // �ߺ��� �ִ��� chk 
					for (int j = 0; j < i; j++) { 
						if (rn == arr[j]) {
							chk = true; //�ߺ��� ������ true
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
		Arrays.sort(arr); //binary search�� ���� �����Ѵ�.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("ã���� �ϴ� ���ڸ� �Է��ϼ���(1~10000) : ");
		int k = sc.nextInt();
		System.out.println(binarySearch1(k, arr));		
	}
	
	public static int binarySearch1(int k, int arr[]){ //�迭���� k�� ã�ƺ���. ������ -1����
		int right = arr.length-1;
		int left = 0;
		//int count = 0; //�� �� �˻��ϴ��� üũ�غ���.
		while (right>left+1) {
			int center = (left+right+1)/2;
			if (arr[center]==k) {
				return center;
			}
			else if (arr[center]>k) { // �������� 
				right = center;
			}
			else{ //����������
				left = center;
			}
		}
		return -1;
	}
}
