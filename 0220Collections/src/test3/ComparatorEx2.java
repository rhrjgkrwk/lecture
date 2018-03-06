package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx2 {
	public static void main(String[] args) {
		ArrayList<Soccer> playerList= new ArrayList<Soccer>();
		Soccer player1=new Soccer("�޽�","���ݼ�",20);
		Soccer player2=new Soccer("ȣ����","���ݼ�",19);
		Soccer player3=new Soccer("������","�̵��ʴ�",25);
		Soccer player4=new Soccer("����ī","�̵��ʴ�",23);
		Soccer player5=new Soccer("���84","���ݼ�",22);
		
		playerList.add(player1);
		playerList.add(player2);
		playerList.add(player3);
		playerList.add(player4);
		playerList.add(player5);
	
		Collections.sort(playerList, new Comparator<Soccer>() {
			@Override
			public int compare(Soccer o1, Soccer o2) {
				return o1.compareTo(o2); 
			}
		});
		for (Soccer s : playerList) {
			System.out.println(s);
		}
	}
}
