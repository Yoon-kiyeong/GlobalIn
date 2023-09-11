package com.my;

import java.util.Scanner;

/*
 * 배열의 크기만큼 정수를 입력받아 평균을 구하는 프로그램을 구현
 */
public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];
		int sum = 0;
		double avg = 0;
		System.out.print(arr.length + "개의 정수 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];	//합계
			avg = sum / arr[i];
		}
		System.out.println("배열에 저장된 합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
