package com.study;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1. �ٳ���, 2. ���  ? ");
		int input = sc.nextInt();
		if (input == 1) {
			Fruit fruit = new Banana();
			fruit.show();
		} else if (input == 2) {
			Fruit fruit = new Apple();
			fruit.show();
		}

	}
}
