package com.my;

import java.util.Scanner;

public class Main09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¼� �Է� : ");
		int a = sc.nextInt();
		int result = 1;
		int cnt = 1;
		
		while(a >= cnt) {
			result *= 2;
			cnt++;
		} System.out.println("2�� " + a + "���� " + result + "�Դϴ�");
		sc.close();
	}
}
