package com.my;

import java.util.Scanner;

/*
 * ����ڷκ��� ������ ������ �Է¹޾� 1���� �Է¹��� �������� ��ü�� �հ�, ¦���� �հ�, Ȧ���� �հ踦 ����ϵ� 10������ ����Ͻÿ�
 */
public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�Է��� ���� : ");
		int a = sc.nextInt();
		int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0;
		for (int i = 1; i <= a; i++) {
			sum = sum + i;
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			}
			if (i % 2 == 1) {
				sum2 = sum2 + i;
			}
			if (i % 10 == 0) {
				System.out.println("1 ~ " + i + "������ �հ� : " + sum);
				System.out.println("1 ~ " + i + "���� ¦���� �հ� : " + sum1);
				System.out.println("1 ~ " + i + "���� Ȧ���� �հ� : " + sum2);
				System.out.println();
			}
			if (i == a) {
				System.out.println("1 ~ " + a + "������ �հ� : " + sum);
				System.out.println("1 ~ " + a + "������ ¦���� �հ� : " + sum1);
				System.out.println("1 ~ " + a + "������ Ȧ���� �հ� : " + sum2);
			}
		}
		sc.close();
	}
}
