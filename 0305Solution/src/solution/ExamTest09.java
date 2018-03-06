package solution;

/*[문제9]실행시 숫자 5개(a,b,c,d,e)을 args로 입력받아서 순서대로 출력하시오

[결과 화면]
java  ExamTest08   25  78  36 90 5

5  25  36  78 90
*/
public class ExamTest09 {
	public static void main(String[] args) {
		int x[]=new int[5];
		int temp;      //임시기억장소
		//입력----------------------------------
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
		//출력------------------------------------
		for(int i=0; i<x.length; i++){
			System.out.print(x[i]+"    ");
		}
	}
}







