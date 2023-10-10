package com.Generic;

public class GenericEx02<T> {

	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public <U> void print(U u) {
		System.out.println("T : " + t.getClass().getName());
		System.out.println("U : " + u.getClass().getName());
	}

	public static void main(String[] args) {
		GenericEx02<Integer> g = new GenericEx02<>();
		g.add(10);
		g.print("test");
	}
}
