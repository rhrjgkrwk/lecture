package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
[����6] 2�ڸ��� ������ �߻��Ͽ� �߻��� ���ڸ� ���ߴ� ���� ���α׷�
 �����߻�) 
1. int a=(int)(Math.random()*100) : 0 - 99 ������ ����
2. �� import java.util.Random;
       �� Random ����1 = new Random();
       �� int ����2 = ����1.nextInt(�ִ밪); 
                0 ~ (�ִ밪 - 1)������ ������ ��

[��� ȭ��]
*** ������ �߻��Ͽ����ϴ�...���߾� ������...*** 

���� �Է� : 50
��ǻ���� ���ڰ� �� Ů�ϴ�..

���� �Է� : 90
��ǻ���� ���ڰ� �� �۽��ϴ�..

          :

���� �Է� : 83
��ī��ī...xx������ ���߼̽��ϴ�...

�ٽ��ұ��(y/n) : n
** �����մϴ� **
*/
public class ExamTest06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int com, num;   // �����߻�(��ǻ��), ������Է¼�
		char sign;         // �ٽ����� ����
		
		do{
			int cnt=0;   // �õ� Ƚ��
			com=(int)(Math.random()*90)+10;
			System.out.println("��ǻ�� ��:"+com);
			System.out.println("*** ������ �߻��Ͽ����ϴ�...���߾� ������...***");
			
			do{
				System.out.print("���� �Է� : ");
				num=sc.nextInt();
				
				if(com > num){
					cnt++;
					System.out.println("ũ��");
				}else if( com <num){
					cnt++;
					System.out.println("�۴�");
				}else{
					cnt++;
					break;
				}
			}while(num != com);
			System.out.println("��ī��ī!!" + cnt + "�� ���� ������ϴ�.");
			//----------------------------------------------------------------------
			System.out.print("�ٽ� �ұ��(y/n) : ");
			sign=sc.next().charAt(0);
		}while(sign=='y'|| sign=='Y');
		System.out.println("** �����մϴ� **");
		sc.close();
	}
}






