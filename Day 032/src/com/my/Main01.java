package com.my;
/*
 * 아래의 main()메소드를 실행하여 얻은 결과 토대로 TV 클래스를 작성하는 프로그램을 구현하시오
 * public static void main(String[] args) {
	TV myTV = new TV("LG",2023,32);// LG에서 만든 2023년 32인치
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
		System.out.println(company + "에서 만든 " + year + "년형 " + inch + "인치 TV");

	}

}

public class Main01 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2023, 32);
		myTV.show();
	}
}
