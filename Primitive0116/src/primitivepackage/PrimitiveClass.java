package primitivepackage; 
//�̸����� : �̸� ���鶧 ���� �Ⱦ� ���� �̸��� ���.
//���� . com.ddddd.ddd url�� ������ ���� ����� �礷��


public class PrimitiveClass {
	public static void main(String[] args) {
			boolean b1 = true;
			boolean b2 = false;
			
			char c = 'A';
			char c1 = '��';
			
			System.out.println((char)(c+32));
			System.out.println((char)(c1+5));
			
			
			
			System.out.printf("%c",c1+16);
			
			
			byte  aa = 21;
			short bb = 32767;
			int cc = 2147483647;
			long dd = 111111111111111111L;
			
			double ee = 21.21222222222222222222222;
			float ff = 2123.2222222222222f;
			
			System.out.println(dd+" "+ff);
			
			System.out.println("\t dd \b ddd \f dddd \n ddddd \r \\ \' \" \n\n\n");
			System.out.println('\u0041' +"\t" + '\u004A'+ '\u0041'+ "\t" + '\u0021');
			
			System.out.println("\nLength");
			
			//System.out.println(Boolean.MIN_VALUE);
			//System.out.println(Boolean.MAX_VALUE);
			
			System.out.println("Char");
			
			System.out.println(Character.MIN_VALUE);
			System.out.println(Character.MAX_VALUE);
			
			System.out.println("byte");
			
			System.out.println(Byte.MIN_VALUE);
			System.out.println(Byte.MAX_VALUE);
			
			System.out.println("short");
			
			System.out.println(Short.MIN_VALUE);
			System.out.println(Short.MAX_VALUE);
			
			System.out.println("integer");
			
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.MAX_VALUE);

			System.out.println("long");
			
			System.out.println(Long.MIN_VALUE);
			System.out.println(Long.MAX_VALUE);
			
			System.out.println("float");
			
			System.out.println(Float.MIN_VALUE);
			System.out.println(Float.MAX_VALUE);
			
			System.out.println("double");
			
			System.out.println(Double.MIN_VALUE);
			System.out.println(Double.MAX_VALUE);
			
			System.out.println("16���� ǥ�� int �ִ밪" + Integer.toHexString(Integer.MAX_VALUE));
			System.out.println("16���� ǥ�� int ��so��" + Integer.toHexString(Integer.MIN_VALUE));
			
			
			int oct = 073; // �տ� 0�� ���� �� 8������ �ν� octal
			int hex = 0x13e5; //�տ� 0x�� ���� �� 16���� hexa
			int bin = 0b1001010; //�տ� 0b�� ���� �� 2���� binary
			double ex = 24.6e-2; // ���� ǥ���� ����
			
			System.out.println(ex);
			
			
			//�ִ밪 + 1 = �ּҰ�
			//�ּҰ� -1 = �ִ밪
			int don = 2147483647;
			int don2 = don+1;
			System.out.println(don2);
			don = -2147483648;
			don2 = don-1;
			System.out.println(Integer.toBinaryString(Integer.valueOf(don2)));
					
			String aja = "sdafdsafasf";		
			String aajaa = new String("kongjoo");
			
			System.out.printf("%s �̸��� %s�̴�. \n",aajaa,"��");
			System.out.printf("%d\n",100);
			System.out.printf("%9d\n",100); //����� ������ ����
			System.out.printf("%-9d\n",100); //������ ���� ����
			System.out.printf("%09d\n",100);
			
			System.out.printf("%f \n %.2f \n %14.10f",23.2356,35.13516,2541.125125215215215);
			
	}
	
}




























