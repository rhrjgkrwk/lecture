import java.util.Scanner;

/*시간을 초로 입력받아 
 * "00시간00분00초"로 
 * 출력하는 프로그램을 짜보자
 * 단 시간이 0시간이거나 0분이면 찍지말자
*/
public class HomeworkClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		int sec = Integer.parseInt(sc.nextLine());
		//int hour, minute;
		int hour = sec/3600;
		int minute = (sec/60)%60;
		sec %= 60;
				
		if (hour!=0) {
			System.out.printf("%02d시%02d분%02d초",hour, minute, sec);//시분초
		}
		else{
			if (minute==0) {
				System.out.printf("%02d분%02d초",minute, sec);//분초만
			}
			else {
				System.out.printf("%02d초",sec);//초만				
			}
		}
		sc.close();
	}
}
