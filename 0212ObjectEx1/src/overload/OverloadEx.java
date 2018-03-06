package overload;

/*
함수이름을 중복으로 쓰지 않으면
함수의 이름 절약!!!!!
하나의 이름을 가진 함수를 가지고 여러 인자에 대처

Overload Method
- 같은 이름의 함수를 여러번 정의하는 것.
- 반드시 메서드 이름이 동일.
- 컴파일러가 함수를 찾아갈 때는 인자값이 중요, 리턴타입은 따지지않는다.
- 따라서 리턴타입은 관계없이
- 파라미터의 갯수나 타입이 달라야 오버로딩이 성립한다.
- 메서드의 이름을 절약
*/

public class OverloadEx {
	int x = 10;
	int y = 20;
	
	public int max() {
		return x > y ? x : y;
	}
	
	public int max(int x, int y) {
		return x > y ? x : y;
	}

	public float max(float x, float y) {
		return x > y ? x : y;
	}

	public double max(double x, double y) {
		return x > y ? x : y;
	}

	public static void main(String[] args) {
		OverloadEx ob = new OverloadEx();
		System.out.println(ob.max());
		System.out.println(ob.max(50,20));
		System.out.println(ob.max(5645.12,123.123));
	}
}

//