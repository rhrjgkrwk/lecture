package ex02;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	//�⺻ ������
	public Account() {
	}
	//3���� Ŭ���� ������ �޴� ������
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void withdraw(int money) {
//		����� ���� �ܾ������� ���� ��Ų��
//		��, ����� ���� �ܾ��� 0���� ������
//		����� �� �� �����ϴ�.���� ����Ѵ�.
		if (balance>=money) {
			balance-=money;
		}
		else{
			System.out.println("����� �� �����ϴ�.");
		}
	}
	public void deposit(int money) { //�Ա��� ���� �ܾ������� ������Ų��
		balance += money;
	}
	public double calculateInterest(){ //���� �ܾ��� �������� ���ڸ� ����Ѵ�
		return balance*interestRate/100; 
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�������� : "+getAccount()+" �����ܾ� : "+getBalance()
		;
	}
}
