package inheritance;

class Branch{
	public Branch() {
		// TODO Auto-generated constructor stub
		//this("������");
		System.out.println("Branch D cons");
	}
	
	public Branch(String str) {
		// TODO Auto-generated constructor stub
		
		System.out.println(str+"Branch Cons");
		
	}
	
}

class Leaf extends Branch{
	public Leaf() {
		// TODO Auto-generated constructor stub
		System.out.println("ddd");
	}
	public Leaf(String str, int a) {
		// TODO Auto-generated constructor stub
		//super("�����ٶ󸶹ٻ�");
		this();
		
		System.out.println(str+a+" Leaf Cons");
	}
} 
public class InheritanceEx4 {
	public static void main(String[] args) {
		Leaf l = new Leaf("������", 10);
	}
}
