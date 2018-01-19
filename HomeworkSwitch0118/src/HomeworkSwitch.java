import java.util.Scanner;

/*스위치문의 이상한 성격을 역이용하여 
 * 매달의 날짜수를 출력하시오.
 * (단, 12번 물어보는 것은 가능하나 
 * 출력관계 작업은 3번해야한다.)
 * 1,3,5,7,8,10,12 - 31일 / 나머지 30일 / 2월 - 28
 * */
public class HomeworkSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		int month = Integer.parseInt(sc.nextLine());
		int days = 0;
		if (0 < month && month <= 12) {
			switch (month) {
			case 1:	case 3:
			case 5:	case 7:
			case 8:	case 10:
			case 12:
				days = 31;
				break;
			case 4:	case 6:
			case 9:	case 11:
				days = 30;
				break;
			case 2:
				days = 28;
				break;
			}
			System.out.println(month + "월은 " + days + "일까지 있습니다.");
		}
		else System.out.println("1~12월을 입력해주세여.");
		sc.close();
	}
}
