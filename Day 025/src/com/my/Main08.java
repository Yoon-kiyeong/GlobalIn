package com.my;

import java.util.Scanner;

/* ��
 * 	��, ��, ���� ������ �Է¹޾� ������ ����� ���ϰ�, ������ �����ϴ� ���α��� �����Ͻÿ�
 * A,B,C,D,F ���� ����(do ~ while)
 * ��, �� ������ ������ 100���� ��� �� ����.
 * ���� ������ ����� ��� �ٽ� �Է¹޵��� ���Ѵ�.
 * 
 */
public class Main08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor, eng, math = 0;

		do {
			System.out.print("���� ���� : ");
			kor = sc.nextInt();
		} while (0 > kor || kor > 100);

		do {
			System.out.print("���� ���� : ");
			eng = sc.nextInt();
		} while (0 > eng || eng > 100);

		do {
			System.out.print("���� ���� : ");
			math = sc.nextInt();
		} while (0 > math || math > 100);

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		switch ((int) avg / 10) {
		case 10:
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
