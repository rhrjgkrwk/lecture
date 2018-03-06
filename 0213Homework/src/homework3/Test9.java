package homework3;
/*
[����9] ���� ���α׷��� �ϼ��Ͻÿ�

(1)Ŭ���� : Entry
   -word:String
   +Entry()                              // "***������***"�� ����Ͻÿ�
   +Entry(word:String)              //  Entry()ȣ�� 
   +writeView():void                // ������

(2)Ŭ���� : SubEntry   (Entry�� ��ӹ���)
   -definition:String 
   -year:int
   +SubEntry(word:String)                                       //Entry(word)   ȣ�� 
   +SubEntry(word:String, definition:String, year:int);  //SubEntry(word)ȣ��
   +writeView():void                                               //����, �ñ����

(3)main()�Լ�����
public static void main(String[] args){
    new SubEntry("OOP","Object Oriented Programming", 1991).writeView();
}

[���ȭ��]
*****������******
��� : OOP
���� : Object Oriented Programming
�ñ� : 1991��
*/

class Entry {
	private String word;

	public Entry() {
		System.out.println("***������***");
	}

	public Entry(String word) {
		this();
		this.word = word;
	}

	public void writeView() {
		System.out.println("��� : "+word);
	}
}

class SubEntry extends Entry {
	private String definition;
	private int year;

	public SubEntry(String word) {
		super(word);
	}

	public SubEntry(String word, String definition, int year) {
		this(word);
		this.definition = definition;
		this.year = year;
	}

	public void writeView() {
		super.writeView();
		System.out.println("���� : "+definition);
		System.out.println("�ñ� : "+year);
	}
}

public class Test9 {
	public static void main(String[] args) {
		new SubEntry("OOP","Object Oriented Programming", 1991).writeView();
	}
}
