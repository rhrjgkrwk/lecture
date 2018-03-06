package shape;

public class Rectangle extends Shape{
	public Rectangle() {
	}
	public Rectangle(int data1, int data2) {
		super(data1, data2);
	}
	@Override
	public double getSize() {
		// TODO Auto-generated method stub
		return (double)super.getData1()*super.getData2();
	}
}
