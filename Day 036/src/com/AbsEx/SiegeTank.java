package com.AbsEx;

public class SiegeTank extends Unit {

	void changeMode() {
		System.out.println("Yes, Sir!!");
	}
	
	@Override
	void move(int x, int y) {
		System.out.println("Move it! Move it! Siege Tank ==> x : " + x + ", y : "+ y);
	}

	@Override
	void stop() {
		System.out.println("Destination?");

	}

	@Override
	void message() {
		System.out.println("Message :: Go, SiegeTank!");
	}

}
