package com.my;

import java.util.Scanner;

/*
 * ����ڷκ��� �ϳ��� ���ڸ� �Է¹޾� �� �� ��ŭ 3�� ����� ����ϴ� ���α׷��� ����
 */
public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int three = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= three; i++) {
			System.out.print((i *3) + "\t");
		}
	}
}
