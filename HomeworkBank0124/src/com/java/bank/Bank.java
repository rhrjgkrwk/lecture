package com.java.bank;

/*
은행업무를 객체지향으로 만들어보자!
	- .java를 2개 생성
		- main - Bank.java
		- BankAccount.java
			- int balance
			- static double interestRate = 0.05; 
			- withdraw method
			- deposit method
			- getter/setter
			- static int interestCalculator - return 잔액*interestRate;
			  이 은행에서는 입금할 때마다 (현재 입금액+기존 잔액)*이율 이 더 입금된다.
*/

public class Bank {
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(1500);
		
		a1.deposit(50000);
		a1.withdraw(2000);
		a1.withdraw(12123123);
		a1.deposit(50000);
		for (int i = 0; i < 100; i++) {
			a1.deposit(1);
		}
	}
}
