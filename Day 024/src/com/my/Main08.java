package com.my;

import java.util.Scanner;

public class Main08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է��� ������ ���� : ");
		int a = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		float avg = 0.f;
		
		while(a > cnt) {
			System.out.print("���� �Է� : ");
			int b = sc.nextInt();
			
			sum = sum + b;
			avg = (float)sum / a;
			cnt++;
		}
		System.out.printf("��� : %.2f%n", avg);
	}
}
