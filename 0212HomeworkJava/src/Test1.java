/*
[����1] main()�Լ����� ���� ȣ���ϰ� ���� ����� return �޾Ƽ� 
          main()���� ����Ͻÿ�
���ϸ�:Test1.java
ȣ���Լ� : sum(3,5):int   sub(7,2):int   mul(4,5):int   div(7,3):double

���ϱ� : 8
��  �� : 5
���ϱ� : 20
������ : 2.33
------------------------------------------------------------------
[����2] main()�Լ����� �޼��带 ȣ���Ͽ� ������ ���� ����Ͻÿ�

(����)
1. �Լ��� : output(10,'#'):void
2. ��¹����� for���� �̿��Ͻÿ�

<���>
# # # # # # # # # # 
------------------------------------------------------------------
[����3]���� �Է¹޾� �Լ�ȣ���Ͽ� ó���Ͻÿ�
����1)�Է¹��� ����  compute(item, qty, price):void  �Լ����� ó��
����2)����� : �ݾ� = ���� * �ܰ�

-�Է�-
ǰ�� : apple
���� : 10
�ܰ� : 1200

-���-
ǰ�� : apple
�ݾ� : 12000��
----------------------------------------------------
[����4] �Ʒ��� ���� 12���� ������ �迭�� ����� ����Ų�� 
���ϴ� month�� �Է¹޾� �� ���� ������ ����Ͻÿ�

[����]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

--�Է�ȭ��/���ȭ��--

���ϴ� month�� �Է��Ͻÿ� : 3
3���� 31���Դϴ�.

[����5]������ ����/�ϼ��Ͻÿ�
(1)Ŭ������:Test5
     �ʵ�� : -base:double  (�ʱⰪ:5.0)
                -height:double (�ʱⰪ:3.5)
     �޼����: +getArea():double
                  +getHypotenuse():double 
                  +getPerimeter():double
(2)����
   1)��  �� : �ﰢ���� ���� = (�غ� * ����) /2
                �������� = Math.sqrt(�غ�*�غ�+����*����)  
                �ѷ����� = �غ� + ���� + �������� 
   2) Test5�� ��ü ob�� �����Ѵ�
   3) getArea()�� �ﰢ���� ���̸� �����Ѵ�
       getHypotenuse() ������ ���̸� �����Ѵ�
       getPerimeter()�� �ѷ����̸� �����Ѵ� 

[���ȭ��]
�ﰢ���ǳ��� : 8.75
�������� : 6.10
�ѷ����� : 14.60
--------------------------------------------------------------------
[����6]�Լ� overloading�� �̿��Ͽ� ������ �ϼ��Ͻÿ�
(1)Ŭ������:Test6
    �� �ʵ�� : PI:double     (�ʱⰪ:3.141593, final�� ����)
    �� �޼ҵ� : 
           area(a:int):double       => ���ǳ���=������*������*PI
           area(a:int, b:int):double     => �簢���ǳ���=����*����
           area(a:int, b:int, c:int):doble     => ��ٸ����� ����=(�غ� + ���� )*����/2 
(2)����
     1)main()�Լ����� 
       public static void  main(String[] args){
             Test6 ob=new Test6();
             //������ �ϼ��Ͻÿ�
       }
     2)������ area(3),area(4,5),area(3,4,7) �޼��带 ȣ���Ͽ� 
        ������� ���Ѵ�

[���ȭ��]
���ǳ��� : 28.274337
�簢���ǳ��� : 20.0
��ٸ����ǳ��� : 24.5
--------------------------------------------------------------------
[����7]����Ŭ������ ����� setter & getter�� �̿��Ͽ� ������ �ϼ��Ͻÿ�
(1)Ŭ������:  BookShop
    �ʵ�� : -name:String   (å�̸�)
                -author:String   (����) 
                -price:int          (����) 
    �޼���� : +setBook(bname:String,  author:String, price:int):void
                   +viewBook():void
                   +setter & getter
(2)����
    1) Test7Ŭ������ main()�޼��忡�� BookShop Ŭ������ ��ü ob�� �����
    2) setBook("�ڹٿϼ�","ȫ�浿",25000)�� ���� �������� viewBook()�޼���� ����Ѵ�
    3)  setName("JSP���"),  setAuthor("�̼���"), setPrice(3500)�� ���� ��������
         getName(), getAuthor(), getPrice()�� ����Ѵ�

[���ȭ��]
å�̸� : �ڹٿϼ�
��  �� : ȫ�浿
��  �� : 25000��

å�̸� : JSP���
��  �� : �̼���
��  �� : 35000��
*/
public class Test1 {
	public static void main(String[] args) {
		
		/*
		ȣ���Լ� : sum(3,5):int   sub(7,2):int   mul(4,5):int   div(7,3):double

		���ϱ� : 8
		��  �� : 5
		���ϱ� : 20
		������ : 2.33
		*/
		
		System.out.println("���ϱ� : "+sum(3,5));
		System.out.println("���� : "+sub(7,2));
		System.out.println("���ϱ� : "+mul(4,5));
		System.out.printf("������ : %.2f",div(7,3));
		
		
	}
	
	public static int sum(int x, int y){
		return x+y;
	}
	public static int sub(int x, int y){
		return x-y;
	}
	public static int mul(int x, int y){
		return x*y;
	}
	public static double div(int x, int y){
		return (double)x/y;
	}
}
