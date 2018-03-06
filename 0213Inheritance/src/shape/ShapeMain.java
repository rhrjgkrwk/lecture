package shape;

public class ShapeMain {
	public static void main(String[] args) {
//		Rectangle r = new Rectangle(4,5);
//		System.out.println(r.getSize());
//		Triangle t = new Triangle(3,7);
//		System.out.println(t.getSize());
		Shape ob = null;
		ob= new Rectangle(4,5);
		System.out.println(ob.getSize());
		ob= new Triangle(3,7);
		System.out.println(ob.getSize());
	}
}
