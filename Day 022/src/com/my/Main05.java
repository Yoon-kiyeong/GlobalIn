package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * switch��
 * 	1. �پ��� ó������ �ΰ� ���ǰ��� ���� �ϳ��� ó�����̳� ���� ���� ó������ �ѹ��� �����ϴµ� ���� ������ ����
 * 	2. if���� ���ǰ��� boolean��������, switch���� �������� ���ڿ���
 * 	3. break���� �ϳ��� ���ǰ����� �ϳ��� ���๮�� �ʿ��� ��� ����Ѵ�.
 * 	     ��, break���� ���� ��� ���� break���� ���������� ��� ������
 *  4. ���ڰ��� �񱳰� 1,2,3�� ��� ��ġ���� ���� ��� default���� ������
 *  5. ���� �� ���� cas�� �ڿ� ���� ���ǰ��� �ߺ����� �ʾƾ���
 */
public class Main05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�������� �Է� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		int math = Integer.parseInt(br.readLine());

		int sum = kor + eng + math;
		int avg = (sum / 3);
		System.out.printf("���� : %d, ��� : %d\n", sum, avg);
		avg = (sum / 3) / 10;
		switch (avg) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}