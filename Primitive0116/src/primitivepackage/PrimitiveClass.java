package primitivepackage; 
//이름구분 : 이름 만들때 가장 안쓸 법한 이름을 사용.
//보통 . com.ddddd.ddd url을 뒤집어 쓰는 방식을 사ㅇ숑


public class PrimitiveClass {
	public static void main(String[] args) {
			boolean b1 = true;
			boolean b2 = false;
			
			char c = 'A';
			char c1 = '가';
			
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
			
			System.out.println("16진수 표기 int 최대값" + Integer.toHexString(Integer.MAX_VALUE));
			System.out.println("16진수 표기 int 최so값" + Integer.toHexString(Integer.MIN_VALUE));
			
			
			int oct = 073; // 앞에 0이 붙은 것 8진수로 인식 octal
			int hex = 0x13e5; //앞에 0x가 붙은 것 16진수 hexa
			int bin = 0b1001010; //앞에 0b가 붙은 것 2진수 binary
			double ex = 24.6e-2; // 지수 표현도 가능
			
			System.out.println(ex);
			
			
			//최대값 + 1 = 최소값
			//최소값 -1 = 최대값
			int don = 2147483647;
			int don2 = don+1;
			System.out.println(don2);
			don = -2147483648;
			don2 = don-1;
			System.out.println(Integer.toBinaryString(Integer.valueOf(don2)));
					
			String aja = "sdafdsafasf";		
			String aajaa = new String("kongjoo");
			
			System.out.printf("%s 이름은 %s이다. \n",aajaa,"쵕");
			System.out.printf("%d\n",100);
			System.out.printf("%9d\n",100); //양수면 오른쪽 정렬
			System.out.printf("%-9d\n",100); //음수면 왼쪽 정렬
			System.out.printf("%09d\n",100);
			
			System.out.printf("%f \n %.2f \n %14.10f",23.2356,35.13516,2541.125125215215215);
			
	}
	
}




























