package test3;

public class Account {
	private int balance;
	
	public Account(int balance) { //���� �ʱⰪ
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money){//�Ա�
		balance +=money;
	}
	public void withdraw(int money){ //���
		if (balance>=money) {
			balance -=money;
		}
	}
	
}
