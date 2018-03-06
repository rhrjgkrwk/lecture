import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

class PhoneBook{
	private String phoneNumber;
	private String address;
	public PhoneBook() {
	}
	public PhoneBook(String number, String address) {
		this.phoneNumber = number;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Phone: "+phoneNumber+"\nAddress: "+address;
	}
}

public class Test17 {
	public static void main(String[] args) {
		Hashtable<String, PhoneBook> ob = new Hashtable<>();
		Scanner sc = new Scanner(System.in);
		ob.put("ȫ�浿", new PhoneBook("123-4567","����"));
		ob.put("�̸���", new PhoneBook("123-4444","�λ�"));
		ob.put("�Ӱ���", new PhoneBook("444-9874","�뱸"));
		//�̸��� ã�ƺ���!
		System.out.print("ã�»�� : ");
		String key = sc.nextLine();
		if (ob.containsKey(key)) {
			System.out.println(ob.get(key));
		}
		else {
			System.out.println("�׷� ��� ����.");
		}
		sc.close();
	}
}

/*
------------------------------------------------------------------------------
[����17] Hashtable �÷����� �̿��Ͽ� ���� ���α׷��� �ۼ��Ͻÿ�

(1)Ŭ������ : PhoneBook
- phoneNumber : String
- address : String
+ PhoneBook(phoneNumber:String,address:String)
+ toString():String      ==> ����ó�� �ּ��� ��¹��ڿ��� �����Ѵ�

(2)��뵥����
    key             value
    ----------------------------------
    ȫ�浿         123-4567   ����
    �̸���         345-3345   �뱸
    �Ӳ���         123-7890   �λ�

(2)����
    1) main()�޼��忡�� HashtableŬ������ ob��ü�� ����� �����͸� �߰��Ѵ�
    2) ���׸����� �̿��Ѵ�

[���ȭ��]
ã�� �̸�: �Ӳ���


ã�� �̸� : ����
�׷���� ����*/