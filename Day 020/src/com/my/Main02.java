package com.my;

/* 변수(Variable)
 * - 단 하나의 값을 저장할 수 있는 메모리 공간
 * 
 * 변수의 선언 방법
 * 자료형 변수명
 * int 		  aa = 100; // 변수의 선언과 초기화
 * 변수의 자료형 변수명 = 처음에 저장된 값을 의미함
 * 
 * 변수의 초기화 : 변수를 사용하기 전에 처음으로 값을 저장한다는 의미
 */

public class Main02 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		System.out.println(a);
		System.out.println(b);
		
		a = b + 10;
		b = b + 1; // b++;

		int e;
		e = a;
		a = b;
		b = e;
//		a = b;
//		b = a;
		System.out.println(e);
		System.out.println(a);
		System.out.println(b);
	}
}
