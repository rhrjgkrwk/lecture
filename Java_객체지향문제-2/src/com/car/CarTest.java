package com.car;

public class CarTest {
	public static void main(String[] args) {
		// Car type의 객체 배열을 2개 만든다
		Car []c = new Car[2];
		// 배열에 사용데이터에서 제공된 2개의 Car 객체를 넣는다.
		c[0] = new L3("L3","1500",50,25,0);
		c[1] = new L5("L5","2000",75,35,0);
		// 생성된 자동차의 기본 정보 출력
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature \n"
				+ "-----------------------------------------------------------------------------------------------------------------");
		for (Car car : c) {
			int temp = (car instanceof L5)?((L5)car).getTempGage():((L3)car).getTempGage();
			System.out.println("\t"+car.getName()+" \t\t "+car.getEngine()+" \t\t "+car.getOilTank()+" \t\t "+car.getOilSize()+" \t\t "+car.getDistance()+" \t\t "+temp);
		}
		// 각각의 자동차에 25씩 주유 한다
		System.out.println("25 주유");
		for (Car car : c) {
			car.setOil(25);
		}
		// 25씩 주유한 자동차의 정보를 출력 한다
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature \n"
				+ "-----------------------------------------------------------------------------------------------------------------");
		for (Car car : c) {
			int temp = (car instanceof L5)?((L5)car).getTempGage():((L3)car).getTempGage();
			System.out.println("\t"+car.getName()+" \t\t "+car.getEngine()+" \t\t "+car.getOilTank()+" \t\t "+car.getOilSize()+" \t\t "+car.getDistance()+" \t\t "+temp);
		}
		// 각각의 자동차에 80씩 주행 한다
		System.out.println("80 주행");
		for (Car car : c) {
			car.go(80);
		}
		// 80씩 주행한 정보를 출력 하며 엔짂온도 정보를 출력 한다
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature \n"
				+ "-----------------------------------------------------------------------------------------------------------------");
		for (Car car : c) {
			int temp = (car instanceof L5)?((L5)car).getTempGage():((L3)car).getTempGage();
			System.out.println("\t"+car.getName()+" \t\t "+car.getEngine()+" \t\t "+car.getOilTank()+" \t\t "+car.getOilSize()+" \t\t "+car.getDistance()+" \t\t "+temp);
		}
	}
}
