package constructor;

import java.util.Scanner;

/*  Ŭ������ : ConstructorEx4
 *   x : int
 *   y : int
 *  
 *   +ConstructorEx4()             -- �Է¹ޱ�
 *   +calc():int                   -- x * y �� ����
 *   +display():void	           -- ����ϱ�
 */

public class ConstructorEx4 {
	int x;
	int y;
	
	public ConstructorEx4() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" [����]  �簢���� ����");
		System.out.print("���θ� �Է� : ");
		x = sc.nextInt();
		System.out.print("���θ� �Է� : ");
		y = sc.nextInt();
		sc.close();
	}

	public int calc (){
		return x*y;
	}
	
	public void display(){
		System.out.println("�簢���� ���� : "+calc());
	}

	public static void main(String[] args) {
		ConstructorEx4 ob=new ConstructorEx4();
		ob.display();
	}
	
	
	
}
/* [����]  �簢���� ����
 * 
 *  ���θ� �Է� : 5
 *  ���θ� �Է� : 4
 * 
 *  �簢���� ���� : 20 
 */






