package test4;



public class BendingMachine {
	private int money;
	public void insertCoin(int money){
		if (money<0) {
			throw new RuntimeException("zero or negative money "+money);
		}
		this.money+=money;
	}
	public int getCurrent(){
		return money;
	}
}
