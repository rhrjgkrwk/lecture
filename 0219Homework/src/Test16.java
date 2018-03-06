import java.util.HashMap;

class Heripoter{
	private int no;
	private String firstName;
	private String lastName;
	public Heripoter() {
	}
	public Heripoter(int no, String firstName, String lastName) {
		this.no = no;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return String.format("%-15s", firstName) + "\t"+lastName;
	}
}

public class Test16 {
	public static void main(String[] args) {
		HashMap<Integer, Heripoter> hm = new HashMap<>();
		hm.put(101, new Heripoter(101, "�ظ�", "����"));
		hm.put(102, new Heripoter(102, "��", "����"));
		hm.put(103, new Heripoter(103, "�츣�̿´�", "�׷�����"));
		
		System.out.println("��                     �̸�\n------------------------------------");
		for (Integer i : hm.keySet()) {
			System.out.println(hm.get(i));
		}
	}
}

/*
[����16] HashMap�÷����� �̿��Ͽ� ���� �ڷḦ �߰��Ͻÿ�
(1)Ŭ������ : Heripoter
   -no:int
   -firstname:String
   -lastname:String
   +Heripoter(no:int,firstname:String,lastname:String)
   +toString():String

(2) ��뵥����
     key        value
    ------------------------------------- 
     101        �ظ�           ����
     102        ��              ����
     103        �츣�̿´�  �׷�����

(2)����
   1) main()�Լ����� HashMapŬ������ hm��ü��  ����� �����͸� �߰��Ѵ�
   2) ���׸����� �̿��Ѵ�

[���ȭ��]
��              �̸�
----------------------
�ظ�           ����
��              ����
�츣�̿´�  �׷�����
*/