import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class RoundTest {
	public static void main(String[] args) {
		double pi = 3.141592;
		//그냥 round 하면 소수첫째자리에서 반올림. 따라서 원하는 소수 자릿수 만큼 곱했다가 다시 나누는 작업을 함.
		System.out.println(Math.round(pi*10000)/10000.0);
		System.out.println(Math.round(pi*1000)/1000.0);
		System.out.println(Math.round(pi*100)/100.0);
		System.out.println(Math.round(pi*10)/10.0);
		
		
		/*****************Random class**************/
		
		Random rd = new Random();
		int num = rd.nextInt(45)+1; //(45) = 0~44 중 하나의 숫자  /  +1이므로 1~45
		
		
		int num1 = rd.nextInt(45)+1;
		int num2 = rd.nextInt(45)+1;
		int num3 = rd.nextInt(45)+1;
		int num4 = rd.nextInt(45)+1;
		int num5 = rd.nextInt(45)+1;
		int num6 = rd.nextInt(45)+1;
		System.out.printf("%d %d %d %d %d %d\n",num1,num2,num3,num4,num5,num6);
		
		char c = (char)(rd.nextInt(26)+65);
		System.out.println(c);
		
		
		/**************Math.random()***********/
		
		System.out.println(Math.random()); // 0.8644348814557121 : 0~1사이의 수를 랜덤추추르
		System.out.println((int)(45*Math.random()+1)); // 따라서 원하는 bound를 지정하기 위해서는 *n만큼을 하면 됨.
		System.out.print(((int)Math.ceil(45*Math.random()+1))+" ");//소수점을 지우려면 ceil 메소드 이용. 소수점 버림.(그냥 cast해도 될듯.)
		System.out.print(((int)Math.ceil(45*Math.random()+1))+" ");
		System.out.print(((int)Math.ceil(45*Math.random()+1))+" ");
		System.out.print(((int)Math.ceil(45*Math.random()+1))+" ");
		System.out.print(((int)Math.ceil(45*Math.random()+1))+" ");
		System.out.println(((int)Math.ceil(45*Math.random()+1)));
		
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			int temp=(int)Math.ceil(45*Math.random()+1);
			if (arr.contains(temp)) {
				arr.add(temp);	
			}
		}
		Collections.sort(arr);
		
	}
	/*public void printArr(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		for (Iterator iterator = arr.iterator(); iterator.hasNext();) {
			ArrayList<I> type = (ArrayList<E>) iterator.next();
			
		}
	}*/
}
