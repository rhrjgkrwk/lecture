package family;

class  MainEx
{
	public static void main(String[] args) 
	{
		/*Father ft=new Father("ȫ�浿");
		Mother mt=new Mother("�����");
		Son so=new Son("ȫ����");
		
		System.out.println(ft);                //or   ft.toString()
		System.out.println(mt);
		System.out.println(so);*/
		
		/*Family []f = new Family[]{
			new Father("ȫ����"), new Mother("�ڼ���"), new Son("ȫ����")
		};
		for (Family fam : f) {
			System.out.println(fam);
		}*/
		
		Family f = new Family("��â��");
		System.out.println(f);
	}
}
/*  �̸� : ȫ�浿                  <--- Family�� toString()���� �ۼ�
 *  �ƺ��� ������ ���� �Ѵ�    <--  Job�������̽��� ��ӹ޾Ƽ�  
 *                                           Father��  work()���� �ۼ� 
 *                                       
 *  �̸� : �����
 *  ������ �������� �Ѵ�
 * 
 *  �̸� : ȫ����
 *  �Ƶ��� ���θ� �Ѵ� 
 */