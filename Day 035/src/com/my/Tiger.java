package com.my;

public class Tiger extends Animal{
	private String name;
	
	public Tiger() {
		name = getClass().getSimpleName();
	}
	
	@Override
	public String crying() {
		return "�;�!";
	}
	
	@Override
	public String getName() {
		return name;
	}
}
