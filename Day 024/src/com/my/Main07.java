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
				System.out.println("���α׷� ����");
				break;
			}
			System.out.println("�հ� : " + sum);
		}
		sc.close();
	}
}
