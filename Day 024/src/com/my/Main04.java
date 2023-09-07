package com.my;

import java.util.Scanner;

/*
 * 입력된 정수의 평균을 구하는 프로그램을 구현
 * 제일 먼저 입력할 정수의 개수를 사용자로부터 입력받는다.
 * 그리고 입력한 개수만큼 정수값을 입력받아서 평균값을 출력
 * 입력받은 값은 정수이지만, 평균값을 소수점 이하 2자리로 출력
 */
public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 정수의 개수 : ");
		int a = sc.nextInt();
		int sum = 0;
		float avg = 0.f;

		for (int i = 1; i <= a; i++) {
			System.out.print("정수 입력 : ");
			int b = sc.nextInt();
			
			sum = sum + b;
			avg = (float)sum / a;
		}
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);
	}
}
