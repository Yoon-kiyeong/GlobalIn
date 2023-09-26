package com.exception.one;

/* 예외처리 실행 순서
 * 
 * 
 * 
 */

public class ExceptionEx02 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			System.out.println(5);
		} finally {
			System.out.println(6);
		}
		System.out.println(7);
	}
}
