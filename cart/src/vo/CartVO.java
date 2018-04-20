package vo;

public class CartVO {
	private int code;
	private int amount;
	public CartVO() {
		// TODO Auto-generated constructor stub
	}
	public CartVO(int code, int amount) {
		super();
		this.code = code;
		this.amount = amount;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
