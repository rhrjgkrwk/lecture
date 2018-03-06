package shape;

public class Rectangle extends Shape implements Resize{

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, String color) {
		super(width, height, color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double)this.getHeight()*this.getWidth();
	}
	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		this.setWidth(this.getWidth()+size);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}
}
