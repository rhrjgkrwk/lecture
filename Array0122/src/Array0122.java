import java.io.StreamCorruptedException;
import java.util.Random;

//배열을 만들어 보자. 
/* 여기서 다루는 배열은...
 * 고정길이 배열 : 늘렸다 줄였다 할 수 없엉.
 * one data type array : 한가지 자료형만 들어갈수 있는 배열이다.
 * */
public class Array0122 {
	public static void main(String[] args) {
		// int arr[];
		// arr = new int[5];

		int arr[] = new int[5];
		int[] arr1 = new int[5]; // C#은 이렇게 써야함.
		// []가 변수명 앞에 있어도 된다.

		arr[0] = 2;
		// arr[15]=3; //out of range는 실행시 오류가 체크된다.

		double[] dd = new double[5];
		dd[0] = 12.214;
		dd[1] = 21.215;
		dd[2] = 12.21;
		dd[3] = 12.21;
		dd[4] = 12.21;
		System.out.println(dd[0] + " " + dd[1]);

		// for문을 사용해서 배열을 다뤄보자!!
		for (int i = 0; i < dd.length; i++) { // 배열의 길이를 아는 속성 - length를 이용하면 배열
												// for문을 쓸때 펺다
			System.out.println(dd[i]);
		}
		System.out.println();

		// 배열을 이용하여 성적 총점과 평균을 구하는 프로그램을 만들어보자.
		// 자바, sql, jsp 점수가 있다.

		int javaJum = 31;
		int sqlJum = 100;
		int jspJum = 87;

		System.out.printf("총점 : %5d 평균 : %5.2f", javaJum + sqlJum + jspJum, (javaJum + sqlJum + jspJum) / 3.0);
		System.out.println();
		// 위의 코드를 배열을 이용해서 쉽게 바꿔보자.

		int jum[] = new int[5];
		Random r = new Random();
		for (int i = 0; i < jum.length; i++) {
			jum[i] = r.nextInt(100) + 1;
			System.out.print(jum[i] + " ");
		}
		System.out.println("\n");
		int sum = 0;
		for (int i = 0; i < jum.length; i++) {
			sum += jum[i];
		}
		System.out.printf("총점 : %d 평균 : %.2f", sum, sum / (double) jum.length);
		System.out.println("\n");

		// for와 array를 사용하여 로또 번호를 랜덤 추출해보자.
		System.out.println("Lotto 번호 추출");
		int lotto[] = new int[6];
		lotto(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

		String str[] = new String[2];
		str[1] = "DSAFADSFAD";

		// 배열을 초기화 해보자!

		int arr2[] = { 12, 13, 14, 151, 6 };
		int arr3[] = new int[] { 12, 13, 14, 151, 6, 77 };

		// a와 c를 맞바꾸어 보자. zigzag : 암호화할때 많이 쓰는 방법이라고 한다.(자리 바꾸기)
		System.out.println();
		char c[] = { 'a', 'b', 'c' };
		for (int i = 0; i < c.length; i++) { // 전
			System.out.print(c[i] + "\t");
		}

		char temp = c[0];
		c[0] = c[2];
		c[2] = temp;

		System.out.println();
		for (int i = 0; i < c.length; i++) { // 후
			System.out.print(c[i] + "\t");
		}

		// 배열을 복사해보자 ah --> ah1
		// 새로 잡아서 옮기면 된다.
		// 복사해갈 배열의 크기는 복사하려는 배열보다는 커야됨.

		int ah[] = { 30, 70 };
		int ah1[] = new int[5];
		ah1 = ah;
		// 스택메모리의 주소값이 이동됨.
		System.out.println(ah1[0]);
		System.out.println(ah1[1]);

		// 배열의 sorting을 해보자.
		//내부 정렬 : memory sort - 메모리 내부에서
			/*- raddix sort : 10번대 20번대 30번대 분류 후 각각에서 1의 자리 정렬.
			- bubble sort : 앞뒤 계속 바꿈.
			- insertion : 삽입정력
			- shell : 
			- selection sort : 선택정렬 제일 큰거 선택 맨뒤로, 이 작업을 반복.
			===여기까지는 O(n^2)===
		
			- quick sort : O(nlogn) : 기준점(중간값)잡고 큰건 뒤로 작은건 앞으로 --> 반복 & 마지막에는 버블이나 삽입정렬로 마무리. 
			
			*/
		//외부 정렬 : 보조기억장치 sort - 하드디스크나 마그네틱 테잎에서.
		
		
		
		
	}

	public static void lotto(int[] lotto) {
		Random rd = new Random(); // 둘 중 무엇을 사용해도 상관없다.
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45) + 1; // random class이용시 bound를 설정하게 된다.
											// 바운드를 10으로 설정하면 0~9까지의 수가 랜덤으로
											// 추출된다.
			// System.out.print(lotto[i]+" ");
			/*
			 * lotto[i]=(int)Math.ceil(Math.random()*45); //math를 이용할때. math함수의
			 * 경우 0~1 사이의 소수를 랜덤으로 추출하게 된다. System.out.print(lotto[i]+" ");
			 */
		}
	}
}
