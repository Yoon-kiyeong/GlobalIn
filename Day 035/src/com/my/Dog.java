package com.my;

public class Dog extends Animal {

	private String name;

	public Dog() {
		name = getClass().getSimpleName(); // Ŭ������ �̸��� �������� �޼ҵ�
	}

	@Override
	public String crying() {
		return "�߿�";
	}

	@Override
	public String getName() {
		return name;
	}

}
