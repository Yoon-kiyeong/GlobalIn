package com.my;

import java.util.Scanner;

public class Main09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�� �� �Է� : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0, temp;
		System.out.println("�Է��� �� �� : " + x + "," + y);

		if (x > y) {
			temp = x;
			x = y;
			y = temp;
		}
		for (; x <= y; x++) {
			sum += x;
		}
		System.out.println("�հ� : " + sum);
	}
}
