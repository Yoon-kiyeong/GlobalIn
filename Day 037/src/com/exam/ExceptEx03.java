package com.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 3���� ������ �Է¹޾� �հ踦 ���ϴ� ���α׷��� �����Ͻÿ�
 * ��, ����ڰ� ������ �ƴ� ���ڸ� �Է����� �� �߻��ϴ� InputMismatchException ���ܸ� ó���Ͽ� �ٽ� �Է¹޵��� �����Ͻÿ�
 * 
 */
public class ExceptEx03 {
	public static void main(String[] args) {
		int arr[] = new int[3];
		int sum = 0;
		int num = 0;
		System.out.println("���� 3�� �Է�");

		while (true) {
			try {
				for (int i = 0; i < arr.length; i++) {
					Scanner sc = new Scanner(System.in);
					System.out.print((i + 1) + " : ");
					arr[i] = sc.nextInt();
					sum += arr[i];
				}
				System.out.println("�հ� : " + sum);
				break;
			} catch (InputMismatchException ie) {
				System.out.println("������ �ƴմϴ� �ٽ� �Է��ϼ���");
				sum = 0;
				continue;
			}
		}
//		for (int i = 0; i < 3; i++) {
//		System.out.print(i + " : ");
//
//		try {
//			num = sc.nextInt();
//		} catch (InputMismatchException ie) {
//			System.out.println("������ �ƴմϴ� �ٽ� �Է��ϼ���");
//			sc.nextLine();
//			i--;
//			continue;
//		}
//		sum += num;
//	}
//	System.out.println("�հ� : " + sum);	

	}
}
