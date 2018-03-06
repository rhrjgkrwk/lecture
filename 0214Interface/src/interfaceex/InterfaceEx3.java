package interfaceex;

/* class�� interface�� �̿��Ͽ� ����ó��
 * Ŭ������ : User
 *  -name:String
 *  +User()
 *  +User(name:String)
 *  +toString():String
 *  
 *  �������̽��� : Score
 *  +sol:int         (�ʱⰪ:20)
 *  +getScore():int
 *  
 *  �������̽��� : Print
 *  +toPaint():String
 *  
 *  [���ȭ��]
 *  �̸� : ȫ�浿
 *  ���� : 60��
 */
class User{
	private String name;

	public User() {
		super();
	}
	public User(String name) {
		super();
		this.name = name;
	}
	public String toString(){
		return "�̸� : " + name +"\n";
	}
}
//------------------------------------------------
interface Score{
	public int sol=20;       // ����    
	public int getScore();   // ������*sol�� ����
}
//------------------------------------------------
interface Print{
	public String toPaint();
}
//------------------------------------------------
public class InterfaceEx3  extends User implements Score, Print{  // User, Score,Print��ӹޱ�
	int s;
	public InterfaceEx3(String name, int s){
		super(name);
		this.s=s;
	}
	@Override
	public String toPaint() {
		return super.toString() + "���� : " + getScore() 
		           + "��";
	}
	@Override
	public int getScore() {
		return s * sol;
	}
	public static void main(String[] args) {
		InterfaceEx3 ob=new InterfaceEx3("ȫ�浿",3);
		System.out.println(ob.toPaint());
	}
}






