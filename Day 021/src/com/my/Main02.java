package com.my;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int kor, math, eng, sum = 0;
		// double avg = 0;
		
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();

		int sum = kor + math + eng;
		double avg = sum / 3.0;

		System.out.printf("���� : %d%n", kor);
		System.out.printf("���� : %d%n", math);
		System.out.printf("���� : %d%n", eng);
		System.out.printf("���� : %d%n", sum);
		System.out.printf("��� : %.2f%n", avg);
		
		sc.close();
	}
}
