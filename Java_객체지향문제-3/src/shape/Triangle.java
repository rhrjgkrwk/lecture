package shape;

public class Triangle extends Shape implements Resize {
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(int width, int height, String color) {
		super(width, height, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double)this.getHeight()*this.getWidth()/2;
	}
	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		this.setHeight(this.getHeight()+size);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangle";
	}
}
