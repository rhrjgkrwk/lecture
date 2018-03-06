package test4;

import java.util.function.BiFunction;

class Calc{
	public static int sum(int a, int b){return a+b;}
	public static double sum(double a, double b){return a+b;}
	public static float sum(float a, float b){return a+b;}
}

public class StreamEx4 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> rs = Calc::sum; //������� ����1����2 ���, static�� �ƴ� ��� �ν��Ͻ��� �־�����.
		int s = rs.apply(2, 154);
		System.out.println(s);
		BiFunction<Double, Double, Double> rs1 = (a,b)->(a+b);//Calc::sum; //������� ����1����2 ���, static�� �ƴ� ��� �ν��Ͻ��� �־�����.
		double s1 = rs1.apply(2.2, 15.4);
		System.out.println(s1);
	}
}
