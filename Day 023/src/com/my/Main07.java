package com.my;

/*
 * 1 ~ 100������ �� �߿���
 * 4�� ����� ����ϴ� ���α׷��� �����Ͻÿ�
 * ��, �� �ٿ� 5���� ���
 * 
 */
public class Main07 {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 100; i++) {
			if (i % 4 == 0) 
				System.out.print(i + "\t");
			if (i % 20 == 0)
				System.out.println();
		}
	}
}
