package shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[]{
				new Triangle(7,5,"Blue"),
				new Rectangle(4,6,"Blue"),
				new Triangle(6,7,"Red"),
				new Rectangle(8,3,"Red"),
				new Triangle(9,8,"White"),
				new Rectangle(5,7,"White")
		};
		// (1.����)���� �־��� �����͸� ������� Shape type�� ��ü�� ���� �Ͽ�
		// 6���� ���� ��ü�� �迭�� �ִ´�.
		
		// ��� ��ü�� ���� ������ ���� ������ for Loop�� �̿��Ͽ� ȭ�鿡 ��� �Ѵ�
		System.out.println("�⺻����");
		for (Shape s : shape) {
			System.out.println(s+"\t"+s.getArea()+"\t"+s.getColor());
		}
		// ��� ��ü���� setResize�Լ��� �̿��Ͽ� 5�� �Է� �ϰ� ����� ���� ��
		for (Shape s : shape) {
			if (s instanceof Rectangle) {
				((Rectangle)s).setResize(5);
			}
			else {
				((Triangle)s).setResize(5);
			}
		}
		// ȭ�鿡 ��� �Ѵ�. �� for Loop���� �̿��Ѵ�.
		System.out.println("������ ���� ��");
		for (Shape s : shape) {
			System.out.println(s+"\t"+s.getArea()+"\t"+s.getColor());
		}
	}
}


