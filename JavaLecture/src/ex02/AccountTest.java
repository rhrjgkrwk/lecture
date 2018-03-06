package ex02;

public class AccountTest {
	public static void main(String[] args) {
		
		// account객체생성
		Account account = new Account("441-0290-1203", 500000, 7.3);
		// account 기본 정보 출력
		System.out.println(account);
		// account에서 600000원출금
		account.withdraw(600000);
		//account에 20000원 입금
		account.deposit(20000);
		//account 변경정보 출력
		System.out.println(account);
		//이자 출력 – 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력한다.
		System.out.println("이자 : "+account.calculateInterest());
	}
}
