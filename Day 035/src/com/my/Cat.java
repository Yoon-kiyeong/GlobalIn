package com.my;

public class Cat extends Animal {
	private String name;
	
	public Cat() {
		name = getClass().getSimpleName();
	}
	
	@Override
	public String crying() {
		return "¸Û";
	}
	
	@Override
	public String getName() {
		return name;
	}
}
