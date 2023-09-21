package com.reserve;

import java.util.Scanner;

public class Concert {

	private Scanner sc = new Scanner(System.in);

	// �ܼ�Ʈ �̸�
	private String hallName;

	// �׷��� ��ü �迭�� ����
	private Group[] group = new Group[3];

	public Concert(String hallName) {
		this.hallName = hallName;

		group[0] = new Group('S', 10);
		group[1] = new Group('A', 10);
		group[2] = new Group('B', 10);
	}

	public void reserve() { // ����
		System.out.println("�¼� ����: S(1), A(2), B(3)");
		int type = sc.nextInt();
		if (type < 1 || type > 3) {
			System.out.println("�¼� ����� �߸� �Է��ϼ̽��ϴ�");
			return;
		}
		group[type-1].reserve();
	}

	public void search() {
		for(int i = 0; i < group.length; i++) {
			group[i].show();
		}
		System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�");
	}

	public void cancel() {
		System.out.print("�¼� ����: S(1), A(2), B(3)");
		int type = sc.nextInt();
		if (type < 1 || type > 3) {
			System.out.println("�¼� ����� �߸� �Է��ϼ̽��ϴ�");
			return;
		}
		group[type-1].cancel();
	}
	
	

	public void run() {
		System.out.println(hallName + " ���� ���α׷��Դϴ�");
		int choice = 0;

		while (choice != 4) {
			System.out.print("����: 1, ��ȸ: 2, ���: 3, ������: 4  --> ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				reserve();
				break;
			case 2:
				search();
				break;
			case 3:
				cancel();
				break;
			case 4:
				System.out.println("�ܼ�Ʈ, ���� ���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				break;
			}
		}

	}

}
