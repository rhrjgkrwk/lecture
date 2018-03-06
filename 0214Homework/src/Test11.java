abstract class Circle{
	protected int r;
	protected double size;
	protected final double PI = 3.141592;
	
	public Circle(int r) {
		this.r = r;
	}
	
	abstract void compute();
	abstract void output();
}
class CircleArea extends Circle{
	public CircleArea(int r) {
		super(r);
	}
	
	@Override
	public void compute() {
		size = (double)Math.pow(r, 2)*PI;
	}
	@Override
	void output() {
		System.out.println("���ǳ��� : "+size);
	}
}
class CircleRound extends Circle{
	public CircleRound(int r) {
		super(r);
	}
	@Override
	public void compute() {
		size = (double)r*2*PI;
	}
	@Override
	void output() {
		System.out.println("���ǵѷ� : "+size);
	}
}
public class Test11 {
	public static void main(String[] args) {
		CircleArea   ob1 = new CircleArea(10);
        ob1.compute();
        ob1.output();

        CircleRound  ob2 = new CircleRound(10);
        ob2.compute();
        ob2.output();
	}
}

/*
[����11] �������̵带 �̿��Ͽ� ���� ���α׷��� �ۼ��Ͻÿ�

(1)Ŭ������: Circle(�߻�Ŭ����)
    #r:int        
    #size:double     
    #PI:double           ==> �ʱⰪ 3.14, final
   +Circle(r:int)          ==> ������ ����
   +compute():void    ==> �߻�޼���     
   +output():void       ==> �߻�޼���

(2)Ŭ������ :  CircleArea     ==> CircleŬ������ ����Ͻÿ�
   +CircleArea(r:int)
   +compute():void      ==> ���� ����=������ *������*3.141592
   +output():void         ==> ���      
       
(3)Ŭ������ :  CircleRound    ==> CircleŬ������ ����Ͻÿ�
   +CircleRound(r:int)
   +compute():void      ==>���ǵѷ�=������ * 2 * 3.141592
   +output():void         ==>���

(4)main()�Լ�����
   public static void main(String[] args){
        CircleArea   ob1 = new CircleArea(10);
        ob1.compute();
        ob1.output();

        CircleRound  ob2 = new CircleRound(10);
        ob2.compute();
        ob2.output();
   }
[������]
���ǳ��� : 314.1592
���ǵѷ� : 62.83184
*/