/*재귀함수를 만들어보자.*/
public class RecursiveCall {
	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(34900-8700);
	}
	
	//recursive 팩토리얼을 만들어보자. 5! = 5*4!
	public static int factorial(int n){
		if (n==1) {
			return 1;
		}
		else return n*factorial(n-1);		
	}
}
