package com.my;

import java.util.Scanner;

/*
 * ��ǻ�Ϳ� ����� ������ ���� ���� �� ������ �����Ͻÿ�
 * ����ڰ� ���� �����Ѵ�.
 * ����ڰ� ���� ���� �� �� �ϳ��� �Է��ϰ� Enter�� ������ ��ǻ�ʹ� ���� ���� �� �߿��� �������� �ϳ��� �����Ͽ� ����Ѵ�.
 * ����ڰ� �Է��� ���� ��ǻ�Ͱ� ����� ���� ���Ͽ� ���� �̰������ �Ǵ��Ѵ�.
 * ����ڰ� ���� ���� �� ��� "�׸�"�̶�� �Է��ϸ� ���α׷��� �߷��Ѵ�.
 * ��, ���� ���� ���� String �迭�� �̿�, �����Լ�, ���Լ��� ����Ͻÿ�
 * 
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String user = "";
		String[] cpu = { "����", "����", "��" };
		int num = (int) (Math.random() * 3);
		while (true) {
			System.out.print("���� ���� �� : ");
			user = sc.next();
			if (user.equals("�׸�")) {
				break;
			}
			String b = cpu[(int) (Math.random() * 3)];
			System.out.println("����� : " + user + ", ��ǻ�� : " + b);
			if (user.equals("����")) {
				if (b.equals("��")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				if (b.equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
				if (b.equals("����")) {
					System.out.println("�����ϴ�");
				}
			} else if (user.equals("����")) {
				if (b.equals("����")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				if (b.equals("����")) {
					System.out.println("�����ϴ�");
				}
				if (b.equals("��")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			} else if (user.equals("��")) {
				if (b.equals("��")) {
					System.out.println("�����ϴ�");
				}
				if (b.equals("����")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				if (b.equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
		}
	}
}

//			switch (user) {
//			case "����":
//				if (num == 0) {
//					System.out.println("�����ϴ�");
//				} else if (num == 1) {
//					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
//				} else if (num == 2) {
//					System.out.println("����ڰ� �̰���ϴ�");
//				}
//				break;
//			case "����":
//				if (num == 0) {
//					System.out.println("����ڰ� �̰���ϴ�");
//				} else if (num == 1) {
//					System.out.println("�����ϴ�");
//				} else if (num == 2) {
//					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
//				}
//				break;
//			case "��":
//				if (num == 0) {
//					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
//				} else if (num == 1) {
//					System.out.println("����ڰ� �̰���ϴ�");
//				} else if (num == 2) {
//					System.out.println("�����ϴ�");
//				}
//				break;
//			}