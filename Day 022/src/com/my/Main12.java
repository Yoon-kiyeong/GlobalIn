package com.my;

import java.util.Scanner;

/*
 * ��]
 * 	Scanner Ŭ������ �̿��Ͽ� ������ �� ���� �׼��� �Է¤��پ� 5����, 1����, 1õ��, 500��, 100��, 50��, 10��, 1���� ���� �� �� ���� �����Ͻÿ�
 */
public class Main12 {
	public static void main(String[] args) {
		int money;
		int C50000 = 0;
		int C10000 = 0;
		int C1000 = 0;
		int C500 = 0;
		int C100 = 0;
		int C50 = 0;
		int C10 = 0;
		int C1 = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� : ");
		money = s.nextInt();

		C50000 = money / 50000;
		money = money % 50000;
		if (C50000 != 0)
			System.out.println("�������� " + C50000 + "��");

		C10000 = money / 10000;
		money = money % 10000;
		if (C10000 != 0)
			System.out.println("������ " + C10000 + "��");

		C1000 = money / 1000;
		money = money % 1000;
		if (C1000 != 0)
			System.out.println("õ���� " + C1000 + "��");

		C500 = money / 500;
		money = money % 500;
		if (C500 != 0)
			System.out.println("����� " + C500 + "��");

		C100 = money / 100;
		money = money % 100;
		if (C100 != 0)
			System.out.println("��� " + C100 + "��");

		C50 = money / 50;
		money = money % 50;
		if (C50 != 0)
			System.out.println("���ʿ� " + C50 + "��");

		C10 = money / 10;
		money = money % 10;
		if (C10 != 0)
			System.out.println("�ʿ� " + C10 + "��");

		C1 = money / 1;
		money = money % 1;
		if (C1 != 0)
			System.out.println("�Ͽ� " + C1 + "��");

	}
}
