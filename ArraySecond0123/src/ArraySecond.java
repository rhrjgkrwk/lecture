import java.util.Iterator;
import java.util.Random;

/*
- 배열 넘겨주기
	- int arr[] 이 있을때 arr은 배열의 첫번째 주소를 가리키므로 배열의 대표이름 arr만 넘겨주면 된다. 
	- 주소를 넘겨주기때문에 매개변수 측에서 실제 값이 저장된 공간을 공유하기 때문에 변수의 값을 읽고 변경할 수 있다.
	- 이를 call by reference라고 함
	- 
- 값 넘겨주기
	- 변수의 값만 복사해서 넘겨줌. 변경이 불가능하다.
	- call by value
	- 자바에서는 기억창고 하나의 번지만을 전달할 수는 없다. int *a 이런거 없다.
	*/
/*
- 이차원배열
	- 

*/

public class ArraySecond {
	public static void main(String[] args) {

		//최대값을 구해보자. max나 min을 활용하자.
		int a = 30;
		int b = 50;
		int c = 300;
		int max=-210000000;
		 
		if (a>b) max = a;
		else max = b;
		if (c>max) max = c;
		
		System.out.println("최대값은 "+max);

		//배열에서의 최대값을 구해보자.
		//max = arr[0]으로 초기화하고 시작하자.
		
		int arr[] = new int[10];
		Random r= new Random();
		for (int i = 0; i < arr.length; i++) { //배열 초기화
			arr[i] = r.nextInt(100);
		}
		for (int i = 0; i < arr.length; i++) { //배열 출력
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int max1 = arr[0]; //arr[0]을 max에 넣고 시작해서 [1]부터 비교
		for (int i = 1; i < arr.length; i++) { //max1을 찾자
			if (max1<arr[i]) {
				max1 = arr[i];
			}
		}
		System.out.println("최대값은 "+max1);
		
		//2차원 배열을 만들어보자.
		
		
		int [][] k = new int [2][3];
		
		// 초기화를 해보자(1)
		k[0][1] = 30;
		k[1][2] = 109;
		
		//초기화를 해보자(2)
		int k2[][] ={
				{30,200,100},  //k[0][0~2]
				{20,21,14}      //k[1][0~2]
		};
		
		//2차원 배열을 출력해보자
		//k1은 행의 대표명.
		//k1.length 층을 의미 : 행의 갯수
		//k1[i]는 열의 대표명
		//k1[i].length 열을 의미 : 열의 개수
		for (int i = 0; i < k2.length; i++) {
			for (int j = 0; j < k2[i].length; j++) {
				System.out.printf("%7d",k2[i][j]);
			}
			System.out.println();
		}
		
		
		
		//foreach문을 써보자. python의 for문이랑 비슷. ex. for i in arr: && for i in range(0,10):
		
		
		int bbb[] = {24,26,28};
		for (int i : bbb) { // bbb에서 하나씩 끄집어내서 i에 복사 & bbb마지막인덱스까지 가져온다.
			System.out.print(i+" ");
		}System.out.println();
		
		
		for (int[]aa:k2) { //2차원 배열에서 foreach를 사용하려면 행을 하나씩 분리하는 작업이 먼저다.
			for (int i:aa) { // 1차원 배열로 분리된 aa 배열을 다시 foreach로 돌린다.
				System.out.print(i+" ");
			}
		}System.out.println();
		
		//가변 배열에 대해 알아보자. jagged(삐쭉뺴쭉, 톱니바퀴 모양의) array
		
		int aaaa[][] = new int [20][];
		aaaa[0] = new int[3];//1차원
		aaaa[1] = new int[5];//1차원
		//1차원 배열들을 배열에 넣는 원리.
		
		for (int i = 0; i < aaaa.length; i++) {
			aaaa[i] = new int[i+1];
		}
		
		aaaa[0][0] = 100;
		
		/*aaaa[0] = new int[1];
		aaaa[1] = new int[2];
		aaaa[2] = new int[3];*/
		
		for (int i[] : aaaa) { //FOREACH 많이 써보자.
			for (int j : i) {
				System.out.printf("%2d",j);
			}System.out.println();
		}		
	}
}


