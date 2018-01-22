/*while문을 써보자*/
public class WhileMoon {
	public static void main(String[] args) {
		/*
		while (condition) { - head (조건)
			
		}
		*/
		int zzz = 10;
		while (zzz>3) {
			zzz--;
			System.out.println("zzz가 줄어든다.");
		}
		
		while (true) {break;}//무한루프.
		
		//while 에서 자주 쓰이는 switch 기법 flag 기법
		boolean flag = true;;
		int i=0;
		while (flag) {
			if (i==10) {
				flag = false;
			}
			i++;
			System.out.println("DD");
		}
		
		
		/*이름붙은 반복문과 반복문의 break*/
		
		Loop1:for (i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j==5) break Loop1; //Loop1의 반복종료
				if(j==9) continue; //현재 반복문 continue
				continue Loop1;
			}
		}
		
		
	}
}
