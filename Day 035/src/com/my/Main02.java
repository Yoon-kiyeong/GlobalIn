package com.my;
/*
 * super
 * - �θ� ��ü�� ���۷���
 * - �θ� Ŭ������ ����� �ڼ� Ŭ������ ����� �ߺ����� �Ǿ� ���� �����ؾ� �ϴ� ��쿡�� super�� ����ϴ� ���̴�.
 * 
 * 
 * super() : ��ӿ����� ������
 * - �ڽ��� �⺻ �����ڿ��� super()�� �����Ǿ� ����
 * - ��ü ���� �� ������ �θ� Ŭ�����κ��� ������
 * - ��, �θ�� �����ڸ� ������ ���� ȣ���ؾ���
 * - this(), super()�»����� ���� �� �ĸ���ؾ���
 */

class Super {
	int a = 5;

	public Super() {
	}

	public Super(int x) {
		System.out.println("�θ� Ŭ������ ������ : " + x);
	}
}

class Sub extends Super {

	int a = 10;
	
	public Sub() {
		super(5);	// �Ű������� ������ �ִ� �θ��� �����ڸ� �ǹ���
		System.out.println("�ڽ� Ŭ������ ������ : " + a);
	}

	public void test() {
		System.out.println(this.a); // Sub Ŭ������ a�� ��µ�
		System.out.println(super.a); // �θ� Ŭ������ Super Ŭ������ a�� ��µ�
	}
}

public class Main02 {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.test();
	}
}
