package com.my;

import java.util.Scanner;
/*
 * ���� �߽��� ��Ÿ���� �� ���� �������� �Ǽ� ������ �Է¹޾ƶ�. �׸��� �Ǽ� ������ �ٸ� �� (x, y)�� �Է¹޾� �� ���� ���� ���ο� �ִ��� �Ǻ��Ͽ� ����϶�.
 */
public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �� x,y
		System.out.print("�� x : ");
		int x = sc.nextInt();
		System.out.print("�� y : ");
		int y = sc.nextInt();
		
		// ���� �߽�
		System.out.print("�� r_x : ");
		int r_x = sc.nextInt();
		System.out.print("�� r_y : ");
		int r_y = sc.nextInt();
		// ������
		System.out.print("������ r : ");
		double r = sc.nextDouble();
		
		double distance = Math.sqrt(((x-r_x)*(x-r_x))+((y-r_y)*(y-r_y)));
		
		if(distance < r) {
			System.out.println("�� x " + x + ", y " + y + "�� �� �ȿ� �ִ�.");
		} else {
			System.out.println("�� x " + x + ", y " + y + "�� �� �ȿ� ����.");
		}
	}
}
