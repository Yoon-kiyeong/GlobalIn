package com.my;

/* ����(Variable)
 * - �� �ϳ��� ���� ������ �� �ִ� �޸� ����
 * 
 * ������ ���� ���
 * �ڷ��� ������
 * int 		  aa = 100; // ������ ����� �ʱ�ȭ
 * ������ �ڷ��� ������ = ó���� ����� ���� �ǹ���
 * 
 * ������ �ʱ�ȭ : ������ ����ϱ� ���� ó������ ���� �����Ѵٴ� �ǹ�
 */

public class Main02 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		System.out.println(a);
		System.out.println(b);
		
		a = b + 10;
		b = b + 1; // b++;

		int e;
		e = a;
		a = b;
		b = e;
//		a = b;
//		b = a;
		System.out.println(e);
		System.out.println(a);
		System.out.println(b);
	}
}
