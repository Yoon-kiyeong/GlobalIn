package com.my;

import java.io.*;

/* ǥ�� �� ���
 * import java.io.InputStreamReader;
 * �ݵ�� �޼ҵ� �ڿ� throws IOException ó���� �ؾ� ��
 */

public class Main04 {
	public static void main(String[] args) throws IOException {
		System.out.print("���� �Է� : ");
		int i = System.in.read();
		System.out.println("ASCII �ڵ� �Է� : " + i);
		System.in.read();
		System.in.read();
//		System.out.println("�Է¹��� �ƽ�Ű �ڵ� �� : " + i);
		
		System.out.print("���� �Է� : ");
		char ch = (char)System.in.read(); //char������ ����ȯ ��Ŵ���ν� ���� ����
		System.in.read();
		System.in.read();
		System.out.println("�Է¹��� ���� : " + ch );
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = System.in.read() - 48;
//		System.in.read();
//		System.in.read();
		System.in.skip(2);
		System.out.print("���� �ϳ� �Է� : ");
		int num2 = System.in.read() - 48;
		System.out.println("�Է¹��� ���� : " + num);
		System.out.println("�Է¹��� ���� : " + num2);
	}
}
