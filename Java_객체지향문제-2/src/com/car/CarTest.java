package com.car;

public class CarTest {
	public static void main(String[] args) {
		// Car type�� ��ü �迭�� 2�� �����
		Car []c = new Car[2];
		// �迭�� ��뵥���Ϳ��� ������ 2���� Car ��ü�� �ִ´�.
		c[0] = new L3("L3","1500",50,25,0);
		c[1] = new L5("L5","2000",75,35,0);
		// ������ �ڵ����� �⺻ ���� ���
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature \n"
				+ "-----------------------------------------------------------------------------------------------------------------");
		for (Car car : c) {
			int temp = (car instanceof L5)?((L5)car).getTempGage():((L3)car).getTempGage();
			System.out.println("\t"+car.getName()+" \t\t "+car.getEngine()+" \t\t "+car.getOilTank()+" \t\t "+car.getOilSize()+" \t\t "+car.getDistance()+" \t\t "+temp);
		}
		// ������ �ڵ����� 25�� ���� �Ѵ�
		System.out.println("25 ����");
		for (Car car : c) {
			car.setOil(25);
		}
		// 25�� ������ �ڵ����� ������ ��� �Ѵ�
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature \n"
				+ "-----------------------------------------------------------------------------------------------------------------");
		for (Car car : c) {
			int temp = (car instanceof L5)?((L5)car).getTempGage():((L3)car).getTempGage();
			System.out.println("\t"+car.getName()+" \t\t "+car.getEngine()+" \t\t "+car.getOilTank()+" \t\t "+car.getOilSize()+" \t\t "+car.getDistance()+" \t\t "+temp);
		}
		// ������ �ڵ����� 80�� ���� �Ѵ�
		System.out.println("80 ����");
		for (Car car : c) {
			car.go(80);
		}
		// 80�� ������ ������ ��� �ϸ� �����µ� ������ ��� �Ѵ�
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature \n"
				+ "-----------------------------------------------------------------------------------------------------------------");
		for (Car car : c) {
			int temp = (car instanceof L5)?((L5)car).getTempGage():((L3)car).getTempGage();
			System.out.println("\t"+car.getName()+" \t\t "+car.getEngine()+" \t\t "+car.getOilTank()+" \t\t "+car.getOilSize()+" \t\t "+car.getDistance()+" \t\t "+temp);
		}
	}
}
