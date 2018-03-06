package interfaceex;
/*
class 에서 interface 상속시에는 implement
interface에서 interface 상속시에는 extends
*/
public class InterfaceEx4 {
	public static void main(String[] args) {
		
	}
}

interface InterA{
	
}
interface InterB{
	
}
interface InterC extends InterA, InterB{ 
	//interface가 interface 상속시에는 extends를 써야하고 interface끼리는 다중 상속이 가능하다.
	
}