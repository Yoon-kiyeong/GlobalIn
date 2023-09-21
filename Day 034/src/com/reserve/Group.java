package com.reserve;

import java.util.*;

public class Group {
	// �¼��� Ÿ���� ����
	char type; // S, A, B

	// �¼��� ��ü�迭�� ����
	private Seat[] seats;

	private Scanner sc = new Scanner(System.in);

	public Group(char type, int num) {
		this.type = type;
		seats = new Seat[num]; // ��ü�迭�� ũ�⸦ ����

		for (int i = 0; i < seats.length; i++) {
			// �迭�� ũ�� ��ŭ ��ü�� ����
			seats[i] = new Seat();
		}
	}

	public boolean reserve() {
		int no;
		String name;

		System.out.print("�̸� : ");
		name = sc.next();

		System.out.print("��ȣ : ");
		no = sc.nextInt();

		if (no < 1 || no >= seats.length) {
			System.out.println("�߸� �Է��Ͻ� �¼� ��ȣ�Դϴ�");
			return false;
		}

		if (seats[no - 1].isOccupied()) { // �̹� ����� �¼���ȣ���
			System.out.println("�̹� ����� �¼���ȣ �Դϴ�");
			return false;
		}

		seats[no - 1].reserve(name);
		return true;
	}

	public void show() { // type�� ��ü �¼����
		System.out.print(type + " : ");
		for (int i = 0; i < seats.length; i++) {
			if (seats[i].isOccupied()) {
				System.out.print(seats[i].getName());
			} else {
				System.out.print("��");
			}
			System.out.print(" ");
		}
		System.out.println();
	}

	public boolean cancel() { // ���� type�¼��� ���
		show();
		System.out.print("�̸�  : ");
		String name = sc.next();
		if (name != null) {
			for (int i = 0; i < seats.length; i++) {
				if (seats[i].match(name)) {
					seats[i].cancel();
					return true;
				}
			}
			System.out.println("������ ��� �̸��� ã�� �� �����ϴ�.");
		}
		return false;
	}
}