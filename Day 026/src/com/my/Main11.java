package com.my;

import java.util.Scanner;

/*
 * Ű����� ������ �� ���� �׼��� �Է¹޾� �������� ������, õ����, 500��, 100��, 50��, 10��, 1��¥�� ������ ���� ����� ��ȯ�ϴ� ���α׷��� �����Ͻÿ�
 * ��, �迭�� �ݺ����� �̿��Ͽ� �����Ͻÿ�
 */
public class Main11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // ��ȯ��ų ���� ����
		int change = 0;
		
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		
		for(int i = 0; i < unit.length; i++) {
			change = money / unit[i];
			money = money % unit[i];
			System.out.println(unit[i] + "���� " + change + "��");
		}
	}
}