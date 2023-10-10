package com.Generic;

enum City {
	SEOUL("����", 1000), BUSAN("�λ�", 350), DAEGU("�뱸", 250), INCHEON("��õ", 200);

	private final String cityName;
	private final int ingu;

	City(String cityName, int ingu) {
		this.cityName = cityName;
		this.ingu = ingu;

	}

	public String getCityName() {
		return cityName;
	}

	public int getIngu() {
		return ingu;
	}

}

public class EnumTest3 {

	public static void main(String[] args) {
		System.out.println("���� �α� : " + City.SEOUL.getIngu() + "�� ��");
		
		for(City c : City.values())
			System.out.printf("%s(%s) : %d%n", c , c.getCityName(), c.getIngu());
	}
}
