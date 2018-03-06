package ex02;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	//기본 생성자
	public Account() {
	}
	//3개의 클래스 변수를 받는 생성자
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
//		출금을 통해 잔액정보를 감소 시킨다
//		단, 출금을 통해 잔액이 0보다 작으면
//		“출금 할 수 없습니다.”를 출력한다.
		if (balance>=money) {
			balance-=money;
		}
		else{
			System.out.println("출금할 수 없습니다.");
		}
	}
	public void deposit(int money) { //입금을 통해 잔액정보를 증가시킨다
		balance += money;
	}
	public double calculateInterest(){ //현재 잔액을 기준으로 이자를 계산한다
		return balance*interestRate/100; 
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "계좌정보 : "+getAccount()+" 현재잔액 : "+getBalance()
		;
	}
}
