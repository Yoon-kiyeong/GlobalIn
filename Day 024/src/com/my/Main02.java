package com.my;

import java.util.Scanner;

/*
 * 사용자로부터 임의의 정수를 입력받아 1부터 입력받은 수까지의 전체의 합계, 짝수의 합계, 홀수의 합계를 출력하되 10단위로 출력하시오
 */
public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 숫자 : ");
		int a = sc.nextInt();
		int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0;
		for (int i = 1; i <= a; i++) {
			sum = sum + i;
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			}
			if (i % 2 == 1) {
				sum2 = sum2 + i;
			}
			if (i % 10 == 0) {
				System.out.println("1 ~ " + i + "까지의 합계 : " + sum);
				System.out.println("1 ~ " + i + "까지 짝수의 합계 : " + sum1);
				System.out.println("1 ~ " + i + "까지 홀수의 합계 : " + sum2);
				System.out.println();
			}
			if (i == a) {
				System.out.println("1 ~ " + a + "까지의 합계 : " + sum);
				System.out.println("1 ~ " + a + "까지의 짝수의 합계 : " + sum1);
				System.out.println("1 ~ " + a + "까지의 홀수의 합계 : " + sum2);
			}
		}
		sc.close();
	}
}
