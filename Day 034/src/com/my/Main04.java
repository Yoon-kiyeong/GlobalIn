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
		write("사각형 : ");
	}

	/*
	 * @Override : annotation -> 프로그램에 대한 methoddata 기술, 컴파일러나 외부 클래스에서 프로그램에 대한 설명
	 * 제공
	 * 
	 */
	@Override
	public void write(String title) { // 오버라이딩(부모클래스에서 상송받아 재정의한 메소드)
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
