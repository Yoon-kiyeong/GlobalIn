package com.my;

import java.util.Scanner;

/*
 * Ŀ�� �޴��� ������ �˷��ִ� ���α׷��� �����Ͻÿ�
 * Ŀ������: ����������, īǪġ��, ī��󶼴� 3,500���̰�, �Ƹ޸�ī��� 2000����
 */
public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޴��� �������ּ���");
		String menu = sc.next();
		int money = 10000;
		
		switch (menu) {
		case "����������":
			money = money - 3500;
			System.out.println("���������Ұ� ���Խ��ϴ�");
			System.out.println("�ܾ� : " + money);
			break;
		case "īǪġ��":
			money = money - 3500;
			System.out.println("īǪġ�밡 ���Խ��ϴ�");
			System.out.println("�ܾ� : " + money);
			break;
		case "ī���":
			money = money - 3500;
			System.out.println("ī��󶼰� ���Խ��ϴ�");
			System.out.println("�ܾ�  : " + money);
			break;
		case "�Ƹ޸�ī��":
			money = money - 2000;
			System.out.println("�Ƹ޸�ī�밡 ���Խ��ϴ�");
			System.out.println("�ܾ� : " + money);
		} 
	}
}
