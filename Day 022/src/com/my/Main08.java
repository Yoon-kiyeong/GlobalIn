package com.my;

import java.io.IOException;

/*
 * ����ڷκ��� ������ ���ĺ� �� ���ڸ� �Է¹޾� �Է¹��� ���ĺ��� ������ ��쿡�� ����ϴ� ���α׷��� �����Ͻÿ�
 * ���� : ��ҹ��ڸ� ��� �����ϰ� �̿��� ���ڰ� ������ ��� �Է¿��� ó���Ͻÿ�
 * 
 */
public class Main08 {
	public static void main(String[] args) throws IOException {

		System.out.print("���ĺ��� �Է��ϼ��� : ");
		char ch = (char) System.in.read();
		
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
				System.out.println("�����Դϴ�.");
			} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U') {
				System.out.println("�빮�� ���� �Դϴ�.");
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		
	}
}
