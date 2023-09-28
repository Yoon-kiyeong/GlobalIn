package com.my;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�� ���� ���� ������ ũ�� �Է� : ");
		int num = sc.nextInt();

		StringStack ss = new StringStack();
		ss.arrSet(num);

		String data = "";
		do {
			System.out.print("���ڿ� �Է� : ");
			data = sc.next();
			if (!(data.equals("�׸�"))) {

				if (!ss.push(data)) {
					System.out.println("������ ������ �Է� �Ұ�");
				}
			}
		} while (!data.equals("�׸�"));

		System.out.print("���ÿ� ����� ���ڿ� : ");
		for (int i = 0; i < ss.capacity(); i++) {
			System.out.print(ss.pop() + " ");
		}
	}
}
