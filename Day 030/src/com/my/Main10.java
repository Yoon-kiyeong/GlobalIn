package com.my;

import java.util.Scanner;

/*
 * �簢���� ���̸� ���ϴ� ���α׷��� �����Ͻÿ�.
 * ���� ���ϴ� �޼ҵ�� ��� �޼ҵ�� �����Ͽ� �����Ͻÿ�
 * �ѷ��� ���ض�
 * ���ο� ���� ���� �Է¹޴´�.
 *
 */

public class Main10 {
	public static int square(int x, int y) {
		return x * y;
	}

	public static int circum(int x, int y) {
		return (x + y) * 2;
	}

	public static void result(int x, int y) {
		System.out.println();
		System.out.println(x + " * " + y + " = " + square(x, y));
		System.out.println(x + " + " + y + " * 2 = " + circum(x, y));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, sum = 0;

		System.out.print("������ ���� �Է� : ");
		x = sc.nextInt();

		System.out.print("������ ���� �Է� : ");
		y = sc.nextInt();

		result(x, y);

	}

}
