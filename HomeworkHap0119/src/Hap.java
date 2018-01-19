
public class Hap {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			if (i!=1) System.out.print("+");
			System.out.print("(");
			for (int j = 1; j < i+1; j++) {
				sum+=j;
				System.out.print(j);
				if (j!=i) System.out.print("+");
			}
			System.out.print(")");
		}
		System.out.println();
		System.out.println("="+sum);
	}
}
