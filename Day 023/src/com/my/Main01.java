package com.my;
/*
 * ��]
 * 	2���� ��鿡�� ���簢���� ���� ��� �𼭸��� �ϴ� ������ �𼭸��� �� ������ ǥ���Ѵ�.
 * (100,100)�� (200,200)�� �� ������ �̷���� �簢���� ���� ��, Scanner�� �̿��Ͽ� ���� x�� y�� ���� �Է¹ް� ��(x,y)�� �� �簢�� �ȿ� �ִ����� �Ǻ��ϴ� ���α׷��� �����Ͻÿ�
 * ��, if���� �������ڸ� Ȱ��
 */
import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((100 <= x && x <= 200) && (100 <= y && y <= 200)) {
			System.out.println("x�� y�� �簢�� �ȿ� �ֽ��ϴ�");
		} else {
			System.out.println("x�� y�� �簢�� �ȿ� �����ϴ�.");
		}
		sc.close();
	}
}
