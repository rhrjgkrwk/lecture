package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
[문제6] 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램
 난수발생) 
1. int a=(int)(Math.random()*100) : 0 - 99 사이의 난수
2. ① import java.util.Random;
       ② Random 변수1 = new Random();
       ③ int 변수2 = 변수1.nextInt(최대값); 
                0 ~ (최대값 - 1)사이의 임의의 수

[결과 화면]
*** 난수가 발생하였습니다...맞추어 보세요...*** 

숫자 입력 : 50
컴퓨터의 숫자가 더 큽니다..

숫자 입력 : 90
컴퓨터의 숫자가 더 작습니다..

          :

숫자 입력 : 83
추카추카...xx번만에 맞추셨습니다...

다시할까요(y/n) : n
** 종료합니다 **
*/
public class ExamTest06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int com, num;   // 난수발생(컴퓨터), 사용자입력수
		char sign;         // 다시할지 여부
		
		do{
			int cnt=0;   // 시도 횟수
			com=(int)(Math.random()*90)+10;
			System.out.println("컴퓨터 수:"+com);
			System.out.println("*** 난수가 발생하였습니다...맞추어 보세요...***");
			
			do{
				System.out.print("숫자 입력 : ");
				num=sc.nextInt();
				
				if(com > num){
					cnt++;
					System.out.println("크다");
				}else if( com <num){
					cnt++;
					System.out.println("작다");
				}else{
					cnt++;
					break;
				}
			}while(num != com);
			System.out.println("추카추카!!" + cnt + "번 만에 맞췄습니다.");
			//----------------------------------------------------------------------
			System.out.print("다시 할까요(y/n) : ");
			sign=sc.next().charAt(0);
		}while(sign=='y'|| sign=='Y');
		System.out.println("** 종료합니다 **");
		sc.close();
	}
}






