package com.my;

import java.util.Scanner;

/*
 * 문]
 * 	Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력ㅂ다아 5만원, 1만원, 1천원, 500원, 100원, 50원, 10원, 1원은 각각 몇 개 인지 구현하시오
 */
public class Main12 {
	public static void main(String[] args) {
		int money;
		int C50000 = 0;
		int C10000 = 0;
		int C1000 = 0;
		int C500 = 0;
		int C100 = 0;
		int C50 = 0;
		int C10 = 0;
		int C1 = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하시오 : ");
		money = s.nextInt();

		C50000 = money / 50000;
		money = money % 50000;
		if (C50000 != 0)
			System.out.println("오만원권 " + C50000 + "매");

		C10000 = money / 10000;
		money = money % 10000;
		if (C10000 != 0)
			System.out.println("만원권 " + C10000 + "매");

		C1000 = money / 1000;
		money = money % 1000;
		if (C1000 != 0)
			System.out.println("천원권 " + C1000 + "매");

		C500 = money / 500;
		money = money % 500;
		if (C500 != 0)
			System.out.println("오백원 " + C500 + "개");

		C100 = money / 100;
		money = money % 100;
		if (C100 != 0)
			System.out.println("백원 " + C100 + "개");

		C50 = money / 50;
		money = money % 50;
		if (C50 != 0)
			System.out.println("오십원 " + C50 + "개");

		C10 = money / 10;
		money = money % 10;
		if (C10 != 0)
			System.out.println("십원 " + C10 + "개");

		C1 = money / 1;
		money = money % 1;
		if (C1 != 0)
			System.out.println("일원 " + C1 + "개");

	}
}
