package com.my;

class SuperEx02 {
	protected double area;
	private String title;

	public SuperEx02() {

	}

	public SuperEx02(String title) {
		this.title = title;
	}

	public void write() {
		System.out.println(title + area);
	}
}

class Circle extends SuperEx02 {

	public Circle(String title) {
		super(title);
	}
	
	public void calc(int r) {
		area = r * r * 3.14;
		write();
	}
}

class Rect extends SuperEx02 {
	private int w, h;
	
	public Rect() {
		
	}
	
	public void calc(int w, int h) {
		this.w = w;
		this.h = h;
		area =(double) (w * h);
		write();
	}
	
	@Override
	public void write() { //오버라이딩
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("사각형 : " + area);
	}
}

public class Main02 {
	public static void main(String[] args) {
		Rect r = new Rect();
		Circle c = new Circle("원 : ");
		
		r.calc(10, 5);
		c.calc(30);
		
	}
}
