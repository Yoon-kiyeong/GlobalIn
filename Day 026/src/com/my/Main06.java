package com.my;

import java.util.Scanner;

/*
 *  ó�� �Է¹��� �ο��� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�, �Է¹��� ������ ����ϴ� ���α׷��� �����Ͻÿ�
 *  ��, �迭 Ȱ��
 */
public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�Է� ó���� �л� �� (��) : ");
		int num = sc.nextInt();

		String name[] = new String[num];
		String number[] = new String[num];
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("�̸� ��ȭ��ȣ �Է� : ");
			name[i] = sc.next();
			number[i] = sc.next();
		}

		for(int i = 0; i <name.length; i++) {
			System.out.println("�̸� :" + name[i] + " ��ȭ��ȣ : " + number[i]);
		}
	}
}
