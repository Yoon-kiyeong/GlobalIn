package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1���� ������ �ΰ��� ���ڸ� �Է¹޾� �� �� ū���� ����ϴ� ���
 * 2���� ������ �ΰ��� ���ڸ� �Է¹޾� �� ������ �հ踦 ���ϴ� ���
 * 3���� ������ ������ ���� �Է¹޾� ū ������� ����ϴ� ���
 * 
 * �Լ��� �̿��Ͽ� ����
 * �Լ���
 * 1 : aaa()
 * 2 : bbb()
 * 3 : ccc()
 */

public class Main04 {

	public int aaa() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° ���� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public int bbb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù ��° ���� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}
		int sum = 0;
		for (int k = a; k <= b; k++) {
			sum += k;
		}
		return sum;
	}

	public String ccc(int x, int y, int z) throws IOException {
		if (y >= x && y >= z) {
			int temp = x;
			x = y;
			y = temp;
		} else if (z >= x && z >= y) {
			int temp = x;
			x = z;
			z = temp;
		}
		if (z >= y) {
			int temp = y;
			y = z;
			z = temp;
		}

		String abc = x + " >= " + y + " >= " + z;
		return abc;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;

		Main04 ma = new Main04();

		while (true) {
			System.out.print("1 : �ִ밪, 2: ���հ�, 3: �� ����, 4: ���� ");
			x = Integer.parseInt(br.readLine());
			if (x == 1) {
				int k = ma.aaa();
				System.out.println("�� ���� ���� �� ���� ū ������ " + k + "�Դϴ�");
			} else if (x == 2) {
				System.out.println(ma.bbb());
			} else if (x == 3) {
				System.out.print("ù ��° ���� �Է� : ");
				int firstNum = Integer.parseInt(br.readLine());
				System.out.print("�� ��° ���� �Է� : ");
				int secondNum = Integer.parseInt(br.readLine());
				System.out.print("�� ��° ���� �Է� : ");
				int thirdNum = Integer.parseInt(br.readLine());
				String str = ma.ccc(firstNum, secondNum, thirdNum);

				System.out.println("ū ������� " + str);
			} else if (x == 4) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
			System.out.println();
		}
		System.out.println("���� ��");
	}
}
