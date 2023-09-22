package com.my;

public class Tiger extends Animal{
	private String name;
	
	public Tiger() {
		name = getClass().getSimpleName();
	}
	
	@Override
	public String crying() {
		return "¿Í¾Ó!";
	}
	
	@Override
	public String getName() {
		return name;
	}
}
