package tv2;

public class SamsungTv implements Tv{
	@Override
	public void powerOn() {
		System.out.println("SAMSUNG TV - ������ �Ҵ�");
	}
	@Override
	public void powerOff() {
		System.out.println("SAMSUNG TV - ������ ����");
	}
	@Override
	public void soundUp() {
		System.out.println("SAMSUNG TV - �Ҹ��� ���δ�");
	}
	@Override
	public void soundDown() {
		System.out.println("SAMSUNG TV - �Ҹ��� �����");
	}
}
