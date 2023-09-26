package com.exam;

/*
 * ���ڿ��� ������ ��ȯ�� �� �߻��ϴ� NumberFormatException�� ó���ϴ� ���α׷��� �����Ͻÿ�
 * 
 * String[] stringNumber = {"23","222","3.141592"};
 * 
 * ���
 * ������ ��ȯ�� �� : 23
 * ������ ��ȯ�� �� : 222
 * 3.141592�� ������ ��ȯ �� �� �����ϴ�.
 */

public class ExceptEx04 {
	public static void main(String[] args) {
		String[] StringNumber = { "23", "222", "3.141592" };
		for (int i = 0; i < StringNumber.length; i++) {
			try {
				System.out.println("������ ��ȯ�� �� : " + Integer.parseInt(StringNumber[i]));
			} catch (NumberFormatException ne) {
				System.out.println(StringNumber[i] + "�� ������ ��ȯ�� �� �����ϴ�");
			}
		}
	}
}