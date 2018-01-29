/*
3X3 마방진을 만들어보자.
홀숱X홀수 마방진도 가능?

*/
public class Mabangjin {
	public static void main(String[] args) {
		
		int[][] mbj = new int[3][3];
		int i = 0;
		int j = 1;
		mbj[i][j] = 1;
		for (int count = 2; count < 10; count++) {
			if (count%mbj.length==1) {
				i++;
			}
			else {
				if (i-1<0) {
					i+=2;
				}
				else{
					i--;
				}
				if (j+1>mbj.length-1) {
					j-=2;
				}
				else {
					j++;
				}
			}
			mbj[i][j]=count;
		}
		for (int m = 0; m < mbj.length; m++) {
			for (int n = 0; n < mbj.length; n++) {
				System.out.print(mbj[m][n]+"\t");
			}System.out.println();
		}
	}
}
