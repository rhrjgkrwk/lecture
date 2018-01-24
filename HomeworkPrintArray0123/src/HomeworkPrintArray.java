/*
정수배열에 반드시 숫자 순서대로 
숫자를 모두 넣은 후 입력이 끝나면 열부터 변하면서 
배열 모양 그대로 출력하는 프로그램을 작성해보자

ex.
1	2	4	7	11  	1234
3	5	8	12	16 		2344
6	9	13	17	20 		3443
10	14	18	21	23	 	4432
15	19	22	24	25 		4321

(hint)

(0,0)	(0,1)	(0,2)	(0,3)	(0,4)	(1,4)	(2,4)	(3,4)	(4,4)
		(1,0)	(1,1)	(1,2)	(1,3)	(2,3)	(3,3)	(4,3)
				(2,0)	(2,1)	(2,2)	(3,2)	(4,2)
						(3,0)	(3,1)	(4,1)
								(4,0)

*/
public class HomeworkPrintArray {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int temp=1;
	
		for (int k = 0; k < arr.length; k++) { //0-4묶음
			for (int i = 0, j=k; i <= k; i++,j--) { //i는 올라가는, j는 감소하는.
				arr[i][j] = temp;
				temp++;
			}
		}
		
		for (int k = 1; k < arr.length; k++) {
			for (int i = k,j=arr.length-1; i < arr.length; i++,j--) {
				arr[i][j] = temp;
				temp++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
		
	}
}
