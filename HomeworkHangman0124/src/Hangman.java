import java.util.Scanner;

/*
sakwa를 단어로 준 후 10번 시도만에 맞추면 굳~드 를 출력/
그렇지 않으면 다음기회에를 출력하는 프로그램을 만들어 보자
*/

public class Hangman {
	public static void main(String[] args) {
		
		/*System.out.println("정답을 지정해주세요.");*/
		Scanner sc = new Scanner(System.in);
		
		String ans = "APPLE"; //sc.nextLine();
		int counter = 10;
		boolean chk[] = new boolean[ans.length()];
		
		System.out.println("답을 맞춰보자. "+ans.length()+"글자");
		
		while(counter>0){
			if(counter<10)System.out.println("답을 다시 맞춰보자. "+ans.length()+"글자");
			counter--;
			
			int anschk=0;
			String tr = new String();
			
			do{
				if (tr.length()!=0) System.out.println(ans.length()+"글자로 입력해보자.");
				tr = sc.nextLine();
			}while(tr.length()!=ans.length());
			
			for (int i = 0; i < chk.length; i++) {//답을 체크해보자
				if (Character.toUpperCase(ans.charAt(i))==Character.toUpperCase(tr.charAt(i))) {
					chk[i] = true;
				}
				else{
					chk[i] = false;
				}
			}
			
			for (int i = 0; i < chk.length; i++) { //정답인가
				if (chk[i]==true) {
					anschk++;
				}
			}
			
			System.out.println("");
			for (int i = 0; i < chk.length; i++) { //출력해보자
				if (chk[i]) {
					System.out.printf("%2c",ans.charAt(i));
				}
				else{
					System.out.printf("%2s","○");
				}
			}
			System.out.println();
			
			if (anschk==ans.length()) { 
				System.out.println("정답입니다.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				break;
			}
			else{
				System.out.println("정답이 아닙니다.!!!!!!!!!!!!!!!!!!!");
			}
			
			
			System.out.println(counter+"회 남았습니다.\n");
		
		}
		sc.close();
	}
}
