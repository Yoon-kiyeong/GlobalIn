package com.exception.one;

/*	다중 catch문
 * - 다중 catch문에서는 하위클래스 -> 상위 클래스 순서로 예외처리를 함(다향성)
 */

public class ExceptionEx04 {
	public static void main(String[] args) {
			System.out.println(1);
			System.out.println(2);
			try {
				System.out.println(3);
				System.out.println(10 / 0);
			} catch(ArithmeticException ae) {
				if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
			} catch(Exception e) {
				System.out.println("Exception");
			}		
	}
}
