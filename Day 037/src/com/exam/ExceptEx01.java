package com.exam;

import java.util.Scanner;

/*
 * �� ������ �Է¹޾� �������� �ϰ� ���� ���ϴ� ���α׷��� �����Ͻÿ�
 * ��, ����ڰ� ������ ���� 0�� �Է� �Ǿ��� �� ArithemticException�� �߻���Ű���� ����ó��
 * 
 * ���
 * ������ �� : 100
 * ���� �� : 0
 * 
 * consoleȭ�鿡 ������ ���� ����ϸ� ��
 * Exception in thread "main" java.lang.ArithemticException : / by zero
 */
public class ExceptEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� : ");
		int a = sc.nextInt();
		System.out.print("���� �� : ");
		int b = sc.nextInt();
		System.out.println(a / b);
	}
}
