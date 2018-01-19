//지구에서의 몸구게가 어느 별에서는 12.4%로 감소한다고 한다. 120kg가 그 별에서는?
public class Weight {
	public static void main(String[] args) {
		int weight = 120;
		double weight2 = weight*0.124;
		System.out.println("120kg이 그별에서는"+weight2+"kg");
		aaa(weight);		
	}
	public static void aaa(int a){ //static 객체 생성 필요여부
		System.out.printf("아이우에오아이우에오%.2f\n",a*0.124);
		System.out.println(a*0.124);
	}
}

//°F = °C × 1.8 + 32