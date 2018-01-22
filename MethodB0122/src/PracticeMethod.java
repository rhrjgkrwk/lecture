import java.util.Scanner;

//method를 이용해 윤년을 찍어보자.

public class PracticeMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("type year that you wanna know if it is leapyear ");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println(leapyear(year));
		leapyear2(year);
		
		sc.close();
	}
	public static String leapyear(int year){
		String result;
		if (year%4==0&&year%100!=0||year%400==0) {
			result = year+"년은 윤년입니다.";
		}
		else {
			result = year+"년은 평년입니다.";
		}
		return result;
	}
	public static void leapyear2(int year){
		if (year%4==0&&year%100!=0||year%400==0) {
			System.out.println(year+"년은 윤년입니다.");
		}
		else {
			System.out.println(year+"년은 평년입니다.");
		}
	}
}
