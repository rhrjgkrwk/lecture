//��Ŭ������ �����ϴ� ������ �����ϵ�.
public class Hello {

	public static void main(String[] args) { // HEAD
		
		// BODY
		
		System.out.println("Hello World!!!!! �ȳ�"); //ȭ�� ���
		
		int aa = 10; //4btye, ������ -21�� ~ 21��
		int bb = aa+500;
		
		System.out.println(aa);
		System.out.println(bb);

		//��������
		bb = bb+100;
		
		//data change - overlapping 
		
		int a = 300;
		int b = 500;
		int temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
		
	}
	
	
}
