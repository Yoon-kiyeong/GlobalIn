package com.my;

import java.util.Scanner;

/*
 * while문을 사용하여 메뉴가 콜라, 사이다, 마운틴, 초코송이, 에이스, 웨하스가 나오는 자판기 프로그램을 출력하라
 * 단, 0을 입력하면 종료하고 메뉴가 없을 경우 메뉴가 없습니다.
 */
public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("콜라-1, 사이다-2, 마운틴-3, 초코송이-4, 에이스-5, 웨하스-6(0종료)");

			int menu = sc.nextInt();

			if (menu == 0) {
				System.out.println("종료");
				break;
			} else if (!(1 <= menu && menu <= 6)) {
				System.out.println("메뉴가 없습니다");
				continue;
			}
			if (menu == 1) {
				System.out.println("콜라");
				continue;
			} else if (menu == 2) {
				System.out.println("사이다");
				continue;
			} else if (menu == 3) {
				System.out.println("마운틴");
				continue;
			} else if (menu == 4) {
				System.out.println("초코송이");
				continue;
			} else if (menu == 5) {
				System.out.println("에이스");
				continue;
			} else if (menu == 6) {
				System.out.println("웨하스");
				continue;
			}
		}
	}
}
