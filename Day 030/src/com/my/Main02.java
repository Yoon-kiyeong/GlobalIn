package com.my;

/* �޼ҵ� ȣ�� ���
 * 1. ���� ���� ȣ��
 * 
 * ���� ���� ȣ��(Call by Value)
 * 	- �޼ҵ� ȣ��� �⺻ �ڷ����� ���ڰ����� �����ϴ� ���
 */

public class Main02 {

	public int increase(int n) {
		n++;
		return n;
	}
	
	public static void main(String[] args) {
		int v1 = 100;
		
		Main02 ma = new Main02();
		int v2 = ma.increase(v1);
		System.out.println(v2);
	}
}
