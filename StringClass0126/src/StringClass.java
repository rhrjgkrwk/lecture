import java.util.Scanner;

/*
스트링클래스를 좀 더 알아보자.
*/

public class StringClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String s1 = sc.nextLine();
		System.out.print("PW : ");
		String s2 = sc.nextLine();

		// String compareTo를 사용해보자2

		if (s1.compareTo("rhrjgkrwk") == 0 && s2.compareTo("dlckdgml") == 0) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("ㅠㅠ틀렸습니다.");
		}
		System.out.println("아무거나 쳐보세요.");
		String s3 = "Gazua";
		String s4 = sc.nextLine();
		if (s3.indexOf(s4) > -1) {
			System.out.println(s3.indexOf(s4)+"번째 발견");
		} else
			System.out.println("없구먼유");
		/*
		문자열 배열을 잡아 
		책 세권을 넣는다. 
		그리고 java가 들어간 책을 검색&출력
		*/
		
		String [] books = {
				"easy java", 
				"java ragonahalka",
				"Ok java",
				"Maerong"
		};
		
		for (int i = 0; i < books.length; i++) {
			if (books[i].indexOf("java")!=-1) {
				System.out.println(books[i]);
			}
		}
		System.out.println("검색 종료");
		
		
		//split,이라는 메서드를 사용해보자.
		
		String s5 = "ds, sda,fdf ,dsf,ds,fd,asd,fasd,fas";
		String s6[] = s5.split(","); //String 을 token으로 자르자.
		for (int s = 0; s < s6.length; s++) {
			System.out.print(s6[s]+"\t");
		}
		System.out.println();
		//startWith을 사용해보자.
		
		if (s5.startsWith("ds")) { //"ds"로 시작하니?
			System.out.println("호오");
		}
		else {
			System.out.println("없졍");
		}
		
		//substring을 써서 전광판을 만들어보자.
		
		String s7 = "                       chang hee lee";
		System.out.println(s7.substring(0,2));
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < s7.length(); i++) {
				if (i==0) System.out.println(s7);
				else System.out.println(s7.substring(i)+" "+s7.substring(0,i));
			}			
		}
		System.out.println();
		
		
		//UPpercase & lowercase
		System.out.println(s7.toUpperCase()+s7.toUpperCase().toLowerCase());
		
		
		sc.close();
	}
}
