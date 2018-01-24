/*
�����Ը� ������.
������
������

- ���������ڸ� �˾ƺ��� (access modifier)
	1. private : ���� Ŭ���� �������� ���� ����
	2. default : ���� ��Ű�� �������� ���� ����
	3. protected : ���� ��Ű�� �� ���� ����
					�ٸ� ��Ű���� �ڼ�Ŭ�������� ���� ����
	4. public : ���� ������ ����.

- ������������ �ʿ伺
	struct Bread{
		int a;
		int b;
	}
	����ü (C����)�� �⺻������ public���� �����Ǿ��־���
	�ܺο��� ���������� �����ϱ� ������ ������ ���� �߻��ߴ�.
	�ý� Ÿ�� ��� �Ϸ��µ� �ýñ�簡 �� �ָӴϿ��� ������ ������ ���� �������� ����

- ĸ��ȭ
	������ ���߱�, 
	�ܺο��� �����ϸ� �ȵǴ� Ȥ�� ������ �ʿ䰡 ���� ���, ������ ���ߴ°�.
	������ ����ȭ


 */



	//  ĸ��ȭ�� �غ���(encapsulation)
	
	class Bread{
		private String name; //private�� ���� Ŭ���� ���ο����� ������ ����
		private int price;	// ����ȭ�� �⺻ private
		
		/*
		<GETTER / SETTER>
			- ĸ��ȭ���� getter/setter�� ������ public�� �Ǿ����. �׷��� ���� �ް� �ѱ�.
			- get/set ���鶧�� get/set+������(ù���� �빮��) �� �������Ѵ�.
		
			
		this�� ���� �˾ƺ���.
			- �ڱ��ڽ��� �����ϴ� ��ü�� this��� �Ѵ�.
			- ���⼭ this�� Bread class
			- ���� Ŭ������ ����Ų�ٰ� �����ϸ� �ȴ�.
		*/
		
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setPrice(int price) {
			this.price = price;
		}
	
		/*
		- �ν��Ͻ��� ������ �Ҹ�(Constructor/Destructor)�� ���� �˾ƺ���.
			- new => ������(�ʱ�ġ�� �־��ִ� ����)�� ���� => �ν��Ͻ� ���� => ...
			... => �Ҹ���(destructor : ��ü ���� �����ϴ� ����) => �ν��Ͻ� �Ҹ�(garbage collector : �޸𸮿��� out)
		- �Ҹ��ڴ� ���� ����
			- ��Ʈ��ũ �������� ���
		- �����ڿ� ���� �˾ƺ���.
			- �ν��Ͻ� �ʱ�ġ ������ �� ����Ѵ�.
			- �տ��� �ݵ�� public / �̱������� ����� ���� private�� ���⵵ �Ѵ�.(�����ڸ� private���� �ϸ� �޼ҵ忡 public static getInstance �ʿ�)
			- void ����
			- return �� �� ����.
		*/
		
		//������ �����(�����ε�) + �����ڿ��� �ٸ� ������ �θ���
		public Bread(){
			// this(null,0); = default �����ڿ� ������ ����.
		} 
		//default ������, ���ο� �����ڸ� �߰��ϸ� ����Ʈ �����ڰ� ������Ƿ� �̷��� ���� ����Ѵ�.
		//��, ����Ʈ �����ڰ� �����Ϸ��� ���ؼ� �ڵ����� �߰��Ǵ� ���� Ŭ������ ���ǵ� �����ڰ� �ϳ��� ���� �� ���̴�.

		public Bread(String name, int price){
			this.name = name;
			this.price = price;
		}
		
	
	
}		/*b.name = "soboru"; 
		 * �ٸ� Ŭ�����̱� ������ private �̷���( �ν��Ͻ���.�ν��潺���� )���� ���� �Ұ���
		 * b.price = 1000;
		 * */
		//System.out.println(b.name+" "+b.price);
		

public class OOPBakery {
	public static void main(String[] args) {
		Bread b = new Bread();
		System.out.println(b.getName()+"\t\\"+b.getPrice());
		b.setName("�Һ���");
		b.setPrice(1000);
		System.out.println(b.getName()+"\t\\"+b.getPrice());
		
		Bread b1 = new Bread("���ڻ�",1800); //�����ڸ� �̿��ؼ� �ʱ�ġ�� �����غ���.
		System.out.println(b1.getName()+"\t\\"+b1.getPrice());
		
		
		/*
		- Method Overloading�� �غ���!!!!
			- �޼ҵ� �ߺ�
			- �������� ���̱� ���ؼ� ���
			1. �޼ҵ� �̸��� ���ƾ��ؿ�
			2. ������ Ÿ���� �ٸ��ų� ������ �޶���Ѵ�.
			ex. sysout�� �����ε��̴�.
		*/
		
		kaja();
		kaja("��--��");
		
		

		
	}
		
	public static void kaja(){
		System.out.println("��ü ��---��");
	}
	public static void kaja(String aa){
		System.out.println("���õ�"+aa);
	}

}


















