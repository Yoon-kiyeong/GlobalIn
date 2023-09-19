package com.my;

public class Main06 {

	private int n;
	public Main06() { // 인자가 없는 기본 생성자
		this(300);
		System.out.println("인자가 없는 생성자");
	}

	public Main06(int n) { // 인자가 있는 기본 생성자
		this.n = n; // this : 객체 자기 자신을 의미함
		System.out.println("인자가 있는 생성자");
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
