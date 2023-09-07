package com.my;

import java.util.Scanner;

/*
 * 시용자로부터 단을 입력받아 해당하는 단을 출력하는 프로그램을 구현하시오
 * 단, 1 ~ 9단 사이의 수를 입력받은 상황이 아니라면 프로그램을 종료할 수 있도록 구현
 */
public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("원하는 단 입력 : ");
		int dan = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			if (dan < 10 && dan > 0) {
				int j = dan * i;
				System.out.println(dan + " X " + i + " = " + dan * i);
			}
		}
		System.out.println("프로그램 종료");				
	}
}
