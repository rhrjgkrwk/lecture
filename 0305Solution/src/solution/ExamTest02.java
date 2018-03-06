package solution;

/* [����2]����ó�����α׷�
        �߰����,�⸻���,����Ʈ,�⼮������ args�� �Է¹޾Ƽ� ����Ͻÿ�
        
����1) (�߰�+�⸻)/2   ---> 60%
          ����                          ---> 20%
          �⼮                           ---> 20%
     
����2)90�̻� 'A'����     (3)A,B����  ---->"excellent"
     80�̻� 'B'����        C,D����  ---->"good"
     70�̻� 'C'����        F����    ---->"poor"
     60�̻� 'D'����        (switch���̿�) 
           ������ 'F'����
     (if~else if���̿�)

$ java ExamTest02  90 89 99 100  

[��� ȭ��]
�߰���� : 90
�⸻��� : 89
�������� : 99
�⼮����: 100

����=93.20      <---�Ҽ����� 2°�ڸ�����
����=A              
��=excellent
*/
public class ExamTest02 {
	public static void main(String[] args){
		int mi=Integer.parseInt(args[0]);
		int la=Integer.parseInt(args[1]);
		int re=Integer.parseInt(args[2]);
		int cul=Integer.parseInt(args[3]);
		
		double score=0;    // ����
		char grade='\0';    //����
		String result=null;  // ��

		score=((mi+la)/2)*0.6 + (re*0.2) + (cul*0.2);
		
		if(score>=90)			grade='A';
		else if(score>=80)	grade='B';
		else if(score>=70)	grade='C';
		else if(score>=60)	grade='D';
		else						grade='F';
		
		switch(grade){
			case 'A': case 'B': result="excellent"; break;
			case 'C': case 'D': result="excellent"; break;
			default:				 result="poor";
		}
		
		System.out.printf("���� : %.2f\n",score);
		System.out.println("���� : " + grade);
		System.out.println("�� : " + result);
		
	}
}





