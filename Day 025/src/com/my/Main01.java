package com.my;
/*
 * -50���� 1������ ���� ����ϴ� ���α׷��� �ۼ��϶�
 * �̶�, �� �ٿ��� 5���� ������ ����ϰ�, ���� ���̸� �� ���ݸ�ŭ ����.
 */
public class Main01 {
	public static void main(String[] args) {
		int num = -50;
		
		while(num <= 1) {
			if(num % 5 == 0) {
				System.out.print("\n" + num + "\t");
				num++;
			} else {
				System.out.print(num + "\t");
				num++;
			}
		}
	}
}
