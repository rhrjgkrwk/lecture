/*

<��°��>
		�簢���� ���� �Ƹ���� ĥ�մϴ�.
		�簢���� 10, 10���� �׸��ϴ�
		Ÿ������ ���� �Ƹ���� ĥ�մϴ�.
		Ÿ������ 20, 20���� �׸��ϴ�
		���׸���
		���׸���
		�簢���� ���� �Ƹ���� ĥ�մϴ�.
		�簢���� 10, 10���� �׸��ϴ�
		Ÿ������ ���� �Ƹ���� ĥ�մϴ�.
		Ÿ������ 20, 20���� �׸��ϴ�
		���׸���
		���׸���
		
		
		 inteface : 
		      ShapeTable (color�޼���, draw�޼ҵ�))

		    abstract :
		       Shape(�߻� color, draw)
		      ������, this()���
		     
		  Circle , Rectangle , Ellipse Ŭ�������� ����Ѵ�
		             
		   Shape�迭�� ����Ѵ� 
*/

interface ShapeTable {
	void color();
	void draw();
}

abstract class Shape implements ShapeTable {
	protected int x;
	protected int y;

	public Shape() {
		this.x = 0;
		this.y = 0;
	}
	public Shape(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
}

class Circle extends Shape {
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Circle(int x, int y) {
		super(x,y);
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		if (this.x==0&&this.y==0) System.out.println("���� �׸��ϴ�.");	
		else System.out.println("���� "+this.x+", "+this.y+"�� �׸��ϴ�.");
	}
	public void color() {
		System.out.println("���� ��ĥ�Ѵ�.");
	}
}

class Rectangle extends Shape {
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int x, int y) {
		super(x,y);
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		if (this.x==0&&this.y==0) System.out.println("�簢���� �׸��ϴ�.");	
		else System.out.println("�簢���� "+this.x+", "+this.y+"�� �׸��ϴ�.");
	}
	public void color() {
		System.out.println("�簢���� ��ĥ�Ѵ�.");
	}
}

class Ellipse extends Shape {
	public Ellipse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ellipse(int x, int y) {
		super(x,y);
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		if (this.x==0&&this.y==0) System.out.println("Ÿ���� �׸��ϴ�.");	
		else System.out.println("Ÿ���� "+this.x+", "+this.y+"�� �׸��ϴ�.");
	}
	public void color() {
		System.out.println("Ÿ���� ��ĥ�Ѵ�.");
	}
}

class Line extends Shape {
	public Line() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Line(int x, int y) {
		super(x,y);
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		if (this.x==0&&this.y==0) System.out.println("���� �׸��ϴ�.");	
		else System.out.println("���� "+this.x+", "+this.y+"�� �׸��ϴ�.");
	}
	public void color() {
		System.out.println("���� ��ĥ�Ѵ�.");
	}
}

public class Drawing {
	public static void main(String[] args) {
		Shape shape[] = new Shape[8];
		shape[0] = new Rectangle();
		shape[1] = new Circle();
		shape[2] = new Ellipse();
		shape[3] = new Line();
		shape[4] = new Rectangle(20,20);
		shape[5] = new Circle(20,20);
		shape[6] = new Ellipse(20,30);
		shape[7] = new Line(40,50);
		
		for (int i = 0; i < shape.length; i++) {
			shape[i].draw();
			shape[i].color();
		}
	}
}
