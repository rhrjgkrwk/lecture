import java.util.Scanner;

/*
��Ʈ��Ŭ������ �� �� �˾ƺ���.
*/

public class StringClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String s1 = sc.nextLine();
		System.out.print("PW : ");
		String s2 = sc.nextLine();

		// String compareTo�� ����غ���2

		if (s1.compareTo("rhrjgkrwk") == 0 && s2.compareTo("dlckdgml") == 0) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		} else {
			System.out.println("�Ф�Ʋ�Ƚ��ϴ�.");
		}
		System.out.println("�ƹ��ų� �ĺ�����.");
		String s3 = "Gazua";
		String s4 = sc.nextLine();
		if (s3.indexOf(s4) > -1) {
			System.out.println(s3.indexOf(s4)+"��° �߰�");
		} else
			System.out.println("��������");
		/*
		���ڿ� �迭�� ��� 
		å ������ �ִ´�. 
		�׸��� java�� �� å�� �˻�&���
		*/
		
		String [] books = {
				"easy java", 
				"java ragonahalka",
				"Ok java",
				"Maerong"
		};
		
		for (int i = 0; i < books.length; i++) {
			if (books[i].indexOf("java")!=-1) {
				System.out.println(books[i]);
			}
		}
		System.out.println("�˻� ����");
		
		
		//split,�̶�� �޼��带 ����غ���.
		
		String s5 = "ds, sda,fdf ,dsf,ds,fd,asd,fasd,fas";
		String s6[] = s5.split(","); //String �� token���� �ڸ���.
		for (int s = 0; s < s6.length; s++) {
			System.out.print(s6[s]+"\t");
		}
		System.out.println();
		//startWith�� ����غ���.
		
		if (s5.startsWith("ds")) { //"ds"�� �����ϴ�?
			System.out.println("ȣ��");
		}
		else {
			System.out.println("����");
		}
		
		//substring�� �Ἥ �������� ������.
		
		String s7 = "                       chang hee lee";
		System.out.println(s7.substring(0,2));
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < s7.length(); i++) {
				if (i==0) System.out.println(s7);
				else System.out.println(s7.substring(i)+" "+s7.substring(0,i));
			}			
		}
		System.out.println();
		
		
		//UPpercase & lowercase
		System.out.println(s7.toUpperCase()+s7.toUpperCase().toLowerCase());
		
		
		sc.close();
	}
}
