package solution;

/* [문제2]성적처리프로그램
        중간고사,기말고사,레포트,출석점수를 args로 입력받아서 계산하시오
        
조건1) (중간+기말)/2   ---> 60%
          과제                          ---> 20%
          출석                           ---> 20%
     
조건2)90이상 'A'학점     (3)A,B학점  ---->"excellent"
     80이상 'B'학점        C,D학점  ---->"good"
     70이상 'C'학점        F학점    ---->"poor"
     60이상 'D'학점        (switch문이용) 
           나머지 'F'학점
     (if~else if문이용)

$ java ExamTest02  90 89 99 100  

[결과 화면]
중간고사 : 90
기말고사 : 89
과제점수 : 99
출석점수: 100

성적=93.20      <---소수이하 2째자리까지
학점=A              
평가=excellent
*/
public class ExamTest02 {
	public static void main(String[] args){
		int mi=Integer.parseInt(args[0]);
		int la=Integer.parseInt(args[1]);
		int re=Integer.parseInt(args[2]);
		int cul=Integer.parseInt(args[3]);
		
		double score=0;    // 성적
		char grade='\0';    //학점
		String result=null;  // 평가

		score=((mi+la)/2)*0.6 + (re*0.2) + (cul*0.2);
		
		if(score>=90)			grade='A';
		else if(score>=80)	grade='B';
		else if(score>=70)	grade='C';
		else if(score>=60)	grade='D';
		else						grade='F';
		
		switch(grade){
			case 'A': case 'B': result="excellent"; break;
			case 'C': case 'D': result="excellent"; break;
			default:				 result="poor";
		}
		
		System.out.printf("성적 : %.2f\n",score);
		System.out.println("학점 : " + grade);
		System.out.println("평가 : " + result);
		
	}
}





