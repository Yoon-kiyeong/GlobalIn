package com.my;

public class Main01 {
	public int sum(int i, int j) { // sum�̶�� �Լ��̸�, ���ڰ��� i,j��� ������ ���ؼ� ���޹޴´�.
		System.out.println(i + j);
		return i + j; // �ΰ��� ���ڰ��� ������ ������ ���� �� �ᱣ�� ����
		// sum�̶�� �޼ҵ带 ȣ���� ������ ����� ������
	}

	public void add(int i, int j) { // �ν��Ͻ� �޼ҵ�
		// add��� �Լ��̸�, ���ڰ��� i,j��� ������ ���ؼ� ���� �޴´�.
		System.out.println(i + j); // �� ���� ���ڰ��� ������ ������ ���� �� ����� ����
		// add��� �޼ҵ带 ȣ���� ������ ����� ������
	}

	public static void min(int i, int j) {
		int q = i - j;
		System.out.println(q);
	}
	
	public int mul(int i, int j) {
		return i * j;
	}

	public static void main(String[] args) {
		Main01 ma = new Main01(); // ��ü ����
		//�޼ҵ� ȣ��
		ma.sum(10, 20);
		ma.add(20, 30);
		min(30, 20);
		System.out.println(ma.mul(3, 2));
	}
}
