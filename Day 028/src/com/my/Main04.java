package com.my;

import java.util.Random;
import java.util.Scanner;

/*
 * ����ڷκ��� �Է¹��� ������ ������ŭ
 * ������ �߻����� �迭�� �����ϰ�, �迭�� ����� ���� �� ���� ū ���� ���� ���� ����ϴ� ���α׷��� ����
 */
public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		System.out.print("�߻���ų ������ ���� �Է� : ");
		num = sc.nextInt();

		int arr[] = new int[num];

		Random random = new Random();

		// Random��ü�� ���� ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(45 + 1);
			System.out.printf("%4d", arr[i]);
		}

		// Math.random���� ���� ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			System.out.printf("%4d", arr[i]);
		}

		System.out.println();

		int max, min;
		max = min = arr[0];

		//�ִ�, �ּڰ� �˻��ϴ� for��
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) //arr[i]�� ���� max���� Ŭ ���
				max = arr[i]; //max = arr[i]�� ���� ��
			if (arr[i] < min) //arr[i]�� ���� min ���� ���� ���
				min = arr[i]; //min = arr[i]�� ���� ��
		}
		
		System.out.println("�ִ� : " + max);
		System.out.println("�ּڰ� : " + min);
	}
}
