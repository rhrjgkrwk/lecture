import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Sales{
	protected String article;
	protected int qty;
	protected int cost;
	static protected int cnt=0;
	static protected double discount;
	public Sales() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated constructor stub
		try {
			System.out.print("ǰ���� �Է��Ͻÿ�\t : ");
			this.article = br.readLine();
			System.out.print("������ �Է��Ͻÿ�\t : ");
			this.qty = Integer.parseInt(br.readLine());
			cnt += qty;
			System.out.print("�ܰ��� �Է��Ͻÿ�\t : ");
			this.cost = Integer.parseInt(br.readLine());
			br.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class Test10 extends Sales{
	private int amount;
	public void setProcess(){
		amount = qty * cost;
	}
	public void getDisplay(){ //���
		setProcess();
		System.out.println(article+"\t"+(int)(amount*(1-discount))+"��");
	}
	public static void setDiscount(double d){
		discount = d;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Test10  []op = new Test10[2];
		op[0] = new Test10();
		op[1] = new Test10();
		System.out.print("�������� �Է��ϼ��� : ");
		setDiscount(Double.parseDouble(s.nextLine()));
		System.out.println("[[�ǸŰ�]]");
		for (Test10 t : op) {
			t.getDisplay();
		}
		System.out.println("�Ǹż��� : "+cnt);
		s.close();
	}
}
