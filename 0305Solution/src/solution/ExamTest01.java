package solution;

/* [����1]
10���� ���� �ڿ��� �߿��� 3�Ǵ� 5�� ����� 3,5,6,9 �̰� �̰��� ��� ���ϸ� 23�̴�.
1000���� ���� �ڿ��� �߿��� 3�Ǵ� 5�� ����� ��� ���ϸ� ���ϱ��?

[���ȭ��]
�� : 234168
*/
public class ExamTest01 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=1000; i++){
			if(i%3==0 || i%5==0){
				sum += i;
			}
		}
		System.out.println("�� : " + sum);
	}
}
