package com.my;

import java.util.Scanner;

/* ��ø if��
 * 
 * ��) ������ �г��� �Է¹޾� 60�� �̻��̸� �հ�, �̸��̸� ���հ��� ����Ѵ�.
 * ��, 4�г��� ��� 70�� �̻��̾�߸� �հ��̴�. (�г��� 1�г���� 4�г������ �����Ѵ�)
 * 
 * 
 */
public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int score = sc.nextInt();
		System.out.print("�г� : ");
		int grade = sc.nextInt();

//		if ((score >= 60 && grade < 4) || (score >= 70 && grade == 4)) {
//			System.out.println("�հ��Դϴ�.");
//		} else if ((score > 101) || (grade > 4)) {
//			System.out.println("���� Ȥ�� �г� �Է��� �߸��Ǿ����ϴ�");
//		} else {
//			System.out.println("���հ��Դϴ�.");
//		}

		if (score >= 60) {
			if (grade != 4) {
				System.out.println("�հ��Դϴ�");
			} else if (score >= 70) {
				System.out.println("�հ��Դϴ�");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
		}
	}
}
