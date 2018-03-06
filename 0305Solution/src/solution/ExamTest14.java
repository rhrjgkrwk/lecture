package solution;

import java.util.Arrays;

/* [문제14]
성적처리프로그램을 작성하시오

==================================================
번호    이름      국어    영어    수학    총점    평균    학점    재수강    순위
----------------------------------------------------------------------------------
   1      진달래     90       95       100
   2      개나리     75       55        65
   3      민들래     100     100       100
----------------------------------------------------------------------------------

처리조건
조건1) 변수
     String []name ={"진달래","개나리","민들래"};
     int [][]score = {{90,95,100,0},{75,55,65,0},{100,100,100,0}};
     double []avg = {0.0, 0.0, 0.0};
     char []grade = new char[3];
     String []pass = new String[3];
     int []rank ={1,1,1};

조건2) 총점 = 국어 + 영어 + 수학
       평균 = 총점/3;
       학점 = 90이상 'A' / 80이상 'B' / 70이상 'C' / 60이상 'D' / 나머지는 'F'
               (if ~ else if문 이용)
       재수강 = 60이상이면 "pass"  60미만이면 "fail"
               (if~else문)
       순위구하기    

 */
public class ExamTest14 {
	public static void main(String[] args) {
		String []name ={"진달래","개나리","민들래"};
	     int [][]score = {{90,95,100,0},{75,55,65,0},{100,100,100,0}};
	     double []avg = {0.0, 0.0, 0.0};
	     char []grade = new char[3];
	     String []pass = new String[3];
	     int []rank ={1,1,1};
	
		for (int i = 0; i < name.length; i++) {
			int tot = 0;
			//tot, avg
			for (int j = 0; j < score[i].length; j++) {
				if (j<3) {
					tot += score[i][j];
				}
				else if(j==3){
					score[i][j] = tot;
					avg[i] = tot/3.0;
				}
			}
			//grade & pass/fail
			if (avg[i] >= 60) {
				if (avg[i] >= 90) grade[i] = 'A';
				else if (avg[i] >= 80) grade[i] = 'B';
				else if (avg[i] >= 70) grade[i] = 'C';
				else grade[i] = 'D';
				pass[i] = "pass";
			}
			else {
				grade[i] = 'F';
				pass[i] = "fail";
			}
		}
		//순위
		double []tmp = avg.clone();
		Arrays.sort(tmp);
		for (int i = 0; i < avg.length; i++) {
			for (int j = 0; j < tmp.length; j++) {
				if (avg[i]==tmp[j]) {
					rank[i] = j+1;
				}
			}
		}
		System.out.println("==================================================");
		System.out.println("번호    이름      국어    영어    수학    총점    평균    학점    재수강    순위");
		System.out.println("----------------------------------------------------------------------------------");
		for (int i = 0; i < tmp.length; i++) {
			System.out.print((i+1)+"\t"+name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(avg[i]+"\t"+grade[i]+"\t"+pass[i]+"\t"+rank[i]);
		}
		System.out.println("----------------------------------------------------------------------------------");
	}
}
