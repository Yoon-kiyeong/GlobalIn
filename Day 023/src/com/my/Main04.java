package com.my;

/*
 * ���ڸ� �Է¹޾� 3 ~ 5�� "��", 6 ~ 8�� "����", 9 ~ 11�� "����, 12 ~ 2�� ���
 * �׿� ���ڰ� �ԷµǸ� �߸��Է��̶������ϴ� ���α׷��� ����
 */
import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է��ϼ��� ");
		int month = sc.nextInt();

		if (month >= 3 && month <= 5) {
			System.out.println("��");
		} else if (month >= 6 && month <= 8) {
			System.out.println("����");
		} else if (month >= 9 && month <= 11) {
			System.out.println("����");
		} else if (month == 1 || month == 2 || month == 12) {
			System.out.println("�ܿ�");
		} else {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�");
		}

		System.out.print("���� �Է��ϼ��� ");
		int num = sc.nextInt();
		
		switch(num) {
		case 3: case 4: case 5:
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		case 1: case 2: case 12:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�");
			break;
		}
	}
}
