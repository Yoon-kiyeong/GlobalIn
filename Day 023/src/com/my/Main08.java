package com.my;

import java.util.Scanner;

/*
 * ���� ������ �Է¹޾� �Է¹��� �� ��ŭ ����� ���Ͻÿ�
 * ���� : ���� ������ �ԷµǸ� �����ϰ� ����� ���Ͻÿ�
 */

public class Main08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, cnt = 0;
		float avg = 0.f;

		for (;;) {
			System.out.print("���� ���� �Է� : ");
			int i = sc.nextInt();
			cnt++;
			System.out.println(cnt);
			sum += i;
			avg = sum / cnt;

			if (i < 0) {
				System.out.println("���α׷� ����");
				System.out.println("��� : " + avg);
				break;
			} else {
				System.out.println("�հ� : " + sum);
				System.out.println("��� : " + avg);
			}
		} 
	}
}
