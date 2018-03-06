package com.car;

public class L5 extends Car implements Temp{
	 public L5() {
			// TODO Auto-generated constructor stub
		}

		public L5(String name, String engine, int oilTank, int oilSize, int distance) {
			super(name, engine, oilTank, oilSize, distance);
			oilSize = oilTank/2;
			// TODO Auto-generated constructor stub
		}
		@Override
		public void go(int distance) { //8주행시 오일 1감소
			// TODO Auto-generated method stub
			this.setDistance(this.getDistance()+distance);
			this.setOil(-distance/8);
		}
		@Override
		public void setOil(int oilSize) {
			// TODO Auto-generated method stub
			this.setOilSize(this.getOilSize()+oilSize);
		}
		@Override
		public int getTempGage() { //엔진온도 리턴 & 5주행시 엔진온도 1증가
			// TODO Auto-generated method stub
			return this.getDistance()/5;
		}
}
