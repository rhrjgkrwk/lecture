package solution;

/* [����5] 65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.
�����ڸ��� �̿��ؼ� �Ʒ��� ���� ����Ͻÿ�

[��� ȭ��]
money = 65430��
���� = 6
õ�� = 5
��� = 4
�ʿ� = 3
*/
public class ExamTest05 {
	public static void main(String[] args) {
		int money=65430;
		
		System.out.println("money = " + money+"��");
		System.out.println("���� = "+ money/10000);
		System.out.println("õ�� = "+(money%10000)/1000);
		System.out.println("��� = "+(money%10000%1000)/100);
		System.out.println("�ʿ� = "+(money%10000%1000%100)/10);
	}
}





