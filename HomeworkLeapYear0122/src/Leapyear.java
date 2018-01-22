import java.util.Scanner;

/*
0122 숙줴
문자열 5개를 준비한 후 년도를 입력받아
윤년이면 오름차순 출력, 평년이면 내리차순으로 출력한다. 
메소드 형식을 사용하자
*/

public class Leapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = {"sajdkf","qwe","pippi","zddd","pippi2"};
			//{"str","str1","str2","str3","str"};
			//{ "lee", "chang", "hee", "boab", "zac" };
		
		System.out.print("년도를 입력해보자 : ");
		int year = Integer.parseInt(sc.nextLine());
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {// 윤년이면 오름차순
			System.out.println("윤년입니다. 문자열이 오름차순으로 정렬됩니다.");
			ascendingSort(s);
		} else { // 평년이면 내림차순
			System.out.println("평년입니다. 문자열이 내림차순으로 정렬됩니다.");
			dscendingSort(s);
		}

		// 출력을 해보자

		for (int i = 0; i < s.length; i++) {
			System.out.printf("%5s\t", s[i]);
		}
	}

	public static void ascendingSort(String s[]) {// 오름차순 정렬을 해보자.
		for (int i = 0; i < s.length - 1; i++) {
			
			for (int j = i + 1; j < s.length; j++) {
				int i1 = 0, j1 = 0; // string compare를 해보자.
				boolean flag = true;
				while (flag) {
					if (i1 == s[i].length() - 1 || j1 == s[j].length() - 1) { 
						//어느 한쪽이라도 끝까지 비교를 했을 때 결과가 나오지 않았다면
						if (s[i].length() <= s[j].length()) { //아예 같거나 j가 더 길면 그냥 냅둔다.
							flag = false;
						} else { //i가 더 크면 Swap
							String temp = s[i];
							s[i] = s[j];
							s[j] = temp;
							flag = false;
						}
					}

					if (s[i].charAt(i1) > s[j].charAt(j1)) { // s[i]가 알파벳 상 늦은
																// 순서이면 s[j]랑
																// 바꾸자.
						String temp = s[i];
						s[i] = s[j];
						s[j] = temp;
						flag = false; // 비교 결과가 나오면 out
					} 
					else if (s[i].charAt(i1) == s[j].charAt(j1)) { // 해당 문자가 같으면 다음문자 비교
						if (i1 < s[i].length() - 1) {
							i1++;
						}
						if (j1 < s[j].length() - 1) {
							j1++;
						}
					} 
					else { // s[j]가 앞바벳상 늦으므로 걍 두고 while loop를 빠져나온다.
						flag = false;
					}

				}
			}
		}
	}

	public static void dscendingSort(String s[]) {// 내림
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				boolean flag = true;
				int i1 = 0, j1 = 0; // string compare를 해보자.
				while (flag) {					
					//어느 한쪽이라도 끝까지 비교를 했을 때 결과가 나오지 않으면 
					if (i1 == s[i].length() - 1 || j1 == s[j].length() - 1) {
						if (s[i].length() >= s[j].length()) { //i,j의 길이가 같거나 i가 더 길때 그냥 냅둔다.
							flag = false; 
						} else { // j가 더 길면 swap
							String temp = s[i];
							s[i] = s[j];
							s[j] = temp;
							flag = false; 
						}
					}

					if (s[i].charAt(i1) < s[j].charAt(j1)) { // s[i]가 알파벳 상 늦은
																// 순서이면 s[j]랑
																// 바꾸자.
						String temp = s[i];
						s[i] = s[j];
						s[j] = temp;
						flag = false; // 비교 결과가 나오면 out
					} else if (s[i].charAt(i1) == s[j].charAt(j1)) { // 해당 문자가
																		// 같으면
																		// 다음
																		// 문자를
																		// 비교.
						if (i1 < s[i].length() - 1) {
							i1++;
						}
						if (j1 < s[j].length() - 1) {
							j1++;
						}
					} else { // s[j]가 앞바벳상 늦으므로 걍 두고 while loop를 빠져나온다.
						flag = false;
					}

				}
			}
		}
	}

}
