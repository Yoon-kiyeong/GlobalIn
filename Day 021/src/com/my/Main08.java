package com.my;

import java.util.Scanner;
public class Main08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է� : ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
		}
	}
}
