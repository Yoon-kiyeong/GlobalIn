package com.my;

import java.util.Scanner;

/*
 * �Էµ� ������ ����� ���ϴ� ���α׷��� ����
 * ���� ���� �Է��� ������ ������ ����ڷκ��� �Է¹޴´�.
 * �׸��� �Է��� ������ŭ �������� �Է¹޾Ƽ� ��հ��� ���
 * �Է¹��� ���� ����������, ��հ��� �Ҽ��� ���� 2�ڸ��� ���
 */
public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�Է��� ������ ���� : ");
		int a = sc.nextInt();
		int sum = 0;
		float avg = 0.f;

		for (int i = 1; i <= a; i++) {
			System.out.print("���� �Է� : ");
			int b = sc.nextInt();
			
			sum = sum + b;
			avg = (float)sum / a;
		}
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.2f", avg);
	}
}
