package com.my;

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("�ݶ�-1, ���̴�-2, ����ƾ-3, ���ڼ���-4, ���̽�-5, ���Ͻ�-6(0����)");

			int menu = sc.nextInt();

			if (menu == 0) {
				System.out.println("����");
				break;
			}

			switch (menu) {
			case 1:
				System.out.println("�ݶ�");
				break;
			case 2:
				System.out.println("���̴�");
				break;
			case 3:
				System.out.println("����ƾ");
				break;
			case 4:
				System.out.println("���ڼ���");
				break;
			case 5:
				System.out.println("���̽�");
				break;
			case 6:
				System.out.println("���Ͻ�");
				break;
			default:
				System.out.println("�޴��� �����ϴ�");
				break;
			}
		} while (true);
	}
}
