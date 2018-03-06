package test3;

public class Account {
	private int balance;
	
	public Account(int balance) { //통장 초기값
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money){//입금
		balance +=money;
	}
	public void withdraw(int money){ //출금
		if (balance>=money) {
			balance -=money;
		}
	}
	
}
