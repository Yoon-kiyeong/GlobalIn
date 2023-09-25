package com.AbsEx;

public class Marine extends Unit {

	public void StimPack() {
		System.out.println("스팀팩 사용");
	}

	@Override
	void move(int x, int y) {
		System.out.println("마린의 위치 이동 좌표는 x : " + x + ", y : " + y);
	}

	@Override
	void stop() {
		System.out.println("마린이 대기 상태에 있습니다");
	}

	@Override
	void message() {
		System.out.println("Message :: Standing back. ");
	}

}
