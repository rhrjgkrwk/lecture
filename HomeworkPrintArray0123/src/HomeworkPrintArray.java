/*
�����迭�� �ݵ�� ���� ������� 
���ڸ� ��� ���� �� �Է��� ������ ������ ���ϸ鼭 
�迭 ��� �״�� ����ϴ� ���α׷��� �ۼ��غ���

ex.
1	2	4	7	11  	1234
3	5	8	12	16 		2344
6	9	13	17	20 		3443
10	14	18	21	23	 	4432
15	19	22	24	25 		4321
~~~~
*/
public class HomeworkPrintArray {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int temp=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = temp++;				
			}
		}
		//���� �迭 ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		//���� ����� �غ��� /5 %5
		int count;
		
		for (int i = 0; i < arr.length; i++) {
			
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			int tmp = 0;
			if (arr.length>i) {
				for (int j = 0; j < arr.length; j++) {
					
				}
			}
			else {
				for (int j = 0; j < arr.length; j--) {
					
				}
			}
		}
		/*if (i+j==arr.length-1) {
			
		}*/
	}
}
