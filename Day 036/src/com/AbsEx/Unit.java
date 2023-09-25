package com.AbsEx;

public abstract class Unit {
	int x, y; // 좌표
	
	abstract void move(int x, int y);	//abstract가 없으면 세미콜론(;)으로 막으면 안됨, 몸통부가 있어야 함
	abstract void stop();
	abstract void message();
}
