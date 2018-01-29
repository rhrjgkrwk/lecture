/*
     1   2   3   4   5   6   7    6증가
     24  25  26  27  28  29  8
     23  40  41  42  43  30  9
     22  39  48  49  44  31  10
     21  38  47  46  45  32  11
     20  37  36  35  34  33  12
     19  18  17  16  15  14  13  6증가
	6증가
*/

// 7X7 달팽이를 그려보자.
public class Dalpang {
	public static void main(String[] args) {
		int count = 1;
		int a[][] = new int[7][7];
		/*for (int i = 0; i < a.length; i++) {
			a[0][i] = count++;
		} // 첫행
*/		int i = 0;
		int j = 0;

		for (int c = 6; c > 0; ) { 
			if (i == j && i>3) {
				for (int distance = c-1; distance > 0; distance--) {
					a[i][j--] = count++;
					
				}
			} else if (i - j == 1 || (i==0&&j==0)) {
				for (int distance = c-1; distance > 0; distance--) {
					a[i][j++] = count++;
					
				}
			} else if (i + j == 6) {
				if (i>j) {
					c--;
					for (int distance = c-1; distance > 0; distance--) {
						a[i--][j] = count++;
							
					}
				}
				else if (i<j) {
					for (int distance = c-1; distance > 0; distance--) {
						a[i++][j] = count++;
						
					}
				}
			}
			
		}
		for (int j2 = 0; j2 < a.length; j2++) {
			for (int k = 0; k < a.length; k++) {
				System.out.print(a[j2][k]+"\t");
			}System.out.println();
		}
	}
}
