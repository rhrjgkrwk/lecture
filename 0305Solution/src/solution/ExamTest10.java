package solution;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/*[문제10] 가위, 바위, 보 게임
컴퓨터가(com) 난수 1~3중 하나를 발생하고 가위(1), 바위(2), 보(3)로 사용한다
사용자가(user) 1~3중 입력하여 승패를 결정한다

[실행결과]
가위(1), 바위(2), 보(3) 입력 : 2

컴퓨터 : 보         사용자 : 가위     결과 : You Win!!

컴퓨터 : 가위     사용자 : 보         결과 : You Lose!!

컴퓨터 : 바위     사용자 : 바위     결과 : You Draw!!

*/

public class ExamTest10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int randNum = (int)(Math.random()*3) + 1;
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "가위");
		map.put(2, "바위");
		map.put(3, "보");
		
		System.out.print("가위(1), 바위(2), 보(3) 입력 : ");
		Scanner sc = new Scanner(System.in);
		int userNum = sc.nextInt();
		
		System.out.print("컴퓨터 : " + map.get(randNum) + "\t사용자 : " + map.get(userNum));
		if((userNum == 1 && randNum == 3) || randNum < userNum)
			System.out.println("\t결과 : You Win!!");
		else if(randNum == userNum)
			System.out.println("\t결과 : You Draw!!");
		else if((userNum == 3 && randNum == 1) || randNum > userNum)
			System.out.println("\t결과 : You Lose!!");
	}
}

//------------------------------------------------------------------
/*
public class ExamTest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*3+1);
		String coms = null;
		String users = null;
		
		System.out.print("가위(1), 바위(2), 보(3) 입력 :");	
		int user = sc.nextInt();
		
		if(com==1)			 coms = "가위";  
		else if(com==2)	 coms = "바위";   
		else					 coms = "보";
		System.out.print("컴퓨터 : "+coms);
		
		if(user==1)			users = "가위";
		else if(user==2)	users = "바위";
		else					users = "보";
		System.out.print("\t사용자 : "+users);
		
		if((com==1&&user==2)||(com==2&&user==3)
				   ||(com==3&&user==1))
			System.out.print("\t결과 : You Win!!!");
		else if((com==1&&user==3)||(com==2&&user==1)
				   ||(com==3&&user==2))
			System.out.print("\t결과 : You Lose!!");		
		else
			System.out.print("\t결과 : You Draw!!");		
		sc.close();
	}
}
*/
