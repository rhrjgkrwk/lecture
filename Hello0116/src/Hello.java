//이클립스는 저장하는 순간에 컴파일됨.
public class Hello {

	public static void main(String[] args) { // HEAD
		
		// BODY
		
		System.out.println("Hello World!!!!! 안녕"); //화면 출력
		
		int aa = 10; //4btye, 범위는 -21억 ~ 21억
		int bb = aa+500;
		
		System.out.println(aa);
		System.out.println(bb);

		//누적스텝
		bb = bb+100;
		
		//data change - overlapping 
		
		int a = 300;
		int b = 500;
		int temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
		
	}
	
	
}
