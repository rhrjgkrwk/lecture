package com.ranomchatbot.my;

import java.util.Random;
import java.util.Scanner;

/*
 * 0117
 * ����2 : ���ڿ� "yes","no","wait a minute"�� �غ��س��� �����Է½� ���Ƿ� �����Ͽ� �亯�ϴ� �ڹ����α׷��� �ۼ��Ͻÿ�.
 */
public class RandomChatbot {
	public static void main(String[] args) {
		//ans list
		String ans1 = "Yes";
		String ans2 = "No";
		String ans3 = "Wait a minute";
		boolean flag = true;
		
		//input
		Scanner sc = new Scanner(System.in);
		
		while(flag){
		System.out.print("input : ");
		String a=sc.nextLine();
		flag = a.equals("x")?false:true;
				
		//random number
		Random rd = new Random();
		int r = rd.nextInt(3)+1; // 1-3 ���� ����
		
		//print
		System.out.println(r==1?ans1:r==2?ans2:ans3);
		}
		sc.close();
	}
}
