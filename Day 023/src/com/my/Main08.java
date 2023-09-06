package com.my;

import java.util.Scanner;

/*
 * 양의 정수만 입력받아 입력받은 수 만큼 평균을 구하시오
 * 조건 : 음의 정수가 입력되면 종료하고 평균을 구하시오
 */

public class Main08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, cnt = 0;
		float avg = 0.f;

		for (;;) {
			System.out.print("양의 정수 입력 : ");
			int i = sc.nextInt();
			cnt++;
			System.out.println(cnt);
			sum += i;
			avg = sum / cnt;

			if (i < 0) {
				System.out.println("프로그램 종료");
				System.out.println("평균 : " + avg);
				break;
			} else {
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + avg);
			}
		} 
	}
}
