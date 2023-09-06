package com.my;

import java.util.Scanner;

public class Main09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("두 수 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0, temp;
		System.out.println("입력한 두 수 : " + x + "," + y);

		if (x > y) {
			temp = x;
			x = y;
			y = temp;
		}
		for (; x <= y; x++) {
			sum += x;
		}
		System.out.println("합계 : " + sum);
	}
}
