import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

//바이너리 서치를 해보자

public class BinarySearch {
	public static void main(String[] args) {
		Random r = new Random();
		int []arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		//바이너리서치를 해보자.
		if (Arrays.binarySearch(arr, 30) >= 0) {
			System.out.println("찾았네~~심봤다");
			System.out.println(Arrays.binarySearch(arr, 30)+"번째에 있넹. 깔깔");
		}
		else {
			System.out.println("없다...");
		}
		
		
		if (Arrays.binarySearch(arr, 1) >= 0) {
			System.out.println("찾았네~~심봤다");
			System.out.println(Arrays.binarySearch(arr, 1)+"번째에 있넹. 깔깔");
		}
		else {
			System.out.println("없다...");
		}
		
		//바둑 경우의 수. 
		BigDecimal bd = new BigDecimal(Math.pow(3, 361));
		System.out.println(bd.toString());
		
	}
}
