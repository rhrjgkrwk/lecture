package solution;

/*[문제3]50개의 난수를 만들어서 다음과 같이 출력하시오
   조건1) 30 - 75 사이의 수 일것
   조건2) 1줄에 6개씩 표시하시오  
   
[결과 화면]   
68		50		67		38		49		42	
31		62		44		43		45		60	
35		48		59		31		49		37	
54		45		73		36		40		37	
75		41		68		65		67		53	
44		33		37		60		74		51	
54		45		58		64		40		48	
73		32		45		39		39		75	
47		56	
합 = 2526
*/
public class ExamTest03 {
	public static void main(String[] args) {
		int sum=0, num=0;    //누적변수, 난수를 저장할 변수
		
		for(int i=1; i<=50; i++){
			num=(int)(Math.random()*46)+30;
			System.out.print(num +"\t");
			sum += num;
			
			if(i%6==0){
				System.out.println();
			}
		}		
		System.out.println("\n합 = " + sum);
	}
}
/*
Math.random()   					// 0 ~ 0.999999
Math.random()*100  			// 0 ~ 99.9999
(int)(Math.random()*100)  	// 0~99
(int)(Math.random()*100)+1 	// 1~100 

// 65~80사이의 난수
System.out.println((int)(Math.random()*16)+65);
                   0 ~ 0.99999
                   0 ~ 15.9999
                   0 ~ 15
                   65 ~ 80
 */





