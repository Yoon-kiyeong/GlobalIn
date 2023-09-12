package com.my;

import java.util.Scanner;

/*
 * 학생 수를 입력받고, 그 수 만큼의 정수를 입력받아 전체 학생 점수의 합, 평균, 편차를 구하여 결과를 출력하는 프로그램을 구현한다.
 * 단, 배열을 활용하여 처리할 수 있도록 한다.
 */
public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수 입력 : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		int sum = 0;
		double avg = 0;
		double deviation = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번 학생 점수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
			avg = sum / num;
		}
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("편차 : ");
		for (int i = 0; i < arr.length; i++) {
			deviation = avg - arr[i];
			System.out.println(arr[i] + ": " + deviation);

		}

	}
}
