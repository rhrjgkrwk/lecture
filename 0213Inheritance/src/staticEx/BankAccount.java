package staticEx;

public class BankAccount {
	private int year;
	private String name;
	private int money;
	private static double rate;

	public BankAccount(int year, String name, int money, double r) {
		this.year = year;
		this.name = name;
		this.money = money;
		rate = r;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		if (rate < 0.02 || rate > 0.12) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!∂—µ–!!±›∏Æ»Æ¿Œ ø‰∏¡");
			System.exit(0);
		}
		BankAccount.rate = rate;
	}

	public void view() {
		System.out.println(year + " " + name + " " + money + " " + rate);
	}
}
