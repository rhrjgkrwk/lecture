package com.java.oop; //��Ű�� �ּ��� 3�ܰ�� ��������.


public class Danche {
	private String danName;
	private int inwon;
	
	public Danche(String danName, int inwon) { //���c��
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
	public int totalFee(){//�Ѵ�ü�� ��ݰ�� �ޙ�
		return 5000*inwon;
	}
	
}
