package solution;

/*[����9]����� ���� 5��(a,b,c,d,e)�� args�� �Է¹޾Ƽ� ������� ����Ͻÿ�

[��� ȭ��]
java  ExamTest08   25  78  36 90 5

5  25  36  78 90
*/
public class ExamTest09 {
	public static void main(String[] args) {
		int x[]=new int[5];
		int temp;      //�ӽñ�����
		//�Է�----------------------------------
		for(int i=0; i<x.length; i++){
			x[i]=Integer.parseInt(args[i]);
		}
		//selection sort--------------------------
		for(int i=0; i<x.length-1; i++){
			for(int j=i+1; j<x.length; j++){
				if(x[i] < x[j]){
					temp=x[i];     
					x[i]=x[j];    
					x[j]=temp;
				}					
			}
		}
		//���------------------------------------
		for(int i=0; i<x.length; i++){
			System.out.print(x[i]+"    ");
		}
	}
}







