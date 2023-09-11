package com.my;

import java.util.Scanner;

/*
 * 사용자로부터 정수를 입력받아 총합계를 구하는 프로그램을 구하시오
 * 단, 0을 입력하면 프로그램을 종료
 */
public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int a;
		int sum = 0;
		do {
			a = sc.nextInt();
			sum = sum + a;
			System.out.println("총 합계 : " + sum);			
		} while (a > 0);
		System.out.println("프로그램 종료");
	}
}
