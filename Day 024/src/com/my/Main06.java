package com.my;

import java.util.Scanner;

/*
 * �ÿ��ڷκ��� ���� �Է¹޾� �ش��ϴ� ���� ����ϴ� ���α׷��� �����Ͻÿ�
 * ��, 1 ~ 9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶�� ���α׷��� ������ �� �ֵ��� ����
 */
public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ϴ� �� �Է� : ");
		int dan = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			if (dan < 10 && dan > 0) {
				int j = dan * i;
				System.out.println(dan + " X " + i + " = " + dan * i);
			}
		}
		System.out.println("���α׷� ����");				
	}
}
