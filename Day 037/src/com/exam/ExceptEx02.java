package com.exam;

import java.util.Scanner;

/*	
 * 	���� �� 1�� try ~ catch���� �̿��Ͽ� ������ 0���� ���� ��� "0���� ���� �� �����ϴ�"�� ����ϴ� ���α׷��� �����Ͻÿ�
 * 	�ݺ����� �̿��Ͽ� ���������� ó���Ǿ��� ��� ���α׷��� ����
 * 
 * ���
 * ������ �� : 100
 * ���� �� : 0
 * 0���� ���� �� �����ϴ�. �ٽ� �Է��ϼ���
 * ������ �� : 100
 * ������ �� : 5
 * 100�� 5�� ������ ���� 20�Դϴ�
 */

public class ExceptEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("������ �� : ");
			int a = sc.nextInt();
			System.out.print("���� �� : ");
			int b = sc.nextInt();
			try {
				System.out.println(a + "�� " + b + "�� ������ ���� " + a / b + "�Դϴ�");
				break;
			} catch (Exception e) {
				System.out.println("0���� ���� �� �����ϴ�, �ٽ� �Է��ϼ���");
				continue;
			}
		}
	}
}
