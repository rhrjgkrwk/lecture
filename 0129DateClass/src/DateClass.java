import java.text.SimpleDateFormat;
import java.util.*;

/*
내장 객체 : 
		1. 클래스만 안만드는 것. ex. Date
		2. 클래스, new 안만드는 것. 
			ex. 웹에서 window.location = "https://www.naver.com"
*/
public class DateClass {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toLocaleString());
		Date d1 = new Date(1249015992215L);
		// date - the milliseconds since January 1, 1970, 00:00:00 GMT.
		// 1970년을 기준으로 1249015915L 밀리세컨드 만큼 떨어진 날이 언제인지 알 수 있따.
		System.out.println(d1.toLocaleString());

		Date d2 = new Date();
		int year = d2.getYear() + 1900; // 윈도우 레벨에서는 1900을 더해줘야한다.
		int month = d2.getMonth() + 1; // C언어를 만든 데니스 리치가 1-12월을 0-11월로 만들어놔서
										// 그렇다.
		int day = d2.getDate(); //
		System.out.println("");
		System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");

		// 만난지 100일을 구해보자.
		d2.setDate(d2.getDate() + 100 - 1);
		int year1 = d2.getYear() + 1900; //
		int month1 = d2.getMonth() + 1; //
		int day1 = d2.getDate(); //
		System.out.println("만난지 100일 되는 날은");
		System.out.println(year1 + "년 " + month1 + "월 " + day1 + "일 입니다.");

		// 생일을 입력하면 살아온 날을 알려주는 프로그램을 만들어보자.

		Date birth = new Date(1992 - 1900, 12 - 1, 25); // 생성시에는 -1900, -1을
														// 해야한다.
		Date today = new Date();
		long gap = today.getTime() - birth.getTime();
		System.out.println((birth.getYear() + 1900) + "년 " + (birth.getMonth() + 1) + "월 " + birth.getDate()
				+ "일 기준 살아온 날은 " + gap / 1000 / 3600 / 24 + "일 입니다.");

		// SimpleDateFormat sd = new SimpleDateFormat();

		/*
		 * 캘린더 클라스를 사용해보자! 캘린더 클래스는 Date 클래스를
		 */

		Calendar c = Calendar.getInstance(); // new를 사용하지 않는다.
		int year2 = c.get(Calendar.YEAR);
		int month2 = c.get(Calendar.MONTH) + 1; // 0-11 : 1을 더해줘야한다.
		int date2 = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		System.out.println("현재 시간");
		System.out.println(year2 + "년" + month2 + "월" + date2 + "일" + hour + "시" + minute + "분" + second + "초");

		// Calendar를 사용하여 생일을 입력하면 살아온 날을 알려주는 프로그램을 만들어보자.

		Calendar birth1 = Calendar.getInstance();
		birth1.set(1992, Calendar.DECEMBER, 25,0,0,0);
		long gap1 = today.getTime()-birth.getTime();
		System.out.println("살아온 날은 " + gap1 / 1000 / 3600 / 24 + "일 입니다.");
	
		//SimpleDateFormat을 써보자/!
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 kk시 mm분 ss초"); //포맷을 지정하여
		System.out.println(sdf.format(birth1.getTime())); 	//포맷에 맞게 찍는다. 
		//format 메소드의 인자는 Date객체 또는 long(ms)이다. Calendar로 하려면 getTime으로 넘겨주자.
		System.out.println(sdf.format(today));
		
		
		
		
		
		
		
		
		
		
	
	}
}
