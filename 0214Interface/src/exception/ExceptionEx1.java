package exception;
//����ó���� �ذ��ϴ� ���� �ƴ϶� ������ ��.
/*
24. ����ó�� 
: ���� ������ ������ ���� �߻��Ұ��� �̸������Ͽ� ó���ϴ°�
 1. Unchecked Exception : �ʿ��� ��� ����ó������
      - ArithmeticException, NullPointException, ArrayIndexOutOfBoundsException
 2. Checked Exception : ������ ����ó���� ����
      - IOException,FileNotFoundException

�� throws ����� : ���ܰ�ü�� �絵
<--- ���ܻ�Ȳ�� ���� �������� ����
�� try{   }catch{   } : ���ܰ� �߻��ϸ� ���ܰ�ü�� ��Ƴ��� ���ϴ� ������ ����
<-- ���ܻ�Ȳ�� ó���ϰ� �������� ����
�� try{   }catch{   }finally{   } : ���ܰ� �߻��ϵ� ���ϵ� finally�� �����Ǽ���
       [����] return �� �ص� finally�� ����
�� throw  : ���ܰ����߻� - ���� ���������� ���� ���δ�.

Exception :  ��� ���ܻ�Ȳ
IOException : ��.��¿� ���õ� ����
NumberFormatException : ���ڰ� �ƴ� ���ڰ� �ԷµǴ� ����
ArithmeticException : 0���γ����� ����
ArrayIndexOutOfBoundsException : �迭�ʰ�
======================================================
*/
/*
2-->2
0-->0���� ������ ����
a-->���ڷ� �ٲ� �� ����
 -->�Է��� ����.
*/
public class ExceptionEx1 {
	public static void main(String[] args) {
		int val = 5;
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(val/n);
		} catch (Exception e){
			System.out.println("�ȵ�!");
		}
		/*catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0���� ���� �� ����");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("���ڷ� �ٲ� �� ����");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("�Է� ���� ����");
		} finally {
			System.out.println("*** ������ ���� ***");
		}*/
	}
}
