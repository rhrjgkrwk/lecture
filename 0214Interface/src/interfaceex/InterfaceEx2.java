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
		System.out.println("독수리는 날아 다닙니다");
		this.cry();
	}
	public void cry(){
		System.out.println("캬약 캬약~~");
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
		System.out.println("독수리는 날아 다닙니다");
		new CryableEx().cry();
	}
	//중첩클래스:클래스안에서 또 다른 클래스를 구현
	// Eagle$CryableEx.class
	class CryableEx extends Cryable{
		@Override
		public void cry(){
			System.out.println("캬약 캬약~~");
		}
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		new Eagle().fly();
	}
}
*/



