package com.my;

import java.util.Scanner;

/*
 * ���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� ����Ǿ� �ִ� ���� 3�� ����� ����ϴ� ���α׷��� �����Ͻÿ�
 */
public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� 10�� �Է�  : ");
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 3 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}