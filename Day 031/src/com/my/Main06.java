package com.my;

public class Main06 {

	private int n;
	public Main06() { // ���ڰ� ���� �⺻ ������
		this(300);
		System.out.println("���ڰ� ���� ������");
	}

	public Main06(int n) { // ���ڰ� �ִ� �⺻ ������
		this.n = n; // this : ��ü �ڱ� �ڽ��� �ǹ���
		System.out.println("���ڰ� �ִ� ������");
	}

	public void write() {
		System.out.println("n : " + this.n);
	}

	public static void main(String[] args) {
		Main06 ma = new Main06();
		ma.write();
		System.out.println();

		Main06 ma1 = new Main06(30);
		ma1.write();
	}
}
