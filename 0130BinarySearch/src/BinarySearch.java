import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

//���̳ʸ� ��ġ�� �غ���

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
		
		//���̳ʸ���ġ�� �غ���.
		if (Arrays.binarySearch(arr, 30) >= 0) {
			System.out.println("ã�ҳ�~~�ɺô�");
			System.out.println(Arrays.binarySearch(arr, 30)+"��°�� �ֳ�. ���");
		}
		else {
			System.out.println("����...");
		}
		
		
		if (Arrays.binarySearch(arr, 1) >= 0) {
			System.out.println("ã�ҳ�~~�ɺô�");
			System.out.println(Arrays.binarySearch(arr, 1)+"��°�� �ֳ�. ���");
		}
		else {
			System.out.println("����...");
		}
		
		//�ٵ� ����� ��. 
		BigDecimal bd = new BigDecimal(Math.pow(3, 361));
		System.out.println(bd.toString());
		
	}
}
