package com.my;

public class Main05 {
	public static void main(String[] args) {
		int num = -50;

		do {
			if (num % 5 == 0) {
				System.out.print("\n" + num + "\t");
				num++;
			} else {
				System.out.print(num + "\t");
				num++;
			}
		} while (num <= 1);
	}
}
