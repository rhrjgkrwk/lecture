package test02;

@FunctionalInterface
interface Item{
	public String getItem();
}

public class LambdaEx4 {
	public static void main(String[] args) {
		Item ob = () -> {return "��ǻ��";};
		System.out.println(ob.getItem());
		ob = () -> {return "������";};
		System.out.println(ob.getItem());
		ob = () -> {return "��ǻ��";};
		ob = () -> {return "��ǻ��";};
	}
}
