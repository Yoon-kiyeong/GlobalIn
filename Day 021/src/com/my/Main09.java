package com.my;

import java.util.Scanner;
/* ��) ����ڷκ��� ������ �⵵�� �Է¹޾� �������� ��������� �����ϴ� ���α׷��� �����Ͻÿ�
 * ��, if���� Ȱ���Ͽ� ���� 
 *
 * 
 */

public class Main09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("�Է��Ͻ� " + year + "�⵵�� �����Դϴ�");
		} else {
			System.out.println("�Է��Ͻ� " + year + "�⵵�� ����Դϴ�");
		}
		sc.close();
	}
}
