package com.my;

import java.util.Scanner;

public class Main07 {

	public static int getInt(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str + " : ");
		int score = sc.nextInt();
		return score;
	}

	public static void main(String[] args) {
		int kor = getInt("���� ����");
		System.out.println("���� ������ : " + kor + "���Դϴ�");
	}
}
