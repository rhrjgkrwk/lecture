
/*��Ʈ�� ���۸� ����غ���*/

public class StringBufferEx {
	public static void main(String[] args) {
		String aa= "babo";
		String bb= "ondal";
		String cc = aa+bb;
		//String�� �������� ����. ���� �Ұ���(������ ���Ҷ� ������ ���� ����)
		System.out.println(cc);
		
		//String Buffer : ������ ���Ҵ����� �ʰ� ������ ����. 
		//������ ���� �������� ��� String ���� StringBuffer�� ����ϴ� ���� ����.
		StringBuffer sb1 = new StringBuffer("java"); 
		StringBuffer sb2 = new StringBuffer(10);  // capacity�� �����غ���.
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		
		//StringBuffer�� �̿��ؼ� ���ڿ��� �����غ���.
		System.out.println(sb2.append("java"));
		System.out.println(sb1.append("java"));
		
		System.out.println(sb1.reverse());
		System.out.println(sb1.delete(1,4)); // 1<=��<4 ���� �����.
		System.out.println(sb2.toString()); 
		System.out.println(sb2.replace(1, 3, "python")); //1~2������ ���ڿ��� "python"���� �ٲ۴�.
		
		if (sb1.equals(sb2)) { //���� equals�� ���Ͽ����Ѵ�.
			System.out.println("���ƿ�");
		}
		else {
			System.out.println("�޶�");
		}
		
		//���� ���� ���ڿ� ����.
		System.out.println(sb1.length());
		System.out.println(sb2.length());
	}
}
