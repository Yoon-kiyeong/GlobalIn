package com.my;

import java.util.Scanner;

/*
 * �л� ���� �Է¹ް�, �� �� ��ŭ�� ������ �Է¹޾� ��ü �л� ������ ��, ���, ������ ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
 * ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
 */
public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�л� �� �Է� : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		int sum = 0;
		double avg = 0;
		double deviation = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "�� �л� ���� �Է� : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
			avg = sum / num;
		}
		System.out.println("��: " + sum);
		System.out.println("���: " + avg);
		System.out.println("���� : ");
		for (int i = 0; i < arr.length; i++) {
			deviation = avg - arr[i];
			System.out.println(arr[i] + ": " + deviation);

		}

	}
}
