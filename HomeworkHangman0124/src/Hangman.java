import java.util.Scanner;

/*
sakwa�� �ܾ�� �� �� 10�� �õ����� ���߸� ��~�� �� ���/
�׷��� ������ ������ȸ���� ����ϴ� ���α׷��� ����� ����
*/

public class Hangman {
	public static void main(String[] args) {
		
		/*System.out.println("������ �������ּ���.");*/
		Scanner sc = new Scanner(System.in);
		
		String ans = "APPLE"; //sc.nextLine();
		int counter = 10;
		boolean chk[] = new boolean[ans.length()];
		
		System.out.println("���� ���纸��. "+ans.length()+"����");
		
		while(counter>0){
			if(counter<10)System.out.println("���� �ٽ� ���纸��. "+ans.length()+"����");
			counter--;
			
			int anschk=0;
			String tr = new String();
			
			do{
				if (tr.length()!=0) System.out.println(ans.length()+"���ڷ� �Է��غ���.");
				tr = sc.nextLine();
			}while(tr.length()!=ans.length());
			
			for (int i = 0; i < chk.length; i++) {//���� üũ�غ���
				if (Character.toUpperCase(ans.charAt(i))==Character.toUpperCase(tr.charAt(i))) {
					chk[i] = true;
				}
				else{
					chk[i] = false;
				}
			}
			
			for (int i = 0; i < chk.length; i++) { //�����ΰ�
				if (chk[i]==true) {
					anschk++;
				}
			}
			
			System.out.println("");
			for (int i = 0; i < chk.length; i++) { //����غ���
				if (chk[i]) {
					System.out.printf("%2c",ans.charAt(i));
				}
				else{
					System.out.printf("%2s","��");
				}
			}
			System.out.println();
			
			if (anschk==ans.length()) { 
				System.out.println("�����Դϴ�.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				break;
			}
			else{
				System.out.println("������ �ƴմϴ�.!!!!!!!!!!!!!!!!!!!");
			}
			
			
			System.out.println(counter+"ȸ ���ҽ��ϴ�.\n");
		
		}
		sc.close();
	}
}
