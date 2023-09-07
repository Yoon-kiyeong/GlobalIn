package com.my;

import java.util.Scanner;

/*
 * 팩토리얼을 계산하는 프로그램을 구현하시오
 * 사용자로부터 임의의 정수를 입력받아 입력받은 정수의 팩토리얼을 계산해서 출력하시오
 */
public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("팩토리얼 계산 : ");
		int factorial = sc.nextInt();
		int sum = 1;

		for (int i = factorial; i > 0; i--) {
			sum = sum * i;
		}
			System.out.println(factorial + "! = " + sum);
	}
}
