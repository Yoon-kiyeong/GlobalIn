package com.my;

import java.util.Scanner;
/* 문) 사용자로부터 임의의 년도를 입력받아 윤년인지 평년인지를 판정하는 프로그램을 구현하시오
 * 단, if문을 활용하여 구현 
 *
 * 
 */

public class Main09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("입력하신 " + year + "년도는 윤년입니다");
		} else {
			System.out.println("입력하신 " + year + "년도는 평년입니다");
		}
		sc.close();
	}
}
