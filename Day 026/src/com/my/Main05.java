package com.my;

import java.util.Scanner;

/*
 * �迭�� ũ�⸸ŭ ������ �Է¹޾� ����� ���ϴ� ���α׷��� ����
 */
public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];
		int sum = 0;
		double avg = 0;
		System.out.print(arr.length + "���� ���� : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];	//�հ�
			avg = sum / arr[i];
		}
		System.out.println("�迭�� ����� �հ� : " + sum);
		System.out.println("��� : " + avg);
	}
}
