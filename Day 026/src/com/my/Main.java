package com.my;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("행의 단 입력 : ");
		int num = sc.nextInt();

		for (int i = 2; i <= 9; i += num) {
			for (int j = 1; j <= 9; j++) {
				for (int k = i; k < i + num; k++) {
					if (k >= 10) {
						break;
					}
					System.out.print(k + " * " + j + " = " + k * j + "\t");
				}
				System.out.println("");
			}
			System.out.println();
		}
	}
}
