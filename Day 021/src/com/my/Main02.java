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

		System.out.printf("±¹¾î : %d%n", kor);
		System.out.printf("¼öÇÐ : %d%n", math);
		System.out.printf("¿µ¾î : %d%n", eng);
		System.out.printf("ÃÑÁ¡ : %d%n", sum);
		System.out.printf("Æò±Õ : %.2f%n", avg);
		
		sc.close();
	}
}
