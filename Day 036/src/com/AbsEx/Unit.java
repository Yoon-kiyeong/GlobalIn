package com.AbsEx;

public abstract class Unit {
	int x, y; // ��ǥ
	
	abstract void move(int x, int y);	//abstract�� ������ �����ݷ�(;)���� ������ �ȵ�, ����ΰ� �־�� ��
	abstract void stop();
	abstract void message();
}
