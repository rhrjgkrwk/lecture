class ScoreTable{
	private String name;
	private int sol; //���� ��
	private static int s=20; //����
	private int score; // ���� �� *  ����
	public ScoreTable() {
	}
	public ScoreTable(String name, int sol) {
		this.name = name;
		this.sol = sol;
		calcScore();
	}
	public void calcScore(){
		score = s*sol;
	}
	public void display(){
		System.out.println(name+"  \t"+score);
	}
}
public class Test12 {
	public static void main(String[] args) {
		 ScoreTable  s1 = new ScoreTable("�ε鷡",5);
         ScoreTable  s2 = new ScoreTable("���޷�",3);
         ScoreTable  s3 = new ScoreTable("������",0);
         //�������� �ϼ��Ͻÿ�
         System.out.println("�̸�           ����\n-------------------------");
         s1.display();
         s2.display();
         s3.display();
         
	}
}


/*
[����12]
(1)Ŭ������:ScoreTable
  - name:String    ==> �̸�
  - sol:int            ==> ������
  - s: static int     ==> ����(20)
  - score:int         ==> ����=������*����
  +ScoreTable()
  +ScoreTable(name:String,sol:int)  
  +calcScore():void          ==>���
  +display():void             ==> ���  

(3) main()�Լ����� 
    public static void main(String[] args){
           ScoreTable  s1 = new ScoreTable("�ε鷡",5);
           ScoreTable  s2 = new ScoreTable("���޷�",3);
           ScoreTable  s2 = new ScoreTable("������",0);
           //�������� �ϼ��Ͻÿ�
    }
[���ȭ��]
   �̸�      ����      
  ---------------------
   �ε鷡    100
   ���޷�     60
   ������      0
*/