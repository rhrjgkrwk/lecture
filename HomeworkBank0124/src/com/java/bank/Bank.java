package com.java.bank;

/*
��������� ��ü�������� ������!
	- .java�� 2�� ����
		- main - Bank.java
		- BankAccount.java
			- int balance
			- static double interestRate = 0.05; 
			- withdraw method
			- deposit method
			- getter/setter
			- static int interestCalculator - return �ܾ�*interestRate;
			  �� ���࿡���� �Ա��� ������ (���� �Աݾ�+���� �ܾ�)*���� �� �� �Աݵȴ�.
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
