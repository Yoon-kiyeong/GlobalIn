package com.my;

/*
 * Stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스를 구현하시오
 */
public class StringStack implements Stack {
	public int arLength;
	public String arr[];
	int num = 0;

	public void arrSet(int arLength) {
		this.arLength = arLength;
		arr = new String[arLength];
	}

	@Override
	public int length() {
		return num;
	}

	@Override
	public int capacity() {
		return arLength;
	}

	@Override
	public String pop() {
		return arr[num];
	}

	@Override
	public boolean push(String val) {
		if (length() < capacity()) {
			arr[num++] = val;
			return true;
		} else {
			return false;
		}
	}

}
