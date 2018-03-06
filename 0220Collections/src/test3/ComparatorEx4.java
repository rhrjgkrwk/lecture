package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx4 {
	//sort에 들어가는 comparator를 분리하여 구현해보자.!
	public static Comparator<Soccer> myComparator = new Comparator<Soccer>(){
		@Override
		public int compare(Soccer o1, Soccer o2) {
			if (o1.getAge()==o2.getAge()) {
				return o1.getPosition().compareTo(o2.getPosition());
			}
			return o1.getAge()-o2.getAge(); 
		}//나이 오름차순 & 나이가 같으면 포지션 오름차순
	};
	public static void main(String[] args) {
		ArrayList<Soccer> playerList= new ArrayList<Soccer>();
		Soccer player1=new Soccer("메시","공격수",20);
		Soccer player2=new Soccer("호날두","공격수",19);
		Soccer player3=new Soccer("박지성","미드필더",25);
		Soccer player4=new Soccer("오스카","미드필더",22);
		Soccer player5=new Soccer("기안84","공격수",22);
		
		playerList.add(player1);    
		playerList.add(player2);
		playerList.add(player3);
		playerList.add(player4);
		playerList.add(player5);
	
		Collections.sort(playerList, myComparator); 
		//sort 메서드 사용시 위 처럼 분리하여 사용할 수도 있다.
		for (Soccer s : playerList) {
			System.out.println(s);
		}
	}
}
