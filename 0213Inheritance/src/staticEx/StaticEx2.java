package staticEx;

public class StaticEx2 {
	public static void main(String[] args) {
		System.out.println(" ** �Ա� ����� �ݸ� ** ");
		BankAccount ob1 = new BankAccount(1995, "kim", 1000, 0.07);
		BankAccount ob2 = new BankAccount(1998, "lee", 1000, 0.08);
		BankAccount ob3 = new BankAccount(2006, "choi", 1000, 0.12);
		
		System.out.println(" ** 2006���� �ݸ� ** ");
		ob1.view();
		ob2.view();
		ob3.view();
		
		System.out.println(" ** 0.04�� ������ �ݸ� ** ");
		BankAccount.setRate(0.04);
		ob1.view();
		ob2.view();
		ob3.view();
		BankAccount.setRate(0.4);
	}
}
