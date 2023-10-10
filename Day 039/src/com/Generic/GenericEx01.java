package com.Generic;

class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public void Print() {
		System.out.println("static createBox 입니다");
	}
}

public class GenericEx01 {

	static Box createBox() {
		return new Box();
	}

	public static void main(String[] args) {
		Box<Integer> bi = new Box<>(); // 정수값만 저장하는 제너릭 객체

		bi.setT(100);
		bi.setT(new Integer(50));

		Integer i = bi.getT();
		System.out.println(i);

		Box<String> bs = new Box<>();
		bs.setT("Hello, World!");
		String s = bs.getT();
		System.out.println(s);

		Box<Integer> bx;
		bx = createBox();
		bx.Print();
	}
}
