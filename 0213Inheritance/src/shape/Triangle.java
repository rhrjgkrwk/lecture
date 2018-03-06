package shape;

public class Triangle extends Shape{
	public Triangle() {
	}
	public Triangle(int data1, int data2) {
		super(data1, data2);
	}
	@Override
	public double getSize() {
		// TODO Auto-generated method stub
		return (double)super.getData1()*super.getData2()/2.0;
	}
}
