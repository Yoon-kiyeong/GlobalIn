package com.my;

import java.util.Scanner;

/*
 * ����ڷκ��� ������ �Է¹޾� ���հ踦 ���ϴ� ���α׷��� ���Ͻÿ�
 * ��, 0�� �Է��ϸ� ���α׷��� ����
 */
public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int a;
		int sum = 0;
		do {
			a = sc.nextInt();
			sum = sum + a;
			System.out.println("�� �հ� : " + sum);			
		} while (a > 0);
		System.out.println("���α׷� ����");
	}
}
