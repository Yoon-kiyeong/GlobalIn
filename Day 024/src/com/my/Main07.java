package com.my;

import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		while (true) {
			int i = sc.nextInt();
			if (i >= 1) {
				sum += i;
			} else {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("합계 : " + sum);
		}
		sc.close();
	}
}
