import java.time.Clock;
import java.util.Scanner; 
/*다른 패키지에 있는 클래스를 가져다 쓸때 쓰눈 키워드.

*/
public class ScannerProject { //User defined class 
	public static void main(String[] args) {
		/*
		입출력 : 1. 키보드 2. 파일 3. winform
		Scanner 내장클래스
		*/		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 주세여 : ");
		int a = sc.nextInt(); //객체.메소드
		System.out.println("값은  "+a);
		
		System.out.print("문자 주세여 : ");
		String s = sc.next();
		sc.close();
	}
}
