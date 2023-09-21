package com.my;

class SuperTest {
	protected double area;

	public void write(String title) {
		System.out.println(title + area);
	}
}

class Rect1 extends SuperTest {
	private int w, h;

	public void calc(int w, int h) {
		this.w = w;
		this.h = h;

		area = this.w * this.h;
		write("�簢�� : ");
	}

	/*
	 * @Override : annotation -> ���α׷��� ���� methoddata ���, �����Ϸ��� �ܺ� Ŭ�������� ���α׷��� ���� ����
	 * ����
	 * 
	 */
	@Override
	public void write(String title) { // �������̵�(�θ�Ŭ�������� ��۹޾� �������� �޼ҵ�)
		System.out.println("w : " + w + " , h : " + h);
		System.out.println(title + area);

	}
}

public class Main04 {
	public static void main(String[] args) {
		Rect1 rr = new Rect1();
		rr.calc(10, 5);
	}
}
