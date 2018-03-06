package test3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	private Account account;
	@Test
	public void testAccount() throws Exception{
		if (account==null) {
			throw new Exception("계좌생성실패");
		}
		System.out.println("testAccount");
	}
	@Before //각각의 Test 직전에 수행된다.
	public void setUP(){
		account = new Account(100000);
		System.out.println("setUP");
	}
	@Test
	public void testGetBalance() throws Exception{
		System.out.println("testGetBalance");
		assertEquals(100000, account.getBalance());
	
		account = new Account(50000);
		assertEquals(50000, account.getBalance());
		
		account = new Account(0);
		assertEquals(0, account.getBalance());
		
	}
	@Test
	public void testDeposit() throws Exception{
		account.deposit(3000);
		System.out.println("testDeposit");
		assertEquals(3000, account.getBalance());
	}
	@Test
	public void testWithdraw() throws Exception{
		account.withdraw(2000);
		System.out.println("testWithdraw");
		assertEquals(101000, account.getBalance());
	}
}
