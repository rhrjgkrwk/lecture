import java.util.Scanner;

public class Yingka {
	public static void main(String[] args) {
		int T;
		int M=0,N=0,x=0,y=0;
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			boolean flag = true;
			int x1=1,y1=1;
			int count = 1;
			
			M = sc.nextInt();
			N = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (M%2==0&&N%2==0) {
				if (x%2!=y%2) {
					System.out.println(-1);
					flag = false;
				}
			}
			
			while(flag){
				if(x1==x&&y1==y){
					System.out.println(count);
					flag = false;
				}
				
				else{
					if (x1<M) x1++;
					else x1 = 1;
					if (y1<N) y1++;
					else y1 = 1;
				}
				count++;
			}
		}
	sc.close();	
	}
	
}
