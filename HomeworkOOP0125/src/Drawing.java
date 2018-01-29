/*

<출력결과>
		사각형에 색을 아름답게 칠합니다.
		사각형을 10, 10에서 그립니다
		타원형에 색을 아름답게 칠합니다.
		타원형을 20, 20에서 그립니다
		원그리자
		선그리자
		사각형에 색을 아름답게 칠합니다.
		사각형을 10, 10에서 그립니다
		타원형에 색을 아름답게 칠합니다.
		타원형을 20, 20에서 그립니다
		원그리자
		선그리자
		
		
		 inteface : 
		      ShapeTable (color메서드, draw메소드))

		    abstract :
		       Shape(추상 color, draw)
		      생성자, this()사용
		     
		  Circle , Rectangle , Ellipse 클래스들을 사용한다
		             
		   Shape배열도 사용한다 
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
		if (this.x==0&&this.y==0) System.out.println("원을 그립니다.");	
		else System.out.println("원을 "+this.x+", "+this.y+"에 그립니다.");
	}
	public void color() {
		System.out.println("원을 색칠한다.");
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
		if (this.x==0&&this.y==0) System.out.println("사각형을 그립니다.");	
		else System.out.println("사각형을 "+this.x+", "+this.y+"에 그립니다.");
	}
	public void color() {
		System.out.println("사각형을 색칠한다.");
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
		if (this.x==0&&this.y==0) System.out.println("타원을 그립니다.");	
		else System.out.println("타원을 "+this.x+", "+this.y+"에 그립니다.");
	}
	public void color() {
		System.out.println("타원을 색칠한다.");
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
		if (this.x==0&&this.y==0) System.out.println("선을 그립니다.");	
		else System.out.println("선을 "+this.x+", "+this.y+"에 그립니다.");
	}
	public void color() {
		System.out.println("선을 색칠한다.");
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
