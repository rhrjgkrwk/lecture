package atm;

public class ATMTest {
	public static void main(String[] args) {
		Bank bank=new Bank();
		Thread mom=new Thread(bank, "����");
		Thread son=new Thread(bank, "�Ƶ�");
		
		mom.start();
		son.start();
	}
}
