
public class HomeworkMyStack {
	public static void main(String[] args) {
		MyStack ms = new MyStack(5);
		
		//������ ��á���� ������� Ȯ���غ���.
		System.out.println("���� ������ ����ֳ���? "+ms.isEmpty());
		System.out.println("���� ������ ���� ���ֳ���? "+ms.isFull());
		
		//push�� �غ���.
		ms.push("�޷�");
		ms.push("�޷η�");
		ms.push("�޷ηη�");
		ms.push("�޷ηηη�");
		ms.push("�޷ηηηη�");
		ms.push("�޷ηηηηη�");
		
		//pop�� �غ���.
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		
		
		ms.push("�޷�");
		ms.push("�޷η�");
		ms.push("�޷ηη�");
		ms.push("�޷ηηη�");
		
		//peek�� ����غ���.
		System.out.println("peek : "+ms.peek());
		
		//������ �뷮�� �����غ���.
		System.out.println("���� ������ capacity�� "+ms.getCapacity()+"�̴�. ");
		ms.setCapacity(10); //������ �뷮�� �����غ���.
		System.out.println("���� ������ capacity�� "+ms.getCapacity()+"�̴�. ");
		ms.setCapacity(5); //������ �뷮�� �����غ���.
		System.out.println("���� ������ capacity�� "+ms.getCapacity()+"�̴�. ");
	
		//search�� �غ���.
		String str = "�޷η�";
		if (ms.search(str)>-1) {
			System.out.println(str+"�� ��ġ�� "+ms.search(str)+"�Դϴ�.");
		}
		else
			System.out.println(str+"�� ���ÿ� �����ϴ�.");
	
		//length�� ����.
		System.out.println("���� ���̴� "+ms.leng()+"�Դϴ�.");
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("���� ���̴� "+ms.leng()+"�Դϴ�.");
	}
}

class MyStack { // String�迭�� ������ ������.
	private String[] strarr;
	private int peek = -1;
	private int capacity;

	// �����ڿ��� ������ ũ�⸦ ���ϰ� �����Ѵ�.
	public MyStack() { // �⺻ ũ�� 10
		this.strarr = new String[10];
		this.capacity = 10;
	}

	public MyStack(int capacity) {
		this.strarr = new String[capacity];
		this.capacity =capacity;
	}
	
	
	public int getCapacity() { //���� ������ �뷮
		return capacity;
	}

	public void setCapacity(int capacity) { //�迭�� ũ�⸦ ��������.
		//�迭�� ũ�⸦ �ø��� ������ ������ �������ش�.
		//�迭�� ũ�Ⱑ �پ�� ���, �߸��� �κ��� �����ش�.
		String temp[] = strarr.clone();
		strarr = new String[capacity];
		for (int i = 0; i < ((this.capacity>capacity) ? capacity : this.capacity); i++) {
			strarr[i] = temp[i];
		}
		this.capacity = capacity;
	}


	/*
	 * MyStack Methods.. 1. push 2. pop 3. isEmpty 4. peek 5. search
	 */
	
	public int leng() { //���� ������ �뷮
		return peek+1;
	}
	
	
	public void push(String str) {
		if (this.isFull()) {
			System.out.println("������ ���� á���");
		}
		else{
			strarr[++peek] = str;
		}
	}

	public String pop() { // erroró�� �ٽ� ���.
		try {
			String temp = strarr[peek];
			strarr[peek--] = null;
			return temp;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������ ����ֽ��ϴ�. null�� ��ȯ�մϴ�.");
			return null;
		}
	}

	public boolean isEmpty() {
		if (peek <= -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if (capacity-1 == peek) {
			return true;
		} else {
			return false;
		}
	}

	public String peek() {
		try {
			return strarr[peek];
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("no element");
			return null;
		}

	}

	public int search(String str) { // ������ index(ù��° �߰�) ������ -1
		for (int j = 0; j <= peek; j++) {
			if (strarr[j].equals(str)) {
				return j;
			}
		}
		return -1;
	}
}