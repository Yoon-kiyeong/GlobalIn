package com.my;
/*
 * 1 ~ �Է��� �������� �հ踦 ���ϴ� ���α׷�
 * ���� 1) ���� �Է� : 1 ~ 1000
 * ���� 2) ���� ó�� ���
 * ���� 3) ���
 * 
 */

import java.util.Scanner;

class Main11 {
	private int number;

	public void input() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("���� �Է� : ");
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
		System.out.print("1 ~ " + number + "������ �հ� : " + s);
	}

	public static void main(String[] args) {
		Main11 ma = new Main11();
		ma.input();
		int s = ma.num();
		ma.print(s);
	}
}
