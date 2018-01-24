package com.java.bank;

public class BankAccount {
	static double interestRate = 0.05; //static var
	private int balance;
	
	//constructor
	public BankAccount(){
		System.out.println("계좌가 생성되었습니다. 잔액은 "+balance+"원 입니다.");
	}
	public BankAccount(int balance) {
		this.balance = balance;
		System.out.println("계좌가 생성되었습니다. 잔액은 "+balance+"원 입니다.");
	}
	
	//Getter - Setter
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	// withdraw deposit
	public void withdraw(int money){ //money = 출금 할머니
		System.out.println(money+"원을 출금합니다.");
		if (money>balance) {
			System.out.println("잔액 부족!!");
		}
		else{
			balance-=money;
			System.out.println("현재 잔액은 "+balance+"원 입니다.");
		}
	}
	public void deposit(int money){ //현재 입금액을 인자로 받는다.
		System.out.println(money+"원을 입금합니다. 이율은"+interestRate+"% 입니다.");
		balance = interestCalculator(money+balance);//입금액과 기존 잔액을 더해서 넘겨준다.
		System.out.println("현재 잔액은 "+balance+"원 입니다.");
	}
	
	//static method
	public static int interestCalculator(int money){
		return (int)(money*interestRate + money); //이율이 반영된 돈을 리턴 소수점은 제거.
	}
}
