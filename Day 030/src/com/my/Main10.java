package com.my;

import java.util.Scanner;

/*
 * 사각형의 넓이를 구하는 프로그램을 구현하시오.
 * 넓이 구하는 메소드와 출력 메소드로 구성하여 구현하시오
 * 둘레도 구해라
 * 가로와 세로 값은 입력받는다.
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

		System.out.print("가로의 길이 입력 : ");
		x = sc.nextInt();

		System.out.print("세로의 길이 입력 : ");
		y = sc.nextInt();

		result(x, y);

	}

}
