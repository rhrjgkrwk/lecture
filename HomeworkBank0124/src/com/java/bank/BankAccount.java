package com.java.bank;

public class BankAccount {
	static double interestRate = 0.05; //static var
	private int balance;
	
	//constructor
	public BankAccount(){
		System.out.println("���°� �����Ǿ����ϴ�. �ܾ��� "+balance+"�� �Դϴ�.");
	}
	public BankAccount(int balance) {
		this.balance = balance;
		System.out.println("���°� �����Ǿ����ϴ�. �ܾ��� "+balance+"�� �Դϴ�.");
	}
	
	//Getter - Setter
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	// withdraw deposit
	public void withdraw(int money){ //money = ��� �ҸӴ�
		System.out.println(money+"���� ����մϴ�.");
		if (money>balance) {
			System.out.println("�ܾ� ����!!");
		}
		else{
			balance-=money;
			System.out.println("���� �ܾ��� "+balance+"�� �Դϴ�.");
		}
	}
	public void deposit(int money){ //���� �Աݾ��� ���ڷ� �޴´�.
		System.out.println(money+"���� �Ա��մϴ�. ������"+interestRate+"% �Դϴ�.");
		balance = interestCalculator(money+balance);//�Աݾװ� ���� �ܾ��� ���ؼ� �Ѱ��ش�.
		System.out.println("���� �ܾ��� "+balance+"�� �Դϴ�.");
	}
	
	//static method
	public static int interestCalculator(int money){
		return (int)(money*interestRate + money); //������ �ݿ��� ���� ���� �Ҽ����� ����.
	}
}
