package com.my;

public class Hospital {
	public void inject(Animal animal) {
		System.out.println(animal.getName() + "을 치료하기 위해 주사를 놓습니다");
		System.out.println(animal.crying());
	}
}
