package com.my;

import java.util.Scanner;

/*
 * ���丮���� ����ϴ� ���α׷��� �����Ͻÿ�
 * ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ ���丮���� ����ؼ� ����Ͻÿ�
 */
public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���丮�� ��� : ");
		int factorial = sc.nextInt();
		int sum = 1;

		for (int i = factorial; i > 0; i--) {
			sum = sum * i;
		}
			System.out.println(factorial + "! = " + sum);
	}
}
