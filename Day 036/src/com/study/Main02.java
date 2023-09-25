package com.study;

public class Main02 implements Dog, Cat{
	public static void main(String[] args) {
		Main02 main = new Main02();
		main.crying();
		main.show();
		main.one();
		main.two();
	}

	@Override
	public void crying() {
		System.out.println("야옹");
	}

	@Override
	public void show() {
		System.out.println("Hello, World!");
	}

	@Override
	public void two() {
		System.out.println("고양이");
	}

	@Override
	public void one() {
		System.out.println("강아지");
	}
}
