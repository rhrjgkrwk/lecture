/*C언어 = 함수 func
JAVA, C# = Method라고 함. 코드의 반복을 줄이자

메소드 호출문 - 사장
메소드 정의문 - 비서

메소드는 3가지 형식이 있다.
*/


public class Method0122 {
	public static void main(String[] args) {
		gazua();//method 호출문
		gazua1(10);			
				//인자,인수,argument
		String ddobada = gazua2(2);
		System.out.println(ddobada);
		
	}//main method의 끝
	
	
	//method 1형식
	public static void gazua(){
		System.out.println("깔");
		System.out.println("깔깔");
		System.out.println("깔깔깔");	
		System.out.println("깔깔깔깔");
		System.out.println("깔깔깔깔깔");
	}
	
	//method 2형식 : 매개변수(parameter, 매소드측) - 인자/인수(argument, 호출측)가 있따.
	public static void gazua1(int a) {
									//parameter
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("깔");
			}
			System.out.println();
		}
	}
	
	//method 3형식 : return이 있다.
	public static String gazua2(int bada) {
					//return data type(반환할 자료형)
		System.out.println("나~~~~~3형식이라능");
		String str = "다했음";
		return str;
	}
	
	
}
