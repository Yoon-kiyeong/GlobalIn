package com.AbsEx;

public class Marine extends Unit {

	public void StimPack() {
		System.out.println("������ ���");
	}

	@Override
	void move(int x, int y) {
		System.out.println("������ ��ġ �̵� ��ǥ�� x : " + x + ", y : " + y);
	}

	@Override
	void stop() {
		System.out.println("������ ��� ���¿� �ֽ��ϴ�");
	}

	@Override
	void message() {
		System.out.println("Message :: Standing back. ");
	}

}
