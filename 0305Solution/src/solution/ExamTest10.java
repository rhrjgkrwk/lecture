package solution;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/*[����10] ����, ����, �� ����
��ǻ�Ͱ�(com) ���� 1~3�� �ϳ��� �߻��ϰ� ����(1), ����(2), ��(3)�� ����Ѵ�
����ڰ�(user) 1~3�� �Է��Ͽ� ���и� �����Ѵ�

[������]
����(1), ����(2), ��(3) �Է� : 2

��ǻ�� : ��         ����� : ����     ��� : You Win!!

��ǻ�� : ����     ����� : ��         ��� : You Lose!!

��ǻ�� : ����     ����� : ����     ��� : You Draw!!

*/

public class ExamTest10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int randNum = (int)(Math.random()*3) + 1;
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "����");
		map.put(2, "����");
		map.put(3, "��");
		
		System.out.print("����(1), ����(2), ��(3) �Է� : ");
		Scanner sc = new Scanner(System.in);
		int userNum = sc.nextInt();
		
		System.out.print("��ǻ�� : " + map.get(randNum) + "\t����� : " + map.get(userNum));
		if((userNum == 1 && randNum == 3) || randNum < userNum)
			System.out.println("\t��� : You Win!!");
		else if(randNum == userNum)
			System.out.println("\t��� : You Draw!!");
		else if((userNum == 3 && randNum == 1) || randNum > userNum)
			System.out.println("\t��� : You Lose!!");
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
		
		System.out.print("����(1), ����(2), ��(3) �Է� :");	
		int user = sc.nextInt();
		
		if(com==1)			 coms = "����";  
		else if(com==2)	 coms = "����";   
		else					 coms = "��";
		System.out.print("��ǻ�� : "+coms);
		
		if(user==1)			users = "����";
		else if(user==2)	users = "����";
		else					users = "��";
		System.out.print("\t����� : "+users);
		
		if((com==1&&user==2)||(com==2&&user==3)
				   ||(com==3&&user==1))
			System.out.print("\t��� : You Win!!!");
		else if((com==1&&user==3)||(com==2&&user==1)
				   ||(com==3&&user==2))
			System.out.print("\t��� : You Lose!!");		
		else
			System.out.print("\t��� : You Draw!!");		
		sc.close();
	}
}
*/
