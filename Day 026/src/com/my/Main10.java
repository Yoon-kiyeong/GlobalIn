package com.my;

import java.util.Scanner;

/*
 * 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 저장되어 있는 수중 3의 배수만 출력하는 프로그램을 구현하시오
 */
public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 10개 입력  : ");
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 3 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
