package com.my;
/*
 * 1 ~ 입력한 수까지의 합계를 구하는 프로그램
 * 조건 1) 범위 입력 : 1 ~ 1000
 * 조건 2) 연산 처리 기능
 * 조건 3) 출력
 * 
 */

import java.util.Scanner;

class Main11 {
	private int number;

	public void input() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("정수 입력 : ");
			number = sc.nextInt();
		} while (number < 1 || number > 1000);
	}

	public int num() {
		int s = 0;
		for (int i = 1; i <= number; i++) {
			s += i;
		}
		return s;

	}

	public void print(int s) {
		System.out.print("1 ~ " + number + "까지의 합계 : " + s);
	}

	public static void main(String[] args) {
		Main11 ma = new Main11();
		ma.input();
		int s = ma.num();
		ma.print(s);
	}
}
