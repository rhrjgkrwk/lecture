//���������� �����԰� ��� �������� 12.4%�� �����Ѵٰ� �Ѵ�. 120kg�� �� ��������?
public class Weight {
	public static void main(String[] args) {
		int weight = 120;
		double weight2 = weight*0.124;
		System.out.println("120kg�� �׺�������"+weight2+"kg");
		aaa(weight);		
	}
	public static void aaa(int a){ //static ��ü ���� �ʿ俩��
		System.out.printf("���̿쿡�����̿쿡��%.2f\n",a*0.124);
		System.out.println(a*0.124);
	}
}

//��F = ��C �� 1.8 + 32