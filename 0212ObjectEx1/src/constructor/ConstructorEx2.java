
package constructor;

public class ConstructorEx2 {
	
	//������ �����ε�, 
	/*
	13. ������(Constructor) 
    :��ü�� ��������鼭 �ڵ�ȣ���ϴ� �Լ��̸�, 	
     ��ü�� �ʱ��۾��� �Ұ�쿡 �̿� �ȴ�.

   �� �ݵ�� Ŭ����� �����ؾ� �Ѵ�
   �� �����(���ϰ�)�� ���� 
   �� ��ü�� �����ɶ� �ڵ� ȣ��Ǹ�, ����ڰ� ���Ƿ� ȣ���Ҽ� ����
   �� ����ʵ��� ���� �ʱ�ȭ �Ѵ�
   �� �����ϸ� �����Ͻ� �ڵ����� default�����ڸ� �����
   �� �������� �����ڸ� ����� �ִ�(������ overloading)
   �� �����ڳ��ο��� ù��°���ο� this(�Ű�����)�� ����Ͽ� �ٸ� �����ڸ� ȣ���Ҽ� �ִ�.
       ��, 1���� ȣ���� �����ϴ�

      this()               ---> �ڱ� Ŭ������ ����Ʈ������ȣ��
      this(����)         ---> �ڱ� Ŭ������ ���ڰ��� ���� �ٸ�������ȣ��  
      this.�ʵ��       ---> �ڱ� Ŭ������ ������ ��Ī
      this.�޼����()  ---> �ڱ� Ŭ������ �޼��带 ��Ī
	*/
	public ConstructorEx2() {
		// TODO Auto-generated constructor stub
		this("�����ٶ󸶹ٴ�");
		System.out.println("default cons");
	}
	
	public ConstructorEx2(String s) {
		// TODO Auto-generated constructor stub
		this("�����ٶ󸶹ٴ�",10);
		System.out.println(s+" default cons");
	}
	
	public ConstructorEx2(String s, int a) {
		// TODO Auto-generated constructor stub
		
		System.out.println(s+" default cons " + a);
	}
	
	
	public static void main(String[] args) {
		new ConstructorEx2();
		//��ü�� �����ϰ� �ƹ��͵� ���ϸ� ������ �ߴ� ���� 
		//�޸� ���� �־ 
	}
}






/*package constructor;

public class ConstructorEx2 {
	
	//������ �����ε�, 
	
	13. ������(Constructor) 
    :��ü�� ��������鼭 �ڵ�ȣ���ϴ� �Լ��̸�, 	
     ��ü�� �ʱ��۾��� �Ұ�쿡 �̿� �ȴ�.

   �� �ݵ�� Ŭ����� �����ؾ� �Ѵ�
   �� �����(���ϰ�)�� ���� 
   �� ��ü�� �����ɶ� �ڵ� ȣ��Ǹ�, ����ڰ� ���Ƿ� ȣ���Ҽ� ����
   �� ����ʵ��� ���� �ʱ�ȭ �Ѵ�
   �� �����ϸ� �����Ͻ� �ڵ����� default�����ڸ� �����
   �� �������� �����ڸ� ����� �ִ�(������ overloading)
   �� �����ڳ��ο��� ù��°���ο� this(�Ű�����)�� ����Ͽ� �ٸ� �����ڸ� ȣ���Ҽ� �ִ�.
       ��, 1���� ȣ���� �����ϴ�

      this()               ---> �ڱ� Ŭ������ ����Ʈ������ȣ��
      this(����)         ---> �ڱ� Ŭ������ ���ڰ��� ���� �ٸ�������ȣ��  
      this.�ʵ��       ---> �ڱ� Ŭ������ ������ ��Ī
      this.�޼����()  ---> �ڱ� Ŭ������ �޼��带 ��Ī
	
	public ConstructorEx2() {
		// TODO Auto-generated constructor stub
		System.out.println("default cons");
	}
	
	public ConstructorEx2(String s) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println(s+" default cons");
	}
	
	public ConstructorEx2(String s, int a) {
		// TODO Auto-generated constructor stub
		this(s);
		System.out.println(s+" default cons " + a);
	}
	
	
	public static void main(String[] args) {
		new ConstructorEx2("�޷�",10);
		//��ü�� �����ϰ� �ƹ��͵� ���ϸ� ������ �ߴ� ���� 
		//�޸� ���� �־ 
	}
}*/