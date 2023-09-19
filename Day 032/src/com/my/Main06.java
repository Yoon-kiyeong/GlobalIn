package com.my;

import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�");
	}
}

class MonthScedule {
	private Day[] days; // Day ��ü �迭
	private int dayNum = 30;
	int num;
	int day;

	Scanner sc = new Scanner(System.in);

	public void display() {
		days = new Day[dayNum];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}

		System.out.println("�̹� �� ������ ���� ���α׷�");
		do {
			System.out.print("�Է�:1, ����:2, ������:3 : ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				do {
					System.out.print("��¥(1~30) : ");
					day = sc.nextInt();
					day--;

					if (day < 0 || day > dayNum)
						;
					{
						System.out.println("��¥�� �ٽ� �Է��� �ּ���");
					}
				} while (day < 0 || day > dayNum);
				System.out.print("���� : ");
				String work = sc.next();
				days[day].set(work);
				break;
			case 2:
				System.out.println("��¥(1 ~ 30) : " + (day + 1));
				System.out.print((day + 1) + "���� �� ���� ");
				days[day].show();
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
		} while (num > 0 && num < 3);
	}
}

public class Main06 {
	public static void main(String[] args) {
		MonthScedule ms = new MonthScedule();
		ms.display();
	}
}
