package com.my;

import java.util.Scanner;

public class Main15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("1���� 99 ������ ���ڸ� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		int ten = num / 10;
		int one = num % 10;

		if (num >= 1 && num <= 99) {
			if ((ten == 3 || ten == 6 || ten == 9) && (one == 3 || one == 6 || one == 9)) {
				System.out.println("�ڼ� ¦¦");
			} else if ((ten == 3 || ten == 6 || ten == 9) || (one == 3 || one == 6 || one == 9)) {
				System.out.println("�ڼ� ¦");
			}
		} else {
			System.out.println("������ ������ ������ϴ�");
		}
	}
}