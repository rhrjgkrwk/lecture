import java.util.Iterator;
import java.util.Random;

/*
- �迭 �Ѱ��ֱ�
	- int arr[] �� ������ arr�� �迭�� ù��° �ּҸ� ����Ű�Ƿ� �迭�� ��ǥ�̸� arr�� �Ѱ��ָ� �ȴ�. 
	- �ּҸ� �Ѱ��ֱ⶧���� �Ű����� ������ ���� ���� ����� ������ �����ϱ� ������ ������ ���� �а� ������ �� �ִ�.
	- �̸� call by reference��� ��
	- 
- �� �Ѱ��ֱ�
	- ������ ���� �����ؼ� �Ѱ���. ������ �Ұ����ϴ�.
	- call by value
	- �ڹٿ����� ���â�� �ϳ��� �������� ������ ���� ����. int *a �̷��� ����.
	*/
/*
- �������迭
	- 

*/

public class ArraySecond {
	public static void main(String[] args) {

		//�ִ밪�� ���غ���. max�� min�� Ȱ������.
		int a = 30;
		int b = 50;
		int c = 300;
		int max=-210000000;
		 
		if (a>b) max = a;
		else max = b;
		if (c>max) max = c;
		
		System.out.println("�ִ밪�� "+max);

		//�迭������ �ִ밪�� ���غ���.
		//max = arr[0]���� �ʱ�ȭ�ϰ� ��������.
		
		int arr[] = new int[10];
		Random r= new Random();
		for (int i = 0; i < arr.length; i++) { //�迭 �ʱ�ȭ
			arr[i] = r.nextInt(100);
		}
		for (int i = 0; i < arr.length; i++) { //�迭 ���
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int max1 = arr[0]; //arr[0]�� max�� �ְ� �����ؼ� [1]���� ��
		for (int i = 1; i < arr.length; i++) { //max1�� ã��
			if (max1<arr[i]) {
				max1 = arr[i];
			}
		}
		System.out.println("�ִ밪�� "+max1);
		
		//2���� �迭�� ������.
		
		
		int [][] k = new int [2][3];
		
		// �ʱ�ȭ�� �غ���(1)
		k[0][1] = 30;
		k[1][2] = 109;
		
		//�ʱ�ȭ�� �غ���(2)
		int k2[][] ={
				{30,200,100},  //k[0][0~2]
				{20,21,14}      //k[1][0~2]
		};
		
		//2���� �迭�� ����غ���
		//k1�� ���� ��ǥ��.
		//k1.length ���� �ǹ� : ���� ����
		//k1[i]�� ���� ��ǥ��
		//k1[i].length ���� �ǹ� : ���� ����
		for (int i = 0; i < k2.length; i++) {
			for (int j = 0; j < k2[i].length; j++) {
				System.out.printf("%7d",k2[i][j]);
			}
			System.out.println();
		}
		
		
		
		//foreach���� �Ẹ��. python�� for���̶� ���. ex. for i in arr: && for i in range(0,10):
		
		
		int bbb[] = {24,26,28};
		for (int i : bbb) { // bbb���� �ϳ��� ������� i�� ���� & bbb�������ε������� �����´�.
			System.out.print(i+" ");
		}System.out.println();
		
		
		for (int[]aa:k2) { //2���� �迭���� foreach�� ����Ϸ��� ���� �ϳ��� �и��ϴ� �۾��� ������.
			for (int i:aa) { // 1���� �迭�� �и��� aa �迭�� �ٽ� foreach�� ������.
				System.out.print(i+" ");
			}
		}System.out.println();
		
		//���� �迭�� ���� �˾ƺ���. jagged(���ߕ���, ��Ϲ��� �����) array
		
		int aaaa[][] = new int [20][];
		aaaa[0] = new int[3];//1����
		aaaa[1] = new int[5];//1����
		//1���� �迭���� �迭�� �ִ� ����.
		
		for (int i = 0; i < aaaa.length; i++) {
			aaaa[i] = new int[i+1];
		}
		
		aaaa[0][0] = 100;
		
		/*aaaa[0] = new int[1];
		aaaa[1] = new int[2];
		aaaa[2] = new int[3];*/
		
		for (int i[] : aaaa) { //FOREACH ���� �Ẹ��.
			for (int j : i) {
				System.out.printf("%2d",j);
			}System.out.println();
		}		
	}
}


