package com.my;

import java.util.Scanner;

/*
 * Scanner Ŭ������ �̿��� 2�ڸ��� ���� (10 ~ 99)�� �Է¹ް�, 10�� �ڸ��� 1�� �ڸ��� �������� �����ϴ� ���α׷��� �����Ͻÿ�
 * �ֿ� ������ : /, %������ Ȱ��
 * 
 * ��� ���
 * 2�ڸ� ���� �Է� : 77
 * Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�!
 */
public class Main11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2�ڸ� ���� �Է� : ");
		int num = sc.nextInt();
		if(num % 11 == 0) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		} else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�!");
		}
	}
}
