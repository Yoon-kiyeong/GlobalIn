package com.my;
/*
 * �Ʒ��� main()�޼ҵ带 �����Ͽ� ���� ��� ���� TV Ŭ������ �ۼ��ϴ� ���α׷��� �����Ͻÿ�
 * public static void main(String[] args) {
	TV myTV = new TV("LG",2023,32);// LG���� ���� 2023�� 32��ġ
	myTV.show();
	}
 */

class TV {
	private String company;
	private int year;
	private int inch;

	public TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;

	}

	public void show() {
		System.out.println(company + "���� ���� " + year + "���� " + inch + "��ġ TV");

	}

}

public class Main01 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2023, 32);
		myTV.show();
	}
}
