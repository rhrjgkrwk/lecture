package constructor;

//Ŭ������ : UserInfo
//+name:String   
//+addr:String
//+UserInfo()
//+UserInfo(name:String, addr:String)   
//+getter

class UserInfo{
	public String name;
	public String addr;
	//Cons
	public UserInfo() {
		// TODO Auto-generated constructor stub
		System.out.println(" ** �ּҷ� **");
	}
	public UserInfo(String name, String addr) {
		this();
		this.name = name;
		this.addr = addr;
	}
	//Getters
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
}
public class ConstructorEx3 {
	public static void main(String[] args) {
		UserInfo pp=new UserInfo("���󿡸�","����� �Ｚ�� ��ķ");
		System.out.println("�̸� : " + pp.getName());
		System.out.println("�ּ� : " + pp.getAddr());
	}
}

/*    [���] 
 *   ** �ּҷ� **                     <---����Ʈ �����ڿ��� ���
 *  �̸� : ���󿡸�                   <---main()�Լ����� getter�� �̿��ؼ� ���
 *  �ּ� : ����� �Ｚ�� ��ķ
 */

