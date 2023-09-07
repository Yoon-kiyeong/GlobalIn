package com.my;

import java.util.Scanner;

/*
 * 3의 승수를 구하는 프로그램을 구현하시오
 * 
 * 승수 입력 : 
 * 3의 5승은 233입니다.
 */
public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("승수 입력 : ");
		int a = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= a; i++)
			result *= 3;
		System.out.println("3의 " + a + "승은 " + result + "입니다");
	}
}
