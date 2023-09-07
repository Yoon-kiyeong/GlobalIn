package com.my;

import java.util.Scanner;

public class Main08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력한 정수의 개수 : ");
		int a = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		float avg = 0.f;
		
		while(a > cnt) {
			System.out.print("정수 입력 : ");
			int b = sc.nextInt();
			
			sum = sum + b;
			avg = (float)sum / a;
			cnt++;
		}
		System.out.printf("평균 : %.2f%n", avg);
	}
}
