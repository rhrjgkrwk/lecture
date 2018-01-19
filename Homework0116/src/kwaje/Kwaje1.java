package kwaje;

import java.util.Scanner;

/*
이창희!

학생의 학번(문자), 이름, 자바 점수, 알고리즘 점수, SPRING점수를 입력받아 
학번 이름 점수3 총점 평균을 인쇄하는 자바프로그램을 작성하시오.abstract
단, 3명을 연속받아 차례로 출력하며 자리수가 잘 맞추어지도록 printf를 사용하며
평균은 소수이하 2자리까지 계산
*/

/*
 * 
A31435 이윤진 100 30 70
A34132 송해민 30 100 90
A34543 조우정 90 100 80
 *
*/


public class Kwaje1 {
	public static void main(String[] args) {
		
		String num, name;
		int javaScore, algoScore, springScore;
		String num1, name1;
		int javaScore1, algoScore1, springScore1;
		String num2, name2;
		int javaScore2, algoScore2, springScore2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 사람의 정보를 입력하세요. (학번 이름 java점수 알고리즘점수 스프링점수)");
		num = sc.next();
		name = sc.next();
		javaScore = sc.nextInt();
		algoScore = sc.nextInt();
		springScore = sc.nextInt();
		
		System.out.println("두번째 사람의 정보를 입력하세요. (학번 이름 java점수 알고리즘점수 스프링점수)");
		num1 = sc.next();
		name1 = sc.next();
		javaScore1 = sc.nextInt();
		algoScore1 = sc.nextInt();
		springScore1 = sc.nextInt();
		
		System.out.println("세번째 사람의 정보를 입력하세요. (학번 이름 java점수 알고리즘점수 스프링점수)");
		num2 = sc.next();
		name2 = sc.next();
		javaScore2 = sc.nextInt();
		algoScore2 = sc.nextInt();
		springScore2 = sc.nextInt();
		
		 
		System.out.println("                                                      『우리반 성적표』");
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("%10s\t%10s\t%12s\t%12s%18s\t%8s\t%12s\n", "학번", "이름", "자바", "알고리즘", "스프링", "총점","평균");
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("%-10s%-10s%10d%10d%10d%10d%10.2f\n",num, name, javaScore, algoScore, springScore, 
				javaScore+algoScore+springScore,(float)((javaScore+algoScore+springScore)/3)); //first
		System.out.printf("%-10s%-10s%10d%10d%10d%10d%10.2f\n",num1, name1, javaScore1, algoScore1, springScore1, 
				javaScore1+algoScore1+springScore1,(float)(javaScore1+algoScore1+springScore1)/3); //second
		System.out.printf("%-10s%-10s%10d%10d%10d%10d%10.2f\n",num2, name2, javaScore2, algoScore2, springScore2, 
				javaScore2+algoScore2+springScore2,(float)(javaScore2+algoScore2+springScore2)/3); //last
		System.out.println("---------------------------------------------------------------------");
		sc.close();
	}
}
