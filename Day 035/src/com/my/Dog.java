package com.my;

public class Dog extends Animal {

	private String name;

	public Dog() {
		name = getClass().getSimpleName(); // 클래스의 이름을 가져오는 메소드
	}

	@Override
	public String crying() {
		return "야옹";
	}

	@Override
	public String getName() {
		return name;
	}

}
