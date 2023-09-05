package com.my;

import java.util.Scanner;

/*
 * 커피 메뉴의 가격을 알려주는 프로그램을 구현하시오
 * 커피종류: 에스프레소, 카푸치노, 카페라떼는 3,500원이고, 아메리카노는 2000원임
 */
public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴를 선택해주세요");
		String menu = sc.next();
		int money = 10000;
		
		switch (menu) {
		case "에스프레소":
			money = money - 3500;
			System.out.println("에스프레소가 나왔습니다");
			System.out.println("잔액 : " + money);
			break;
		case "카푸치노":
			money = money - 3500;
			System.out.println("카푸치노가 나왔습니다");
			System.out.println("잔액 : " + money);
			break;
		case "카페라떼":
			money = money - 3500;
			System.out.println("카페라떼가 나왔습니다");
			System.out.println("잔액  : " + money);
			break;
		case "아메리카노":
			money = money - 2000;
			System.out.println("아메리카노가 나왔습니다");
			System.out.println("잔액 : " + money);
		} 
	}
}
