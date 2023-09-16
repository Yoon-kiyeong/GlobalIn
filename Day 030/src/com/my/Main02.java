package com.my;

/* 메소드 호출 방식
 * 1. 값에 의한 호출
 * 
 * 값에 의한 호출(Call by Value)
 * 	- 메소드 호출시 기본 자료형과 인자값으로 전달하는 방식
 */

public class Main02 {

	public int increase(int n) {
		n++;
		return n;
	}
	
	public static void main(String[] args) {
		int v1 = 100;
		
		Main02 ma = new Main02();
		int v2 = ma.increase(v1);
		System.out.println(v2);
	}
}
