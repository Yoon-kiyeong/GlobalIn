package com.my;

import java.util.Scanner;

/*
 * 3�� �¼��� ���ϴ� ���α׷��� �����Ͻÿ�
 * 
 * �¼� �Է� : 
 * 3�� 5���� 233�Դϴ�.
 */
public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�¼� �Է� : ");
		int a = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= a; i++)
			result *= 3;
		System.out.println("3�� " + a + "���� " + result + "�Դϴ�");
	}
}
