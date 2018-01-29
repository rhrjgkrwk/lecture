import java.util.Scanner;

/*	
<OVERRIDING>
- 오버라이딩 : 메서드 재정의
- 조건 - 선언부가 일치해야한드아.
	1. 메소드 이름이 같아야 한다.
	2. 반환 타입이 일치
	3. 매개변수가 같아야한다.
	4. 접근제어자의 경우, 부모 클래스의 메소드와 같거나 덜 제한적이어야한다. 즉 더 제한적일 수 없다.
		- ex. 부모(protected) - 자식(protected or public)

- 언제 사용하는가
	1. 

*/

//overriding을 해보자

class Boomo{
	public void car(){
		System.out.println("부모차 드라이브 부릉부릉");
	}
}

class Janyeo extends Boomo{
	public void car(){ //@@@override : 재정의
		System.out.println("유모차 여행 부릉부릉");
	}
}

public class Overriding {
	public static void main(String[] args) {
		/*Boomo b1 = new Boomo();
		Janyeo j1 = new Janyeo();
		Boomo b2 = new Janyeo(); 
		//객체가 형변환 되었을때, 부모가 유모차를 타기위해 만든것이 오버라이딩+형변환.
		b2.car(); //유모차가 찍힌다.. 
		
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.드라이브   2.여행");
		int aa = sc.nextInt();
		Boomo b1 = null;
		
		switch (aa) {
		case 1:
			b1 = new Boomo();
			break;
		case 2:
			b1 = new Janyeo();
			break;
		}
		b1.car();
		sc.close();
	}
}
