package tv2;

public class LgTv implements Tv{
	@Override
	public void powerOn() {
		System.out.println("LG TV - ������ �Ҵ�");
	}
	@Override
	public void powerOff() {
		System.out.println("LG TV - ������ ����");
	}
	@Override
	public void soundUp() {
		System.out.println("LG TV - �Ҹ��� ���δ�");
	}
	@Override
	public void soundDown() {
		System.out.println("LG TV - �Ҹ��� �����");
	}
}
