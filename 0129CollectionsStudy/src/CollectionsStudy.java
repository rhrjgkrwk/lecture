
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
- Collections �� �����غ���.

	- Array - �������� �迭 - one data type
	- Collections -  �������� �迭 - multi data type
	- Collection + generics = one data type + �������� �迭.
	
*/

public class CollectionsStudy extends Vector { //VectorŬ������ ��ӹ޴´�.

	public CollectionsStudy(int i) {
		super(i);
	}

	public static void main(String[] args) {
		
		//Collection - Vector - �������� �迭.
		//Vector�� ArrayList�� ���� ��� . �������� ���͸� �ַ� �̿��ߴٰ� ��.
		//ArrayList�� �� �����ϰ� ����ϱ� ���ϴ�. ����̸� ArrayList�� ����.
		CollectionsStudy cs = new CollectionsStudy(2);
		cs.addElement(new Integer(10));
		cs.addElement(new Double(22.22));
		cs.addElement(new String("¥��"));
		//cs.remove(1);
		if (cs.contains("¥��")) {
			System.out.println(cs.indexOf("¥��")+"��°�� ������~~");
		}
		else{
			System.out.println("����...");
		}
		
		//Vector�� ���̸� �˾ƺ���.
		System.out.println("���� element ���� : "+cs.elementCount); //�������
		System.out.println("���� element ���� : "+cs.size()); //�޼���
		
		
		//ArrayList�� ����غ���. ���̽��� ����Ʈ�� ����ϴ�.
		ArrayList a1 = new ArrayList();
		a1.add(30);
		a1.add("����");
		
		System.out.println(a1.get(0));
		System.out.println();
		System.out.println("���׸����� ����غ���");
		System.out.println();
		
		//generics�� Ȱ���ؼ� arraylist�� ����غ���.
		//�ν��Ͻ� ������ <String>���� �������ָ� String�� �� �� �ִ�.
		//���׸����� ���� ���� ��Ƽ������ Ÿ���� ������ �����ϱ� ���ؼ�/
		//��, �迭�� ��������Ÿ���̶�� ������ �ݷ����� �������̶�� ������ ���ÿ� ����ϱ� ���� 
		//���׸����� ���� ���̴�.
		List a2 = new ArrayList();
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("����");
		a3.add("���");
		a3.add("����");
		a3.add("���");
		a3.set(3, "���"); //3��° �ε����� ��Ҹ� ������� �ٲ㺸��.
		a3.remove(3); // 3��° �ε����� ��Ҹ� �����غ���.
		a3.remove("����");
		for (int i = 0; i < a3.size(); i++) {
			System.out.println(a3.get(i)); //��� ����
		}
		
		//Collection �� ��ü�� ��Ƽ� ó���غ���.
		
		
		
		
		
	}

}
