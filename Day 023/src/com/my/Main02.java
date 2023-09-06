package com.my;

import java.util.Scanner;

/*
 * 2���� ��鿡�� ���簢���� Main01�� ����.
 * ���簢���� �����ϴ� ����(x1,y1),(x2,y2)�� �Է¹޾� (100,100),(200,200)�� �� ������
 * �̷���� ���簢���� �浹�ϴ����� �Ǻ��ϴ� ���α׷��� �����Ͻÿ�
 * ��, if���� �������� Ȱ��
 * 
 * �� ���� Ǯ�̿� �Ʒ��� �޼ҵ带 Ȱ���Ͻÿ�
 * public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
    if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
        return true;
     else
        return false;
}
 */

public class Main02 {
	public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2) {
		if ((x >= rectx1 && x <= recty1) && (y >= rectx2 && y <= recty2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("x1, x2�� ��ǥ : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("y1, y2�� ��ǥ : ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		boolean a = inRect(x1,x2,100,100,200,200);
		boolean b = inRect(y1,y2,100,100,200,200);
		
		if(a == true || b == true) {
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		} else {
			System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");
		}
		
		sc.close();
	}
}
