package com.my;

import java.util.Scanner;

/*
 * while���� ����Ͽ� �޴��� �ݶ�, ���̴�, ����ƾ, ���ڼ���, ���̽�, ���Ͻ��� ������ ���Ǳ� ���α׷��� ����϶�
 * ��, 0�� �Է��ϸ� �����ϰ� �޴��� ���� ��� �޴��� �����ϴ�.
 */
public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("�ݶ�-1, ���̴�-2, ����ƾ-3, ���ڼ���-4, ���̽�-5, ���Ͻ�-6(0����)");

			int menu = sc.nextInt();

			if (menu == 0) {
				System.out.println("����");
				break;
			} else if (!(1 <= menu && menu <= 6)) {
				System.out.println("�޴��� �����ϴ�");
				continue;
			}
			if (menu == 1) {
				System.out.println("�ݶ�");
				continue;
			} else if (menu == 2) {
				System.out.println("���̴�");
				continue;
			} else if (menu == 3) {
				System.out.println("����ƾ");
				continue;
			} else if (menu == 4) {
				System.out.println("���ڼ���");
				continue;
			} else if (menu == 5) {
				System.out.println("���̽�");
				continue;
			} else if (menu == 6) {
				System.out.println("���Ͻ�");
				continue;
			}
		}
	}
}
