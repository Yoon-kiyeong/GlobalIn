package com.AbsEx;

public abstract class Calculator {
	int a, b;
	
	public abstract int add(int a, int b);	//합을 구하는 추상 메소드
	public abstract int min(int a, int b);	//차를 구하는 추상 메소드
	public abstract double avg(int a[]); //평균을 구하는 추상 메소드
	
}
