package test02;

interface Ver{
	public String call(String name);
}

public class LambdaEx5 {
	public static void main(String[] args) {
		Ver m1 = (String name)->{
			return "Java : "+name;
		};

		System.out.println(m1.call("ver 8.0 "));
		
		m1 = (String name)->{
			return "Spring : "+name;
		};
		System.out.println(m1.call("ver 5.0 "));
	}
}
