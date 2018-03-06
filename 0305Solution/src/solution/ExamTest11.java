package solution;

import java.util.Scanner;

/* [����11] ���ҵ� �ݾ׿��� ��ǰ ���� 2340���� �� ������ �������� �Ž������� �ַ��� �Ѵ�.
 �ּ� ������ ������  �Ž������� �� �� �ְ� �����Ͻÿ�.
 ������ 500, 100, 50, 10 ���� ���ȴٰ� ���Ѵ�.
 
 [��� ȭ��]
 ���ҵ� �ݾ��� ��ǰ ���� ���� ���� �� -> "��ǰ�� ������ �� �����"
 ���ҵ� �ݾװ� ��ǰ ������ ������ �� -> "�Ž������� �����ϴ�."
 ���ҵ� �ݾ��� ��ǰ ���� ���� ���� �� -> "500�� X��, 100�� X��..."
 �ʿ���� �ݾ��� ������ ������� �ʴ´�. 
*/
public class ExamTest11 {
	public static int arr[] = {10, 50, 100, 500};
	public static int d[][];
	public static void main(String[] args) {
		int productPrice = 2340;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� ������ �ּ��� : ");
		int money = sc.nextInt();
		System.out.print("��ǰ�� ���� : "+productPrice);
		if (money<productPrice) {
			System.out.println("\n�� �� ����.");
		}
		else if (money==productPrice) {
			System.out.println("\n�Ž����� ����.");
		}
		else {
			System.out.println("\n�Ž����� : "+(money-productPrice));
			d = new int[4][money-productPrice+1];
			dp(money-productPrice);
			for (int i = 0; i < arr.length ; i++) {
				if (d[i][money-productPrice]!=0) System.out.println(arr[i]+"�� : "+d[i][money-productPrice]+"��");
			}
		}
		
		sc.nextLine();
		sc.close();
		
		
	}
	public static void dp(int change){
		int j = arr[0];
		while (j<=change) {
			int min = 1000000001;
			int tmp=6;
			for (int i = 0; i < arr.length; i++) {//���� ����Ʈ
				if (arr[i]<=j && coinSum(j-arr[i])<=min) {
					min = coinSum(j-arr[i]);
					tmp = i;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				d[i][j] = d[i][j-arr[tmp]];
			}
			d[tmp][j]++;
			j++;
		}
	}
	public static int coinSum(int j){
		int sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i][j]; 
		}
		return sum;
	}
}
