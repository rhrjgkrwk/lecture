package interfaceex;

interface Cryable{
	public void cry();
}
interface Flyable{
	public void fly();
}
class Eagle implements Flyable, Cryable{
	@Override
	public void fly(){
		System.out.println("�������� ���� �ٴմϴ�");
		this.cry();
	}
	public void cry(){
		System.out.println("ļ�� ļ��~~");
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		new Eagle().fly();
	}
}
//--------------------------------------------------------
/*abstract class Cryable{
	abstract public void cry();
}
abstract class Flyable{
	abstract public void fly();
}
class Eagle extends Flyable{
	@Override
	public void fly(){
		System.out.println("�������� ���� �ٴմϴ�");
		new CryableEx().cry();
	}
	//��øŬ����:Ŭ�����ȿ��� �� �ٸ� Ŭ������ ����
	// Eagle$CryableEx.class
	class CryableEx extends Cryable{
		@Override
		public void cry(){
			System.out.println("ļ�� ļ��~~");
		}
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		new Eagle().fly();
	}
}
*/



