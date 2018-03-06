package abstractEx;

abstract class Shape{
	abstract public void onDraw();
	abstract public void onErase();
}

//---------------------------------------------------------------------
class Rectangle extends Shape{

	@Override
	public void onDraw() {
System.out.println("�簢���� �׸���");		
	}

	@Override
	public void onErase() {
	System.out.println("�簢���� �����.");
	}
	
}

//-----------------------------------------------------------------------
class Circle extends Shape{

	@Override
	public void onDraw() {
		System.out.println("���� �׸���");		
		
	}

	@Override
	public void onErase() {
		System.out.println("���� �����.");
		
	}
	
}

//-----------------------------------------------------------------------
public class AbstractEx2 {

	public static void main(String[] args) {
		Shape ob= new Rectangle();
		ob.onDraw();
		ob.onErase();
		
		ob= new Circle();
		ob.onDraw();
		ob.onErase();
	}

}
