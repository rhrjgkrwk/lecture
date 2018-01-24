package com.java.oop; //패키지 최소한 3단계는 내려가자.


public class Danche {
	private String danName;
	private int inwon;
	
	public Danche(String danName, int inwon) { //쉥쉉좌
		//super();
		this.danName = danName;
		this.inwon = inwon;
	}
	
	//gettersetter
	public String getDanName() {
		return danName;
	}
	public void setDanName(String danName) {
		this.danName = danName;
	}
	public int getInwon() {
		return inwon;
	}
	public void setInwon(int inwon) {
		this.inwon = inwon;
	}
	public int totalFee(){//한단체의 요금계산 메솓
		return 5000*inwon;
	}
	
}
