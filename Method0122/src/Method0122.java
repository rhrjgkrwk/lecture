/*C��� = �Լ� func
JAVA, C# = Method��� ��. �ڵ��� �ݺ��� ������

�޼ҵ� ȣ�⹮ - ����
�޼ҵ� ���ǹ� - ��

�޼ҵ�� 3���� ������ �ִ�.
*/


public class Method0122 {
	public static void main(String[] args) {
		gazua();//method ȣ�⹮
		gazua1(10);			
				//����,�μ�,argument
		String ddobada = gazua2(2);
		System.out.println(ddobada);
		
	}//main method�� ��
	
	
	//method 1����
	public static void gazua(){
		System.out.println("��");
		System.out.println("���");
		System.out.println("����");	
		System.out.println("�����");
		System.out.println("������");
	}
	
	//method 2���� : �Ű�����(parameter, �żҵ���) - ����/�μ�(argument, ȣ����)�� �ֵ�.
	public static void gazua1(int a) {
									//parameter
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}
	
	//method 3���� : return�� �ִ�.
	public static String gazua2(int bada) {
					//return data type(��ȯ�� �ڷ���)
		System.out.println("��~~~~~3�����̶��");
		String str = "������";
		return str;
	}
	
	
}
