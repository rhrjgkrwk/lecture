package com.car;

public class L3 extends Car implements Temp{
	 public L3() {
		// TODO Auto-generated constructor stub
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		oilSize = oilTank/2;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void go(int distance) { //10����� ���� 1����
		// TODO Auto-generated method stub
		this.setDistance(this.getDistance()+distance);
		this.setOil(-distance/10);
	}
	@Override
	public void setOil(int oilSize) {
		// TODO Auto-generated method stub
		this.setOilSize(this.getOilSize()+oilSize);
	}
	@Override
	public int getTempGage() { //�����µ� ���� & 10����� �����µ� 1����
		// TODO Auto-generated method stub
		return this.getDistance()/10;
	}
}
