package exception;
//Unchecked Exception
public class ExceptionEx2 {
	public static void main(String[] args) {
		int[] num = {10,20,30};
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(num[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ÀÎµ¦½º ÃÊ°ú");
		} 
	}
}
