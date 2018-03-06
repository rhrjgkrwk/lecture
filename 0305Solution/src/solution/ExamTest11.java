package solution;

import java.util.Scanner;

/* [문제11] 지불된 금액에서 제품 가격 2340원을 뺀 차액을 동전으로 거스름돈을 주려고 한다.
 최소 동전의 개수로  거스름돈을 줄 수 있게 구현하시오.
 동전은 500, 100, 50, 10 원이 사용된다고 정한다.
 
 [결과 화면]
 지불된 금액이 제품 가격 보다 적을 때 -> "제품을 구매할 수 없어요"
 지불된 금액과 제품 가격이 동일할 때 -> "거스름돈이 없습니다."
 지불된 금액이 제품 가격 보다 많을 때 -> "500원 X개, 100원 X개..."
 필요없는 금액의 동전은 출력하지 않는다. 
*/
public class ExamTest11 {
	public static int arr[] = {10, 50, 100, 500};
	public static int d[][];
	public static void main(String[] args) {
		int productPrice = 2340;
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 지불해 주세요 : ");
		int money = sc.nextInt();
		System.out.print("상품의 가격 : "+productPrice);
		if (money<productPrice) {
			System.out.println("\n살 수 없다.");
		}
		else if (money==productPrice) {
			System.out.println("\n거스름돈 없다.");
		}
		else {
			System.out.println("\n거스름돈 : "+(money-productPrice));
			d = new int[4][money-productPrice+1];
			dp(money-productPrice);
			for (int i = 0; i < arr.length ; i++) {
				if (d[i][money-productPrice]!=0) System.out.println(arr[i]+"원 : "+d[i][money-productPrice]+"개");
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
			for (int i = 0; i < arr.length; i++) {//동전 리스트
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
