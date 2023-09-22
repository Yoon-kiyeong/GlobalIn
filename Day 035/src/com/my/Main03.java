package com.my;

class PointEx {
	private int x;
	private int y;

	public PointEx() {
	}

	public PointEx(int x) {
		this.x = x;
	}

	public PointEx(int x, int y) {
		this(x); // 자기 자신의 생성자 호출하는 this
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void disp() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}

public class Main03 extends PointEx {
	private int r;

	public Main03() {
	}

	public Main03(int x) {
		super(x);
	}

	public Main03(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public void disp() {
		super.disp();
		System.out.println("r : " + r);
	}
	
	public static void main(String[] args) {
		Main03 ma = new Main03();
		ma.disp();
	}
}
