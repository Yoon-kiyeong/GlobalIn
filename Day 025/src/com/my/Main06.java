package com.my;

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("콜라-1, 사이다-2, 마운틴-3, 초코송이-4, 에이스-5, 웨하스-6(0종료)");

			int menu = sc.nextInt();

			if (menu == 0) {
				System.out.println("종료");
				break;
			}

			switch (menu) {
			case 1:
				System.out.println("콜라");
				break;
			case 2:
				System.out.println("사이다");
				break;
			case 3:
				System.out.println("마운틴");
				break;
			case 4:
				System.out.println("초코송이");
				break;
			case 5:
				System.out.println("에이스");
				break;
			case 6:
				System.out.println("웨하스");
				break;
			default:
				System.out.println("메뉴가 없습니다");
				break;
			}
		} while (true);
	}
}
